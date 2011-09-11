package pairingmatrix

class PairingRecordController {

    def index = {}

    def create = {}

    def show={
         [pairingList: PairingRecord.findAll()]
    }

    def save = {
        def userName1 = User.findByUserName(params.user1)
        def userName2 = User.findByUserName(params.user2)
        if ((userName1 != null) && (userName2 != null)) {
            def recordDetail = new PairingRecord(user1: params.user1, user2: params.user2, noOfTimesPaired: params.noOfTimesPaired)
            if (recordDetail.save(flush: true)) {
                redirect(action:'show')
            }
            else{
                flash.error = "User Name does not exist"
            }
        }
    }

    def pairing = {

    }
}
