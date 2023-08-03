package MediatorDesignPattern;

public class User {

    // name of the current user with get and set Methods
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // user constractor that require the name of user
    public User(String name)
    {
        this.name = name;
    }

    public void sendMessage(String message){
        // pass this current class object and the maessage that pass in parameter
        ChatRoom.showMessage(this,message);
    }
    


    
}
