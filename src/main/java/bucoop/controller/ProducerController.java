package bucoop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/producer")
public class ProducerController {
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayHome(Model model) {
        return "producer";
    }
}
