package pairingmatrix

class NameListController {

    def index = {
        [nameList: Names.list()]
    }
}
