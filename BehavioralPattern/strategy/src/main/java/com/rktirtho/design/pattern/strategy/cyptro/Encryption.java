package com.rktirtho.design.pattern.strategy.cyptro;

public interface Encryption {

    void encrypt(String text);

    EncryptionPattern getEncryptionType();
}
