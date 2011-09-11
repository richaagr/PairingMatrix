package functionalTests.pages

import geb.Page
import geb.Module

class DisplayListPage extends Page{

    static url = "userList/show"
    static content={
    userTable {$("#user-list-table #showList tbody tr").collect {module UserRow, it} }
    }
}
class UserRow extends Module {
        static content = {
            cell { i -> $("td", i) }
            userId { cell(0).text() }
            userName { cell(1).text() }
        }
    }
