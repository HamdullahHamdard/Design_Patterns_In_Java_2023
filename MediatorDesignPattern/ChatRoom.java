package MediatorDesignPattern;
import java.util.Date;

// create Chatroom class that have show message method
public class ChatRoom {
    // the show method require user class object and string of message 
    public static void showMessage(
        User user, 
        String message
    ){
        // then show the user name ant it message with current date
        System.out.println(new Date().toString()+" ["+user.getName()+"]: "+message);
    }
}
