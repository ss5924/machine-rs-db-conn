package me.songha.machiners.config;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String test() {
        System.out.println("test!!!!");
        return "test success!";
    }
}
