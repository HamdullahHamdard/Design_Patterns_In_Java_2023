package StateDesignPattern;

public class StartState implements State {

    //                                          Do action for start state
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);	
    }

    //  Start Action
    public String toString(){
        return "Start State";
    }
}