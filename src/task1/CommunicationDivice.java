package task1;

public class CommunicationDivice {
    
    private boolean isConnected;
    private CommunicationDivice otherDivice;
    
    /**
        @param outgoingMsg can be anything (null Included)
        The otherDivice should validate if the message type is acceptable
    */

    public void sendMessage(Object outgoingMsg){
        if(isConnected == false) throw new IllegalArgumentException("Connection has not been established");
        otherDivice.recieveMessage(outgoingMsg);
    }
    
    public void recieveMessage(Object incomingMsg){
        if(messageCanBeReiceved(incomingMsg) == false) throw new IllegalArgumentException("Unable to recieve message");
        //TODO: Do something with incomingMsg
    }
    
    //----------------------//
    //--- Getter Methods ---//
    //----------------------//
    
    public boolean isConnected(){return isConnected;}
    public CommunicationDivice getOtherDivice(){return otherDivice;}
    
    //----------------------//
    //--- Setter Methods ---//
    //----------------------//
    
    public void setConnected(boolean isConnected){this.isConnected = isConnected;}
    
    public void setOtherDivice(CommunicationDivice otherDivice){
        if(otherDivice == null) throw new IllegalArgumentException("otherDivice may not be null");
        this.otherDivice = otherDivice;
        isConnected = true;
    }
    
    //--------------------------//
    //--- Validation Helpers ---//
    //--------------------------//
    
    private boolean messageCanBeReiceved(Object testMsg){
        return true;
    }
}
