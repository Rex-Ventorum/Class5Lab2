
package task2;

public abstract class CommunicationDevice {
    private boolean isConnected;
    private CommunicationDevice otherDivice;
    
     public abstract void sendMessage(byte[] outgoingMsg);
     public abstract void recieveMessage(byte[] incomingMsg);
     
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
