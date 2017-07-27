package SRPdemo;

import SRPdemo.LocationService;

/**
 * Created by saifia on 7/25/2017.
 */
public class SecurityService extends LocationService {
    boolean checkPermission(String user){
        //20 loc to check in DB
        if(user.equals("admin")) {
            return true;
        }else{
            return false;
        }
    }
    public static boolean userExists(String user){
        //20 loc to check in DB
        if(user.equals("admin")) {
            return true; //exists
        }else{
            return false; //not exists
        }
    }
}
