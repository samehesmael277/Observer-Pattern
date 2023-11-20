fun main(args: Array<String>) {
    val observable = MyObservable()

    println("First Observable State: ${observable.getState()}")

    val mohamed = MyObserver(observable, "mohamed")
    val ahmed = MyObserver(observable, "ahmed")
    val sameh = MyObserver(observable, "sameh")

    println("First Round")
    mohamed.updateObservableState("ring")

    Thread.sleep(3000)
    println("Second Round")

    sameh.updateObservableState("vibrate")
}