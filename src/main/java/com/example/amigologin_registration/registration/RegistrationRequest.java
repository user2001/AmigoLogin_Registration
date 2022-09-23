package com.example.amigologin_registration.registration;

import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class RegistrationRequest {
    private  String firstName;
    private  String lastName;
    private  String password;
    private  String email;

}
