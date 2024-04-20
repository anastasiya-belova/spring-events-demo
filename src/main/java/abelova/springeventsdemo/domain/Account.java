package abelova.springeventsdemo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    @Id
    @Column
    UUID id = UUID.randomUUID();

    @Column
    String username;

    @Column
    Integer balance = 0;
}
