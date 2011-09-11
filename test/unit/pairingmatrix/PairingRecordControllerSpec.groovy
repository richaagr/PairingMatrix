package pairingmatrix

import grails.plugin.spock.ControllerSpec

class PairingRecordControllerSpec extends ControllerSpec {

    def "should be able to save pairing record"(){
       given:
        mockDomain(User)
        mockDomain(PairingRecord)
        PairingRecordController controller = new PairingRecordController()
        controller.params.user1 = 'abc'
        controller.params.user2 = 'def'
        controller.params.noOfTimesPaired ='2'

        when:
        controller.save()

        then:
        redirectArgs == [ controller:'PairingStaircase',action:'show']

    }
}
