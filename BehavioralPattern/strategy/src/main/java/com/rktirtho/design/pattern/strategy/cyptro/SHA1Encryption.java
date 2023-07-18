package com.rktirtho.design.pattern.strategy.cyptro;

import org.springframework.stereotype.Service;

@Service
public class SHA1Encryption implements Encryption{
    @Override
    public void encrypt(String text) {
        System.out.println("Encoding from SHA1 encoding method");
    }

    @Override
    public EncryptionPattern getEncryptionType() {
        return EncryptionPattern.SHA1;
    }
}
