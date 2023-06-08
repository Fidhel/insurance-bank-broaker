package com.account.app.services;

import org.springframework.stereotype.Service;

@Service
public class AccountService {


    public String viewAccount(int id) {
        return "Essa é minha conta "+id;

    }

    public boolean createAccount(String accountName) {
        System.out.println("Creating account: " + accountName);
        return false;

    }
    public boolean updateAccount(String texto) {
        System.out.println("Updating account: " + texto);
        return false;
    }

    public boolean deleteAccount(String texto) {
        System.out.println("Deleting account: " + texto);
        return false;
    }
}
