
package bucoop.util;

import bucoop.model.Userbasic;
import bucoop.dto.UserbasicDto;
import bucoop.model.Userprivacy;
import bucoop.dto.UserprivacyDto;
import bucoop.dto.UseradditionalDto;
import bucoop.model.Useradditional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileUtilImpl implements ProfileUtil {
    
    @Autowired
    private UserbasicDto userBasicDto;
    
    @Autowired
    private UseradditionalDto userAdditionalDto;
    
    @Autowired
    private UserprivacyDto userPrivacyDto;
    
    @Override
    public Userbasic getProfileById(Integer userID) {
        return userBasicDto.getAppUserWithId(userID);
    }
    
    @Override
    public Useradditional getProfileAdditionalById(Integer userID) {
        return userAdditionalDto.getUserAdditionalWithId(userID);
    }
    
    @Override
    public Userprivacy getProfilePrivacyById(Integer userID) {
        return userPrivacyDto.getUserPrivacyWithId(userID);
    }
    
    @Override
    public boolean editProfile(String firstname, String lastname, String email, String about) {
        final Useradditional userAdditional = new Useradditional();

        userAdditional.setFirstname(firstname);
        userAdditional.setSurname(lastname);
        userAdditional.setEmail(email);
        userAdditional.setAbout(about);
        userAdditionalDto.persistUserAdditionalInfo(userAdditional);
        return true;
    }
}
