package com.rktirtho.design.pattern.strategy.cyptro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@Component
public class EncryptionFactory {
    private Map<EncryptionPattern, Encryption> map;

    @Autowired
    public EncryptionFactory(Set<Encryption> encryptionTypeSet) {
        createStrategy(encryptionTypeSet);
    }

    private void createStrategy(Set<Encryption> encryptionTypeSet) {
        map = new EnumMap<>(EncryptionPattern.class);
        encryptionTypeSet.forEach(encryptionType -> map.put(encryptionType.getEncryptionType(), encryptionType));
        System.out.println();
    }

    public Encryption findEncryptionType(EncryptionPattern encryptionPattern){
        return map.get(encryptionPattern);
    }
}
