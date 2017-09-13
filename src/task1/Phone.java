
package task1;

public class Phone extends CommunicationDevice{
    private String phoneNumber;
    
    public Phone(String phoneNumber){
        setPhoneNumber(phoneNumber);
    }
    
    public void setPhoneNumber(String phoneNumber){
        if(!isValidNumber(phoneNumber)) throw new IllegalArgumentException("Invalid Phone Number");
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber(){return phoneNumber;}
    
    private boolean isValidNumber(String testNumber){
        return testNumber != null &&
               testNumber.matches("\\d{7-15}");
    }

}
