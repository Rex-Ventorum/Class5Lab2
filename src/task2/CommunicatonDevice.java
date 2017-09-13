
package task2;

public abstract class CommunicatonDevice {
    private boolean isConnected;
    private CommunicatonDevice otherDivice;
    
     public abstract void sendMessage(byte[] outgoingMsg);
     public abstract void reiceveMessage(byte[] incomingMsg);
     
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
}
