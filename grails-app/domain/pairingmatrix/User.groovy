package pairingmatrix

class User {

    static constraints = {
        userId(unique: true, blank:false)
        userName(nullable: false)
    }

    String userId
    String userName
}
