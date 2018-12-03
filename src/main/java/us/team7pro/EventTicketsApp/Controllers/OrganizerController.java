package us.team7pro.EventTicketsApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import us.team7pro.EventTicketsApp.Domain.User;
import us.team7pro.EventTicketsApp.Models.Event;
import us.team7pro.EventTicketsApp.Repositories.EventRepository;;

@Controller
public class OrganizerController { 
    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/organizerdashboard")
    public String eventForm(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("events", eventRepository.findByOrganizerID(user.getId()));
        model.addAttribute("newEvent", new Event());
        return "organizerdashboard";
    }

    @PostMapping("/organizer")
    public String eventSubmit(@ModelAttribute Event newEvent, Model model, @AuthenticationPrincipal User user) {
        System.out.println(newEvent.getEventCategory());
        newEvent.setOrganizerID(user.getId());
        eventRepository.save(newEvent);
        model.addAttribute("newEvent", newEvent);
        return "EventSubmitResult";
    }
}
