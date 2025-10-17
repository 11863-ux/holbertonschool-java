package com.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String welcomeMessage() {
        // TODO
        return null;
    }

    @GetMapping("/getNumbers")
    public List<Integer> megaSenaNumbers() {
        // TODO
        // Note: Return the generated numbers in ascending order.
        return null;
    }
}