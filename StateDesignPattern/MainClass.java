package StateDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        Context  context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

        
    }
    
}

// class ordering 

// 1: State  
// 2: StartState
// 3: StopState
// 4: Context
// 5: MainClass 
