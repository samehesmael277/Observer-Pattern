import base.Observable
import base.Observer

class MyObserver(observable: Observable, private val name:String): Observer() {

    init {
        this.observable = observable
        observable.attach(this)
    }

    fun updateObservableState(state: String) {
        observable.setState(state)
    }

    override fun stateUpdated() {
        println("from observer: $name, observable state updated to: ${observable.getState()}")
    }
}