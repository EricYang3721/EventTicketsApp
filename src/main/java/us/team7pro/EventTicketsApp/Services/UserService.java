package us.team7pro.EventTicketsApp.Services;

import us.team7pro.EventTicketsApp.Models.User;

public interface UserService {
    User findUserById(int usrID);
}
