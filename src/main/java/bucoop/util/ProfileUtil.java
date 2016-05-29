package bucoop.util;

import bucoop.model.Useradditional;
import bucoop.model.Userbasic;
import bucoop.model.Userprivacy;

public interface ProfileUtil {
    
    boolean editProfile(String firstname, String lastname, String email, String about);
    
    Userbasic getProfileById(Integer userID);
    
    Useradditional getProfileAdditionalById(Integer userID);
    
    Userprivacy getProfilePrivacyById(Integer userID);
    
}
