package MediatorDesignPattern;

//                                                          Main Class of Mediator design pattern
public class MainClass {
    public static void main(String[] args) {
        // get the name of first user with object
        User hamdullah = new User("Hamdullah");

        // get the name of second user with object
        User hajiKhan = new User("Haji Khan");

        // send message from first user
        hamdullah.sendMessage("Hi There Haji Khan");

        // send message from second user
        hajiKhan.sendMessage("Hi There Hamdullah Hamdard");
    }
}



// class ordering 

// 1: ChatRoom  
// 2: User
// 3: MainClass

