package us.secureapps.gotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin-gotech-prrc")
public class AdminController {
    
    @RequestMapping(value = {"","/"})
    public String indexPage() {
        return "admin-gotech-prrc/admin-home";
    }
    
}
