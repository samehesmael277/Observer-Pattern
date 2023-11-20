package base

abstract class Observer {
    lateinit var observable: Observable
    abstract fun stateUpdated()
}