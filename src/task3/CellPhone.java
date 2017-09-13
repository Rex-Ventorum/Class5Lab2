package task3;

import java.util.LinkedList;

public class CellPhone implements Phone{
    private static final int MAX_APP_STORAGE = 10;
   
    private boolean isConnected;
    private CommunicationDevice otherDivice;
    private String phoneNumber;
    private LinkedList<CellPhoneApp> installedApps;
    
    public CellPhone(String PhoneNumber){
        setPhoneNumber(phoneNumber);
    }
    
    //----------------------//
    //--- Getter Methods ---//
    //----------------------//
    
    public boolean isConnected(){return isConnected;}
    public CommunicationDevice getOtherDevice(){return otherDivice;}
    public String getPhoneNumber(){return phoneNumber;}
    public LinkedList<CellPhoneApp> getInstalledApps(){return installedApps;}
    
    //----------------------//
    //--- Setter Methods ---//
    //----------------------//
    
    public void setConnected(boolean isConnected){this.isConnected = isConnected;}
    
    public void setOtherDivice(CommunicationDevice otherDivice){
        if(otherDivice == null) throw new IllegalArgumentException("otherDivice may not be null");
        this.otherDivice = otherDivice;
        isConnected = true;
    }
    
    public void setPhoneNumber(String phoneNumber){
        if(!isValidNumber(phoneNumber)) throw new IllegalArgumentException("Invalid Phone Number");
        this.phoneNumber = phoneNumber;
    }
   
    public void setInstalledApps(LinkedList<CellPhoneApp> installedApps){
        if(installedApps == null || installedApps.size() > MAX_APP_STORAGE) 
            throw new IllegalArgumentException("Installed App List may not be null and may not exciede storage limit");
        this.installedApps = installedApps; 
    }
    
    //----------------------//
    //---- Other Methods ---//
    //----------------------//
    public void sendMessage(byte[] outgoingMsg){
        if(isConnected == false) throw new IllegalArgumentException("Connection has not been established");
        otherDivice.recieveMessage(outgoingMsg);
    }
    
    public void recieveMessage(byte[] incomingMsg){
        if(incomingMsg == null) throw new IllegalArgumentException("Cannote Recieve a Null Message");
        //TODO: Do something with incomingMsg
    }
    
    public void installApp(CellPhoneApp newApp){
        if(newApp == null) throw new IllegalArgumentException("App May Not Be Null");
        if(installedApps.size() >= MAX_APP_STORAGE) throw new IllegalArgumentException("Max Storage Reached no room for App");
        installedApps.add(newApp);
    }
    
    public void removeApp(CellPhoneApp deleteApp){
        installedApps.remove(deleteApp);
    }
    
    //----------------------//
    //- Validation Helper --//
    //----------------------//
    private boolean isValidNumber(String testNumber){
        return testNumber != null &&
               testNumber.matches("\\d{7-15}");
    }
}
