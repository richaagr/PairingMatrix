package functionalTests.pages

import geb.Page

class HomePage extends Page{
    static at = { $("title").text() == "PAIRING MATRIX" }
    static url=""
    static content = {
        namesList{ $("a", name: "showNameList")}
        pairingRecord{ $("a", name: "savePairingRecord")}
        pairingStaircase{ $("a", name: "showPairingStaircase")}

    }
}
