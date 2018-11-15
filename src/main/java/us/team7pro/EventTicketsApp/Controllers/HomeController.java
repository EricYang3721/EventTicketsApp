package us.team7pro.EventTicketsApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import us.team7pro.EventTicketsApp.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.*;

@Controller
public class HomeController {

    @Autowired EventRepository eventRepository;

    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("events", eventRepository.findAll());
        return "homepage";
    }
}
