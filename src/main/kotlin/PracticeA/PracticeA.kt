fun main(args: Array<String>) {
    val pMediator = ConcreateMediator();
    val pColleagueA = ConcreteColleagueA();
    val pColleagueB = ConcreteColleagueB();
    pColleagueA.register(pMediator);
    pColleagueB.register(pMediator);

    pMediator.setColleague1(pColleagueA);
    pMediator.setColleague2(pColleagueB);

    pColleagueA.action();
    pColleagueB.action();
}

abstract class Colleague(){
    protected lateinit var mediator: Mediator
    fun register(mediator: Mediator) {
        this.mediator = mediator
    }
    abstract fun request(message: String)
}

class ConcreteColleagueA: Colleague() {
    fun action(){
        mediator.send("ConcreteColleagueA send", this)
    }
    override fun request(message: String) {
        println("Colleague A: $message")
    }
}

class ConcreteColleagueB: Colleague() {
    fun action(){
        mediator.send("ConcreteColleagueB send", this)
    }
    override fun request(message: String) {
        println("Colleague B: $message")
    }
}

abstract class Mediator{
    abstract fun send(message: String, theColleague: Colleague)
}

class ConcreateMediator: Mediator(){
    private lateinit var colleague1: Colleague
    private lateinit var colleague2: Colleague

    fun setColleague1(colleague1: Colleague){
        this.colleague1 = colleague1
    }

    fun setColleague2(colleague2: Colleague){
        this.colleague2 = colleague2
    }

    override fun send(message: String, theColleague: Colleague) {
        if(theColleague == colleague1){
            colleague2.request(message)
        }else{
            colleague1.request(message)
        }
    }
}