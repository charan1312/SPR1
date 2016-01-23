package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.domain.RootBean;
import edu.asu.diging.tutorial.spring.service.Service;

@Controller
public class HomeController {
    
    @Autowired
    RootBean rootBean;
    
    @Autowired
    Service service;
    
    @RequestMapping(value="/y")
    public String home(Model model) {
        model.addAttribute("root", rootBean.getRoot());
        model.addAttribute("serv", service.getService());
        return "index";
    }

}
