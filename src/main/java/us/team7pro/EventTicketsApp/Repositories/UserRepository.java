package us.team7pro.EventTicketsApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import us.team7pro.EventTicketsApp.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUserID(int userID);
    public User findByEmail(String email);
    public User findByUserName(String userName);
}
