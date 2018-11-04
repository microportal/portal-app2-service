package br.org.ark.portalapp2.portalapp2service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome() {
        log.debug("[GET] /welcome");
        return "Welcome to app2";
    }
}
