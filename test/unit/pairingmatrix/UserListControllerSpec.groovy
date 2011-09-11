package pairingmatrix

import grails.plugin.spock.ControllerSpec

class UserListControllerSpec extends ControllerSpec {

    def "should display user list"(){
        given:
        def newUser= [new User(userId:"1",userName:"Richa"),new User(userId: "2",userName: "abd")]
        mockDomain(User,newUser)

        when:
        def models=controller.show()

        then:
        models['userList'] == newUser
    }

    def "should be able to create user"(){
        given:
        mockDomain(User)
        UserListController controller = new UserListController()
        controller.params.id = '1'
        controller.params.name = 'Apple'

        when:
        controller.save()

        then:
        redirectArgs==[action: 'show']
    }
}
