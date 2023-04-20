package com.assignment.fechingdata.fetchingdatausingjava;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.fechingdata.model.RandomAndJokes;

@RestController
public class RandomAndJokesController {

    @PostMapping("jokes")
    public String postmethod(@RequestBody RandomAndJokes randomAndJokes) {
        return randomAndJokes.toString();
    }
}
