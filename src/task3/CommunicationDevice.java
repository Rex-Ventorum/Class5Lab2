
package task3;

public interface CommunicationDevice {
    public abstract boolean isConnected();
    public abstract void setConnected();
    public abstract void setOtherDevice(CommunicationDevice otherDevice);
    public abstract CommunicationDevice getOtherDevice();
}
