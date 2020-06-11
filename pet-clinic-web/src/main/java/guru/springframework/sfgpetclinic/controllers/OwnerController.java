package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
Here we have done Request Mapping at top itself that if all the mapping by default inside this class
will go by /owner/<>
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    /*
    Request Mapping Owner at top of class so it is by defualt like
    "/owner", "/owner/index" ,"/owner/index.html"
     */
    @RequestMapping({"","/", "/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
