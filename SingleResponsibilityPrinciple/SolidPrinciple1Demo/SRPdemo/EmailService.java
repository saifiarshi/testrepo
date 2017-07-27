package SRPdemo;

/**
 * Created by saifia on 7/25/2017.
 */
public class EmailService extends SecurityService {

        void sendEmail(String user,String email,String message){
            if(checkLocation(retrieveLocation(email))){
                if(checkPermission(user)){
                    if(exists(email)){
                        System.out.println("Email is sent to "+email+ " with message : "+message);
                    }
                }
            }
        }


    boolean exists(String email){
            //20 loc to check in DB
            if(email.endsWith("@yahoo.com")) {
                return true;
            }else{
                return false;
            }
        }

}
