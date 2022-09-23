package com.example.amigologin_registration.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;
@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //regEx to validate e amil
        return true;
    }

}
