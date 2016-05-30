package bucoop.util;

import bucoop.model.Announcement;
import java.util.List;


public interface AnnouncementUtil {
    
    boolean addAnnouncement(String announcementtitle, String announcementbody);
    
    boolean deleteAnnouncement(Integer productID);
    
    Announcement getAnnouncementById(Integer categoryID);
    
    List<Announcement> getAnnouncementList();
}
