package com.technovate.uiservice.controller;

import com.technovate.uiservice.models.User;
import com.technovate.uiservice.properties.UIProperties;
import com.technovate.uiservice.repositories.RoleRepository;
import com.technovate.uiservice.service.UiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UiController {

    @Autowired
    UiService uiService;

    @Autowired
    UIProperties uiProperties;

    @Autowired
    RoleRepository roleRepository;

    @GetMapping(value = "verify", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> verify(@RequestParam String name) {
        log.info("under verify");
        return new ResponseEntity<>(roleRepository.findByRoleName("student"), HttpStatus.OK);
    }

    @GetMapping(value = "/health")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("This Application is Healthy", HttpStatus.BAD_REQUEST);
    }

    @GetMapping(value = "/getAllUsers")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(uiService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/getUser", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@RequestParam int userId) {
        return new ResponseEntity<>(uiService.getUser(userId), HttpStatus.OK);
    }

    @PostMapping(value = "/validateLogin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> validateLogin(@RequestBody User user) {
        return new ResponseEntity<>(uiService.validateLogin(user), HttpStatus.OK);
    }

    @GetMapping(value = "/getCollegeDetails", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> validateLogin(@RequestParam int collegeId) {
        return new ResponseEntity<>(uiService.getCollegeDetails(collegeId), HttpStatus.OK);
    }

    @GetMapping(value = "/checkConfig")
    String getMessage() {

        return uiProperties.getMessage().trim();
    }
}
