package pl.sda.java26.minibog26;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

//@Component
@Controller
public class HelloControler {

    @GetMapping("/hello")
    public String helloPage() {

        return "helloView";
    }

    @GetMapping("/hello-user")
    public String helloUserPage(@RequestParam(name = "name") String nameParam, Model model){

        model.addAttribute("username", nameParam);
//        System.out.println(nameParam);
//        return "helloUserView";
        return "helloDynamicUserView";
    }

    @GetMapping("/hello-{name}")
    public String helloUserPageByPath(@PathVariable String name, Model model){

        model.addAttribute("username", name);
//        System.out.println(name);
//        return "helloUserView";
        return "helloDynamicUserView";
    }



}
