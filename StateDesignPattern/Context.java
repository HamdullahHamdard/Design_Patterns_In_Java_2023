package StateDesignPattern;


// this has state that assign null to state
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    // set the current state
    public void setState(State state){
        this.state = state;
    }

    // return state as State
    public State getState(){
        return state;
    }
}
