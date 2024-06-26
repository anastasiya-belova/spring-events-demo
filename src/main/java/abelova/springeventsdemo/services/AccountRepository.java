package abelova.springeventsdemo.services;

import abelova.springeventsdemo.domain.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AccountRepository extends CrudRepository<Account, UUID> {

    Account getByUsername(String username);
}
