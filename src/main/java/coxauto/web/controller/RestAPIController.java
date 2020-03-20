package coxauto.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    // Example of Get API
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }

    // Example of Post API
    @PostMapping("/helloWorld")
    public String getPostData(@RequestBody String requestData) {
        return requestData;
    }
}