package us.team7pro.EventTicketsApp.SecurityRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import us.team7pro.EventTicketsApp.Domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
