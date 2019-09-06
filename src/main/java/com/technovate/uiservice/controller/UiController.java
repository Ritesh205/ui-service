package com.technovate.uiservice.controller;

import com.technovate.uiservice.service.UiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UiController {

    @Autowired
    UiService uiService;

    @GetMapping(value = "/verify", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> verify(@RequestParam String name) {
        log.info("under verify");
        return new ResponseEntity<String>(uiService.verify(name), HttpStatus.OK);
    }
}
