package com.rktirtho.design.pattern.strategy.controller;

import com.rktirtho.design.pattern.strategy.cyptro.EncryptionPattern;
import com.rktirtho.design.pattern.strategy.cyptro.EncryptionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encoder")
public class EncodingController {
    @Autowired
    private EncryptionFactory encryptionFactory;

    @GetMapping("/stringToText")
    public String  encrypt(@RequestParam EncryptionPattern encryptionPattern) {
        encryptionFactory.findEncryptionType(encryptionPattern).encrypt("ABCD");

        return "Success";
    }
}
