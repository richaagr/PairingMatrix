package pairingmatrix

class User {

    static mapping = {
        table 'userTable'
    }

    static constraints = {
        userId(unique: true, blank:false)
        userName(nullable: false)
    }


    String userId
    String userName
}
