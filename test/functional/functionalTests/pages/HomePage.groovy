package functionalTests.pages

import geb.Page

class HomePage extends Page{
    static at = { $("title").text() == "PAIRING MATRIX" }
    static url=""
    static content = {
        createUser{ $("a", name: "createNameList")}
        pairingRecord{ $("a", name: "savePairingRecord")}
        pairingStaircase{ $("a", name: "showPairingStaircase")}
    }
}
