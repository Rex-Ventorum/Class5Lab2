
package task3;

public interface CommunicationDevice {
    public abstract void sendMessage(byte[] outgoingMsg);
    public abstract void recieveMessage(byte[] incomingMsg);
    public abstract boolean isConnected();
    public abstract void setConnected();
    public abstract void setOtherDevice(CommunicationDevice otherDevice);
    public abstract CommunicationDevice getOtherDevice();
}
