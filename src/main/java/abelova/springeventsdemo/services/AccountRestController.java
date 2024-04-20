package abelova.springeventsdemo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/accounts")
@RestController
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService service;

    @GetMapping(path = "/changeBalance")
    public void changeBalance(@RequestParam String username, @RequestParam Integer quantity) {
        service.changeBalance(username, quantity);
    }

    @GetMapping(path = "/create")
    public void createAccount(@RequestParam String username) {
        service.createAccount(username);
    }
}
