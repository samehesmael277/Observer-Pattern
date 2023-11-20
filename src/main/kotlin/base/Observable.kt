package base

abstract class Observable {
    private val observers = ArrayList<Observer>()

    abstract fun setState(state: String)
    abstract fun getState(): String

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        observers.forEach { observer ->
            observer.stateUpdated()
        }
    }
}