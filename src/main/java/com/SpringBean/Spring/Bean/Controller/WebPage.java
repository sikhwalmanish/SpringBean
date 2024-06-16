package com.SpringBean.Spring.Bean.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class WebPage {

    /*@GetMapping("/homepage")
    public String HomePage(@RequestParam String name, Model model){
        Users users = new Users("Manish",25);
        model.addAttribute("myUser",users);

        model.addAttribute("myName", name);

        List<Users> usersList = Arrays.asList(
             new   Users("ABC",25),
             new   Users("DEF",35),
             new   Users("GEF",50)
        );
        model.addAttribute("usersList", usersList);


        return "index";
    }*/

    @GetMapping("/homepage")
    public ModelAndView HomePage(@RequestParam(required = false, defaultValue = "MNO") String name, Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");

        Users users = new Users("Manish",25);
        mv.addObject("myUser", users);
        mv.addObject("myName", name);

        return mv;
    }
}
