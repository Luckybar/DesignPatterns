fun main(args: Array<String>) {
    val context = Context()
    context.setsState(ConcreteStateA(context))

    context.request(35);
}

class Context{
    private var mState: State? = null

    fun setsState(state: State){
        println("setsState: $state")
        mState = state;
    }

    fun request(value: Int){
        mState?.handle(value);
    }
}

abstract class State(val context: Context){
    protected var mContext: Context? = null

    abstract fun handle(value: Int);
}

class ConcreteStateA(context: Context) : State(context) {
    override fun handle(value: Int){
        if(value > 10){
            println("A State: $value")
            context.setsState(ConcreteStateB(context))
            context.request(value)
        }
    }
}

class ConcreteStateB(context: Context) : State(context){
    override fun handle(value: Int){
        println("B State: $value")
        if(value > 20){
            context.setsState(ConcreteStateC(context))
            context.request(value)
        }
    }
}

class ConcreteStateC(context: Context) : State(context){
    override fun handle(value: Int){
        println("C State: $value")
        if(value > 30){
            context.setsState(ConcreteStateA(context))
            context.request(value)
        }
    }
}

