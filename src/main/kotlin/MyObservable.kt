import base.Observable

class MyObservable: Observable() {
    private var state = "Silent"

    override fun setState(state: String) {
        this.state = state
        notifyObservers()
    }

    override fun getState(): String {
        return state
    }
}