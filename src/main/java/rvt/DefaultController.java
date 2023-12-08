package rvt;

import static org.junit.Assume.assumeTrue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/about")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    String aboutMeAction(Model info) {
        String name = "Ralfs";
        String surname = "Migals";
        int age = 18;
        String group = "DP2-1";

        info.addAttribute("name", name);
        info.addAttribute("surname", surname);
        info.addAttribute("age", age);
        info.addAttribute("group", group);

        return "about";
    }
}
