package nomina.soft.backend.dto;

public class Message {
    private String message;
    
    public Message(String message){
        this.setMessage(message);
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
