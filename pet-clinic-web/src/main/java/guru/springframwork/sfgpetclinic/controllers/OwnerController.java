package guru.springframwork.sfgpetclinic.controllers;

import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","index","index.html"})
    public String listOwners()
    {
        return "owners/index";
    }
}
