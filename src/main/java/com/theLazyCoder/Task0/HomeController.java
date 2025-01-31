package com.theLazyCoder.Task0;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping("/get/myDetails")
    public ResponseEntity<GetResponse> getMyDetails() {
        GetResponse getResponse = new GetResponse(
                "devtomiwa@gmail.com",
                DateTimeFormatter.ISO_INSTANT.format(Instant.now()),
                "https://github.com/Olatomiw/HNG12_STAGE0");

        System.out.println(getResponse);
        return new ResponseEntity<>(getResponse, HttpStatus.OK);
    }
}
