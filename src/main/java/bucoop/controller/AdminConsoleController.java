package bucoop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminConsoleController {

    @RequestMapping(value = "/adminconsole", method = RequestMethod.GET)
    public String displayConsole(Model model) {
        return "adminconsole";
    }
    
    @RequestMapping(value = "/useradmin", method = RequestMethod.GET)
    public String displayUseradmin(Model model) {
        return "useradmin";
    }
    
    @RequestMapping(value = "/productadmin", method = RequestMethod.GET)
    public String displayProductadmin(Model model) {
        return "productadmin";
    }
    
    @RequestMapping(value = "/produceradmin", method = RequestMethod.GET)
    public String displayProduceradmin(Model model) {
        return "produceradmin";
    }
    
    @RequestMapping(value = "/announcementadmin", method = RequestMethod.GET)
    public String displayAnnouncementadmin(Model model) {
        return "announcementadmin";
    }
}
