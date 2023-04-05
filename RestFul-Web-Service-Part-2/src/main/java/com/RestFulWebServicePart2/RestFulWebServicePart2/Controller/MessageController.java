package com.RestFulWebServicePart2.RestFulWebServicePart2.Controller;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
public class MessageController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello")
    public String show(@RequestParam String name){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("hello.message", null, "Hello!" , locale)
                + " " + name;
    }
}
