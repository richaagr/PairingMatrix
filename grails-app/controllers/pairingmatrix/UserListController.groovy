package pairingmatrix

class UserListController {

    def index = {
    }

    def create = {
    }

    def show = {
        [userList: User.findAll()]
    }

    def save = {
       def userDetail=new User(userId: params.id, userName: params.name)

        if(userDetail.save(flush:true)){
          redirect(action: 'show')
        }
    }
}
