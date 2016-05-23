package bucoop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/adminconsole")
public class AdminConsoleController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayConsole(Model model) {
        return "adminconsole";
    }
}
