package de.transaction.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController("/transaction")
public class TransactionController {

    @RequestMapping("book")
    @PostMapping
    void book(@RequestParam String documentURL)  {

    }

    @RequestMapping("rollback")
    @PostMapping
    void rollback(){

    }

    @RequestMapping("list")
    @GetMapping
    void list(@AuthenticationPrincipal User user){

    }

}
