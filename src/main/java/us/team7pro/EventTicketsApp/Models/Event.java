package us.team7pro.EventTicketsApp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name="events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventID;
    private String eventName;
    private String eventCategory; // Concerts, Sports, Festivals
    private Date date;
    private String location;
    private String description;
    private float price;
    private String imgUrl;

    public Event() {}

    public Event( String eventName, String eventCategory, String location, Date date, String description, float price, String imgUrl) {
        //this.eventID = eventID;
        this.eventName = eventName;
        this.eventCategory = eventCategory;
        this.location = location;
        this.date = date;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
}
