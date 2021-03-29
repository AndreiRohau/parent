package me.mentoring.controller;

import me.mentoring.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
    @Autowired
    private BusinessService businessService;

    @GetMapping
    public String index() {
        return "Index!";
    }

    @GetMapping("/test")
    public String test(@RequestParam(required = false) final String text) {
        return businessService.test(text);
    }
}
