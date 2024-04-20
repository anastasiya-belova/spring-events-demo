package abelova.springeventsdemo.services;

import abelova.springeventsdemo.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository repository;

    @Transactional
    public void changeBalance(String username, Integer quantity) {
        Account account = repository.getByUsername(username);
        account.setBalance(account.getBalance() + quantity);

        repository.save(account);
    }

    @Transactional
    public void createAccount(String username) {
        Account account = new Account();
        account.setUsername(username);

        repository.save(account);
    }
}
