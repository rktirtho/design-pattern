package com.rktirtho.design.pattern.strategy.cyptro;

import org.springframework.stereotype.Service;

@Service
public class MD5Encryption implements Encryption{

    @Override
    public void encrypt(String text) {
        System.out.println("Encoding from MD5 encoding method");

    }

    @Override
    public EncryptionPattern getEncryptionType() {
        return EncryptionPattern.MD5;
    }
}
