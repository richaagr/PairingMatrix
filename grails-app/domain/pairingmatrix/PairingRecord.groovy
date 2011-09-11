package pairingmatrix

class PairingRecord {

    static constraints = {
        user1(nullable: false)
        user2(nullable: false)
        noOfTimesPaired(nullable: false)
    }

    String user1;
    String user2;
    String noOfTimesPaired;
}
