package pairingmatrix

class PairingRecordController {

    def index = {}

    def create = {}

    def show = {
        [pairingList: PairingRecord.findAll()]
    }

    def save = {
        def userName1 = User.findByUserName(params.user1)
        def userName2 = User.findByUserName(params.user2)
        if ((userName1 != null) && (userName2 != null)) {
            println(params)
            if ((PairingRecord.findByUser1AndUser2(params.user1, params.user2)==null) || (PairingRecord.findByUser1AndUser2(params.user2, params.user1)== null)){
               def recordDetail = new PairingRecord(user1: params.user1, user2: params.user2, noOfTimesPaired: params.noOfTimesPaired)
                if (recordDetail.save(flush: true)) {
                    redirect(action: 'show')
                }
            }
            else {
                def pairing = PairingRecord.findByUser1AndUser2(params.user1, params.user2)
                pairing.noOfTimesPaired = params.noOfTimesPaired
                pairing.save(flush: true)
                redirect(action: 'show')
            }
        }
        else{
            flash.error ="User name does not exist"
        }
    }
}
