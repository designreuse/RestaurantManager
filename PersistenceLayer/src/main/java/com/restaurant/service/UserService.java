package com.restaurant.service;

import com.restaurant.dto.Role;
import com.restaurant.dto.User;

/**
 * Created by Martha on 2/24/2017.
 */
public interface UserService {

    public User createOrUpdate(User user);

<<<<<<< Updated upstream
    public Role createRole(Role role);
=======
    /** Creates a table to store token for rememberMe functionality*/
    void addRememberMeTable();


    List<Role> roles();
>>>>>>> Stashed changes
}
