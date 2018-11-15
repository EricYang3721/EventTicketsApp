package us.team7pro.EventTicketsApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import us.team7pro.EventTicketsApp.Models.Event;
import us.team7pro.EventTicketsApp.Services.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import us.team7pro.EventTicketsApp.Repositories.*;
import java.text.ParseException;
import javax.swing.JOptionPane;
@Controller
public class OrganizerController {
    // @Autowired
    // private EventService eventService;
    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/organizer")
    public String eventForm(Model model) {
        model.addAttribute("newEvent", new Event());
        return "organizerdashboard";
    }

    @PostMapping("/organizer")
    public String eventSubmit(@ModelAttribute Event newEvent, @RequestParam String eventDate) {
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy-HH:mm");
        
        String output = "";
        try{
            Date d1 = df.parse(eventDate);
        } catch (ParseException e) {
            output = "Can't parse " + eventDate;
        }
        JOptionPane.showMessageDialog(null, output);

        System.out.println(newEvent.getEventCategory());
        eventRepository.save(newEvent);
        return "eventSubmitResult";
    }


}
