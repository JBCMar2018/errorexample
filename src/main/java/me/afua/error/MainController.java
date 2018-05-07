package me.afua.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showIndex()
    {
        return "index";
    }

    @RequestMapping("/testerror")
    public String showErrorTrigger()
    {
        return "errortrigger";
    }
}
