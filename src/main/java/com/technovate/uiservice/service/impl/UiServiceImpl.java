package com.technovate.uiservice.service.impl;

import com.technovate.uiservice.service.UiService;
import org.springframework.stereotype.Service;

@Service
public class UiServiceImpl implements UiService {

    @Override
    public String verify(String name) {
        return "HELLO "+name+" FROM UI-SERVICE";
    }
}
