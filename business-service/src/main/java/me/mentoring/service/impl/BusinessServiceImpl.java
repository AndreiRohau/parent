package me.mentoring.service.impl;

import me.mentoring.service.BusinessService;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    private static final String ENDING = "-TEST";

    @Override
    public String test(final String text) {
        return text + ENDING;
    }
}
