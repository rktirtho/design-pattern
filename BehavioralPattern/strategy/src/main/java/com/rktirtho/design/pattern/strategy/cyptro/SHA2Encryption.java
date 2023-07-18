package com.rktirtho.design.pattern.strategy.cyptro;

import org.springframework.stereotype.Service;

@Service
public class SHA2Encryption implements Encryption{

    @Override
    public void encrypt(String text) {
        System.out.println("Encoding from SHA2 encoding method");
    }

    @Override
    public EncryptionPattern getEncryptionType() {
        return EncryptionPattern.SHA2;
    }
}
