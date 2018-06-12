package com.ucbcba.taller.controllers;

import com.ucbcba.taller.services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    
}
