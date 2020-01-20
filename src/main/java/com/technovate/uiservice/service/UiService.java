package com.technovate.uiservice.service;

import com.technovate.uiservice.models.College;
import com.technovate.uiservice.models.User;

import java.util.List;

public interface UiService {

    String verify(String name);

    List<User> getAllUsers();

    User getUser(int userId);

    boolean validateLogin(User user);

    College getCollegeDetails(int collegeId);
}
