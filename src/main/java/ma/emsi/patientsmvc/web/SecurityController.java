package ma.emsi.patientsmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/user/403")
    public String notAuthorized(){
        return "403";
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
