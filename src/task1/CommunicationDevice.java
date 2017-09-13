package task1;

public class CommunicationDevice {
    
    private boolean isConnected;
    private CommunicationDevice otherDivice;

    public void sendMessage(byte[] outgoingMsg){
        if(isConnected == false) throw new IllegalArgumentException("Connection has not been established");
        otherDivice.recieveMessage(outgoingMsg);
    }
    
    public void recieveMessage(byte[] incomingMsg){
        if(incomingMsg == null) throw new IllegalArgumentException("Cannote Recieve a Null Message");
        //TODO: Do something with incomingMsg
    }
    
    //----------------------//
    //--- Getter Methods ---//
    //----------------------//
    
    public boolean isConnected(){return isConnected;}
    public CommunicationDevice getOtherDivice(){return otherDivice;}
    
    //----------------------//
    //--- Setter Methods ---//
    //----------------------//
    
    public void setConnected(boolean isConnected){this.isConnected = isConnected;}
    
    public void setOtherDivice(CommunicationDevice otherDivice){
        if(otherDivice == null) throw new IllegalArgumentException("otherDivice may not be null");
        this.otherDivice = otherDivice;
        isConnected = true;
    }
   
}
