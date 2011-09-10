import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.HomePage
import pairingmatrix.User

class userListSpec extends PairingMatrixGebSpec{

    def 'should show the existing name list when Names List is clicked'(){
        given:
        new User(userId:"1",userName:"Richa").save(flush:true)
        to HomePage

        when:
        namesList.click()

        then:
        assert at(DisplayListPage)
    }
}