package itun.ttu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
      return "index";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String sendMail() {
        return "index";
    }
}
