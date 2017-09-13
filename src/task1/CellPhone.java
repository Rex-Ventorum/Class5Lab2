
package task1;

import java.util.LinkedList;

public class CellPhone extends Phone{
    private static final int MAX_APP_STORAGE = 10;
    private LinkedList<CellPhoneApp> installedApps;
    
    public CellPhone(String phoneNumber){
        super(phoneNumber);
        installedApps = new LinkedList<>();
    }
    
    public LinkedList<CellPhoneApp> getInstalledApps(){return installedApps;}
    public void setInstalledApps(LinkedList<CellPhoneApp> installedApps){
        if(installedApps == null || installedApps.size() > MAX_APP_STORAGE) 
            throw new IllegalArgumentException("Installed App List may not be null and may not exciede storage limit");
        this.installedApps = installedApps; 
    }
    
    public void installApp(CellPhoneApp newApp){
        if(newApp == null) throw new IllegalArgumentException("App May Not Be Null");
        if(installedApps.size() >= MAX_APP_STORAGE) throw new IllegalArgumentException("Max Storage Reached no room for App");
        installedApps.add(newApp);
    }
    
    public void removeApp(CellPhoneApp deleteApp){
        installedApps.remove(deleteApp);
    }
}
