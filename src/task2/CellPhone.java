
package task2;

import java.util.LinkedList;

public class CellPhone extends Phone{
    private static final int MAX_APP_STORAGE = 10;
    private LinkedList<CellPhoneApp> installedApps;
    
    public CellPhone(String phoneNumber){
        super(phoneNumber);
        installedApps = new LinkedList<>();
    }
    
    //----------------------//
    //- Inhearted Methods --//
    //----------------------//
    
    @Override
    public void sendMessage(byte[] outgoingMsg) {
        if(isConnected() == false) throw new IllegalArgumentException("Connection has not been established");
        CommunicationDevice otherDivice = getOtherDivice();
        otherDivice.recieveMessage(outgoingMsg);
    }

    @Override
    public void recieveMessage(byte[] incomingMsg) {
        if(incomingMsg == null) throw new IllegalArgumentException("Cannote Recieve a Null Message");
        //TODO: Do something with incomingMsg
    }

    //----------------------//
    //--- Getter Methods ---//
    //----------------------//
    
    public LinkedList<CellPhoneApp> getInstalledApps(){return installedApps;}
    
    //----------------------//
    //--- Setter Methods ---//
    //----------------------//
    
    public void setInstalledApps(LinkedList<CellPhoneApp> installedApps){
        if(installedApps == null || installedApps.size() > MAX_APP_STORAGE) 
            throw new IllegalArgumentException("Installed App List may not be null and may not exciede storage limit");
        this.installedApps = installedApps; 
    }
    
    //----------------------//
    //--- Other Methods ----//
    //----------------------//
    public void installApp(CellPhoneApp newApp){
        if(newApp == null) throw new IllegalArgumentException("App May Not Be Null");
        if(installedApps.size() >= MAX_APP_STORAGE) throw new IllegalArgumentException("Max Storage Reached no room for App");
        installedApps.add(newApp);
    }
    
    public void removeApp(task1.CellPhoneApp deleteApp){
        installedApps.remove(deleteApp);
    }
}
