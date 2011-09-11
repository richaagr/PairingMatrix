package functionalTests.pages

import geb.Page

class CreateUserPage extends Page{

    static url = "userList/create"
    static content = {

        userId{$("input", id:"user-id")}
        userName{$("input", id: "user-name")}
        create{$("button", id: "create-user")}
    }
}
