package us.team7pro.EventTicketsApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import us.team7pro.EventTicketsApp.Models.Event;
import us.team7pro.EventTicketsApp.Repositories.EventRepository;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;



@Component
public class DatabaseSeeder implements CommandLineRunner {
    private EventRepository eventRepository;

    @Autowired
    public DatabaseSeeder(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        List<Event> event =  new ArrayList<>();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy-HH:mm");
        Date d1 = df.parse("11-10-2018-22:00");
        Date d2 = df.parse("11-18-2018-21:30");
        Date d3 = df.parse("10-12-2018-23:30");
        Date d4 = df.parse("12-12-2018-11:45");
        Date d5 = df.parse("04-01-2019-07:00");
        Date d6 = df.parse("23-12-2018-19:15");


        event.add(new Event("Kygo  Music" ,"Concert", "New York", d1 , "Kygo is a Electronic Dance Music DJ", 19.99f, "img/bg-img/kygo.jpg"));
        event.add(new Event("Ultra Music Festival" ,"Festival", "Miami", d3 , "Top 10 Dj's playing", 27.49f, "img/bg-img/bg-3.jpg"));
        event.add(new Event("Marshmello" ,"Concert", "Chicago", d2 , "Marshmello plays Techno", 13.99f, "img/dummy/Marshmello.jpg"));
        event.add(new Event("VH1 Supersonic" ,"Festival", "California", d4 , "Sponsered by Sreekar Dhaduvai", 15.99f, "img/bg-img/bg-5.jpg"));
        event.add(new Event("Donald Duck vs Daffy Duck" ,"Sport", "London", d1 , "The boxing match of the century.", 89.99f, "img/dummy/DonaldDuckVsDaffyDuck.jpg"));
        event.add(new Event("The tragedy of Elmer Fudd" ,"Theater", "California", d5 , "No sadder tale than this.", 10.00f, "img/dummy/Elmer.jpg"));
        event.add(new Event("I can't believe this is a party" ,"Party", "Florida", d4 , "Crabs having a blast on the beach.", 54.49f, "img/dummy/CrabRave2.jpg"));
        event.add(new Event("Fresh Doge Memes" ,"Gallery", "New York", d6 , "A social commentary through memes.", 39.99f, "img/dummy/DogeArtGallery.jpg"));

        eventRepository.saveAll(event);

    }
}

