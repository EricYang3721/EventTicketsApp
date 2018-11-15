package us.team7pro.EventTicketsApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import us.team7pro.EventTicketsApp.Services.TransactionService;
import us.team7pro.EventTicketsApp.Services.EventService;

@Controller
public class CartController {
    @Autowired
    private TransactionService transactionService;

    @Autowired
    private EventService eventService;

    @PostMapping("/addToCart")
    public String addToCart(@RequestParam int userID, @RequestParam int eventID, @RequestParam int numberOfTickets) {
        // 1. Handle data from buyTickets page
        //int userid = 0;
        //int eventid = 0;
        // 2. Save it into repo
        transactionService.addToCart(userID, eventID);
        // 3. redirect to cart page
        return "redirect:/./cart";
    }

    @PostMapping("/removeFromCart")
    public String removeFromCart(@RequestParam int transactionID) {
        transactionService.delete(transactionService.findByTransactionID(transactionID));
        return "redirect:/./cart";
    }

    @GetMapping("/cart")
    public String getCart(Model model) {
        model.addAttribute("transactions", transactionService.findByUserIDAndStatus(0, false));
        model.addAttribute("events", eventService.findAll()); // SR: Maybe add only events in transactions but eliminating duplicates seems complicated
        return "cart";
    }
}
