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
@RequestMapping(value = "/admin-gotech-prrc/ongardwell")
public class OngardWellController {
    
    static Logger logger = LoggerFactory.getLogger(OngardWellController.class);
    
    @Autowired
    private OngardWellService ongardWellService;
    
    @Autowired
    private MessageSource messageSource;
    
    /**
     * Show the well search form.
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = {"", "/", "/search"}, method = RequestMethod.GET)
    public String showSearchForm(Model model) {
        
        //String message = "This is a message from the controller";
        //model.addAttribute("message", message);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String time = dateFormat.format(date);
        model.addAttribute("time", time);
        
        
        // Send an empty Well object
        OngardWell ongardWell = new OngardWell();
        model.addAttribute("ongardWell", ongardWell);
        
        
        return "admin-gotech-prrc/ongardwell-search-form";
    }
    
    // This should be converted to showning a list of wells matching input criteria.
    // It needs pagingation as well.
    // There are 80k wells and they should never all be returned at once
    //
    //@ModelAttribute // This will map the submitted form object to an entity for use in QBE.
    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String processSearch(@Valid @ModelAttribute OngardWell ongardWell,
            BindingResult result, 
            Model model, 
            // TODO Determine if these can be pulled from the @ModelAttribute OngardWell
            @RequestParam(value = "startPostion", defaultValue = "0") Integer startPostion,
            @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
            @RequestParam(value = "sortBy", defaultValue = "") String sortBy,
            @RequestParam(value = "sortDirection", defaultValue = "api") String sortDirection
    ) {
        
        logger.info("IN: ongardwell-list GET");
        
        // TODO Look into the Spring Data "PageRequest" class / "Pageable" interface, it's supposed to handle pagination seamlessly.
        
        // Psuedo steps that need to occur.
            // UNTESTED Execute query to count total records for use in pagination
            // DONE Execute query to fetch the proper page of results from the full set.
            // make sure are least on field was populated (i.e. this method should never return all records)
            // validate startPosition (it can't be lt 0 or gt total results)
            // validate resultsPerPage (whitelist or app min and max values allowed)
            // validate that the startPosition isn't gt totalResults.
            // validate orderBy (? whitelist / enum / switch)
            // count totalResults of the query results (without orderBy for best performance and pre-paging params so the total isn't always eq to resultsPerPage).
            // DONE pass totalResults to the view for use in pagination navigation.
            
            // fetch the result list with orderBy and paging params applied and store the page in the view model.
            
        Pager pager = new PagerBuilder()
            .startPostion(startPostion)
            .pageSize(pageSize)
            .sortBy(sortBy)
            .sortDirection(sortDirection)
            .buildPager();
        
        List<OngardWell> ongardWells = ongardWellService.fetchListByExample(ongardWell, pager);
        
        model.addAttribute("ongardWells", ongardWells);
        model.addAttribute("resultCount", ongardWells.size());
        model.addAttribute("pager", pager);
        
        return "admin-gotech-prrc/ongardwell-list";
    }
    
    @RequestMapping(value = "/detail")
    public String showDetail() {
        
        logger.info("IN: ongardwell-detail GET");
        
        /*
        List<OngardWell> well = ongardWellService.fetchOngardWell();
        model.addAttribute("ongardWell", ongardWell);

        // if there was an error in /add, we do not want to overwrite
        // the existing ongardWell object containing the errors.
        if (!model.containsAttribute("ongardWell")) {
            logger.info("Adding well object to model");
            OngarWell well = new OngardWell();
            model.addAttribute("ongardWell", ongardWell);
        }//*/
        
        return "admin-gotech-prrc/ongardwell-detail";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addingOngardWell(@Valid @ModelAttribute OngardWell ongardWell,
            BindingResult result, RedirectAttributes redirectAttrs) {
            
        logger.info("IN: OngardWell/add-POST");
        
        if (result.hasErrors()) {
            logger.info("OngardWell-add error: " + result.toString());
            redirectAttrs.addFlashAttribute("org.springframework.validation.BindingResult.ongardWell", result);
            redirectAttrs.addFlashAttribute("ongardWell", ongardWell);
            
            return "redirect:/admin-gotech-prrc/ongardwell/list";
        } else {
            ongardWellService.create(ongardWell);
            String message = "OngardWell " + ongardWell.getId() + " was successfully added";
            redirectAttrs.addFlashAttribute("message", message);
            
            return "redirect:/admin-gotech-prrc/ongardwell/";
        }
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editOngardWellPage(@RequestParam(value = "id", required = true) Integer id, Model model) {
        logger.info("IN: OngardWell/edit-GET:  ID to query = " + id);
        
        if (!model.containsAttribute("ongardWell")) {
            logger.info("Adding OngardWell object to model");
            OngardWell ongardWell = ongardWellService.fetchOne(id);
            logger.info("OngardWell/edit-GET:  " + ongardWell.toString());
            model.addAttribute("ongardWell", ongardWell);
        }
        
        return "admin-gotech-prrc/ongardwell-edit";
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editingOngardWell(@Valid @ModelAttribute OngardWell ongardWell,
            BindingResult result, RedirectAttributes redirectAttrs,
            @RequestParam(value = "action", required = true) String action,
            @RequestParam("township") String township) {
            
        logger.info("IN: OngardWell/edit-POST: " + action + " changing township changed to " + township + " (in POST)");
        logger.info("IN: OngardWell/edit-POST: " + action + " township value od " + ongardWell.getTownship() + " (in method argument object)");
        
        if (action.equals(messageSource.getMessage("button.action.cancel", null, Locale.US))) {
            // Edit cancelled
            String message = "OngardWell-edit POST cancelled id: " + ongardWell.getId() + "";
            logger.info(message);
            redirectAttrs.addFlashAttribute("message", message);
        } else if (result.hasErrors()) {
            // Form errors detected
            logger.info("OngardWell-edit POST error: " + result.toString());
            redirectAttrs.addFlashAttribute("org.springframework.validation.BindingResult.ongardWell", result);
            redirectAttrs.addFlashAttribute("message", result.toString());
            redirectAttrs.addFlashAttribute("ongardWell", ongardWell);
            
            return "redirect:/admin-gotech-prrc/ongardwell/edit?id=" + ongardWell.getId();
        } else if (action.equals(messageSource.getMessage("button.action.save",  null, Locale.US))) {
            // Edit success (or at least no errors detected)
            logger.info("OngardWell-edit POST success id: " + ongardWell.toString());
            ongardWellService.update(ongardWell);
            String message = "OngardWell " + ongardWell.getId() + " was successfully edited";
            redirectAttrs.addFlashAttribute("message", message);
        }
        
        logger.info("OngardWell-edit POST pre-default redirect id: " + ongardWell.toString());
        
        return "redirect:/admin-gotech-prrc/ongardwell/";
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteOngardWellPage(
            @RequestParam(value = "id", required = true) Integer id,
            @RequestParam(value = "phase", required = true) String phase,
            Model model) {
            
        OngardWell ongardWell = ongardWellService.fetchOne(id);
        
        logger.info("IN: OngardWell/delete-GET | id = " + id + " | phase = " + phase + " | " + ongardWell.toString());
        
        if (phase.equals(messageSource.getMessage("button.action.cancel", null, Locale.US))) {
            String message = "OngardWell delete was cancelled.";
            model.addAttribute("message", message);
            
            return "redirect:/admin-gotech-prrc/ongardwell/";
        } else if (phase.equals(messageSource.getMessage("button.action.stage", null, Locale.US))) {
            String message = "OngardWell " + ongardWell.getId() + " confirm delete.";
            model.addAttribute("ongardWell", ongardWell);
            model.addAttribute("message", message);
            
            return "admin-gotech-prrc/ongardwell-delete";
        } else if (phase.equals(messageSource.getMessage("button.action.delete", null, Locale.US))) {
            ongardWellService.delete(id);
            String message = "OngardWell " + ongardWell.getId() + " was successfully deleted";
            model.addAttribute("message", message);
            
            return "redirect:/admin-gotech-prrc/ongardwell/";
        }
        
        return "redirect:/admin-gotech-prrc/ongardwell/";
    }
    
    /*
    // example of using redirectAttrs.addFlashAttribute
    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String showList(Model model, RedirectAttributes redirectAttrs) {
            
        if (!model.containsAttribute("ongardWell")) {
            logger.info("Adding OngardWell object to model");
            OngardWell ongardWell = new OngardWell();
            model.addAttribute("ongardWell", ongardWell);
        }
        
        //redirectAttrs.addFlashAttribute("ongardWells", ongardWells);
        //redirectAttrs.addFlashAttribute("resultCount", ongardWells.size());
        //redirectAttrs.addFlashAttribute("pager", pager);
        
        return "redirect:/admin-gotech-prrc/ongardwell/search";
        //return "admin-gotech-prrc/ongardwell-list";
    }//*/
}
