import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.HomePage
import pairingmatrix.User
import functionalTests.pages.DisplayListPage
import functionalTests.pages.CreateUserPage

class userListSpec extends PairingMatrixGebSpec {

    def 'should go to create user page when CREATE USER is clicked'() {
        given:
        to HomePage

        when:
        createUser.click()

        then:
        assert at(CreateUserPage)
    }

    def 'should display user details when create is clicked'(){
        given:
        to CreateUserPage

        when:
        userId.value("1")
        userName.value("Richa")
        create.click()

        then:
        assert at(DisplayListPage)

        and:
        userTable.collect { it -> it.userId }.contains("1")
        userTable.collect { it -> it.userName }.contains("Richa")
    }
}
