package org.services;

import org.entities.User;

import java.util.ArrayList;
import java.util.List;

public class userBooking {

    private List<User> ulist;
    private User user;

    public userBooking(User u1) {
        this.user = u1;
        this.ulist = new ArrayList<>();
    }
}
