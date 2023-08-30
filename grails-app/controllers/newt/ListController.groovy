package newt

class ListController {
    def inn() {
        bindData(person,params)
        render "hello world from controller"
        render(view: 'inn')
    }
    def inn2(){
        render "2 hello world from controller 2"

        render(view: 'inn2')
    }
}
