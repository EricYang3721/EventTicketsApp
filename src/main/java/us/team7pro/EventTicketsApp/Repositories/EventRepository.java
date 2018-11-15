package us.team7pro.EventTicketsApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import us.team7pro.EventTicketsApp.Models.Event;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer> {
    public List<String> findByEventCategory(String eventCategory);
    public Event findByEventID(int eventID);
}
