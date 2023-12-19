package rvt;

// import static org.junit.Assume.assumeTrue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/about")
   ModelAndView about(
        @RequestParam HashMap<String, String> allParams
   ) {

    String Name = allParams.get("name");
    String Surname = allParams.get("surname");
    String Age = allParams.get("age");
    String Group = allParams.get("group");

    /* System.out.println(
        allParams.get("name")
    ); */

    ModelAndView modelAndView = new ModelAndView("about");
    modelAndView.addObject("name", Name);
    modelAndView.addObject("surname", Surname);
    modelAndView.addObject("age", Age);
    modelAndView.addObject("group", Group);

    return modelAndView;
   }

   // HashMap works just like a dictionary in Python
//    HashMap<String, String> car1 = new HashMap<>();
//    car1.put("brand", "Ford");
//    car1.put("model", "Mustang");
//    car1.put("year", "1984");
   
//    car1.get("brand");  // Output: Ford
//    modelAndView.addObject("hobbies");

//    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
//         return "about";
//     }
    
//     String aboutMeAction(Model info) {
//         String name = "Ralfs";
//         String surname = "Migals";
//         int age = 18;
//         String group = "DP2-1";

//         info.addAttribute("name", name);
//         info.addAttribute("surname", surname);
//         info.addAttribute("age", age);
//         info.addAttribute("group", group);

//         return "about";
//     }
    
}
