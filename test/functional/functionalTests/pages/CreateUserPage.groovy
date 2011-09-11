package functionalTests.pages

import geb.Page

class CreateUserPage extends Page{

    static url = "userList/create"
    static content = {

        userId{$("input", id:"user-id").value()}
        userName{$("input", id: "user-name").value()}
    }
}
