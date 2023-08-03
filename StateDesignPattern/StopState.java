package StateDesignPattern;

public class StopState implements State {

    //                                          Do action for start state
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);	
    }

    //  Start Actions
    public String toString(){
        return "Stop State";
    }
    }