package us.team7pro.EventTicketsApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import us.team7pro.EventTicketsApp.Models.Event;
import us.team7pro.EventTicketsApp.Services.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.io.IOException;

@Controller
public class AdminController {
    @Autowired
    private EventService eventService;

    @GetMapping("/admin")
    public String test(Model model) {
        List<Event> testList = eventService.findAll();
        // for(Event t : testList){
        //     System.out.println(t.getEventID());
        // }
        model.addAttribute("testlist", testList);

        return "admindashboard";
    }

    @PostMapping(value = "/admin")
    public String handleDeleteUser(@RequestParam int del_eventId) throws IOException{
        System.out.println(del_eventId);
        System.out.println("test");
        return "redirect:/admin";
    }
}
