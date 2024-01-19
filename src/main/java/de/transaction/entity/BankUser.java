package de.transaction.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class BankUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
