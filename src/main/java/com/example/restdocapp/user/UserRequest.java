package com.example.restdocapp.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserRequest {

    @Data //Getter, Setter, ToString
    public static class JoinDTO{

        @Size(min = 3, max = 20)
        @NotEmpty // null과 공백 불가능
        private String username;
        @Size(min = 4, max = 20)
        @NotEmpty
        private String password;
        @Size(min = 15, max = 100)
        @NotEmpty
        private String email;

        public User toEntity(){
            return User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .build();
        }

    }

    @Data
    public static class LoginDTO{

        @Size(min = 3, max = 20)
        @NotEmpty
        private String username;
        @Size(min = 4, max = 20)
        @NotEmpty
        private String password;

    }
}
