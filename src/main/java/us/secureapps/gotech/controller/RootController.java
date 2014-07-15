package us.secureapps.gotech.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import us.secureapps.gotech.model.OngardWell;
import us.secureapps.gotech.service.OngardWellService;
import us.secureapps.gotech.utility.Pager;
import us.secureapps.gotech.utility.PagerBuilder;

@Controller
public class RootController {
    
    static Logger logger = LoggerFactory.getLogger(RootController.class);
    
    //@Autowired
    //private SomeService someService;
    
    @Autowired
    private MessageSource messageSource;
    
    @RequestMapping(value = {"/", "/index"})
    public String indexPage() {
        return "public-home";
    }

}
