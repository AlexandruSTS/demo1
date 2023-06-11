package message;

public class MessageObject {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageObject(String message) {
        this.message = message;
    }

    public MessageObject(){}

    private String message;


}