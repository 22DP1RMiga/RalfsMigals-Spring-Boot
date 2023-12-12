package rvt;

// import static org.junit.Assume.assumeTrue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/about")
   ModelAndView about() {
    CsvManager manager = new CsvManager("data/hobbies.csv");

    List hobbies = manager.getAllHobbies();

    ModelAndView modelAndView = new ModelAndView("about");
    modelAndView.addObject("hobbies", )

    String name = "Ralfs";
    String surname = "Migals";
    int age = 18;
    String group = "DP2-1";

    modelAndView.addObject("name", name);
    modelAndView.addObject("surname", surname);
    modelAndView.addObject("age", age);
    modelAndView.addObject("group", group);

    return modelAndView;
   }
    /* String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "about";
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
    */
}
