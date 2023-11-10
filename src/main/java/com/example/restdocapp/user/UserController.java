package com.example.restdocapp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class UserController {

    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody @Valid UserRequest.JoinDTO requestDTO, Errors errors){

        if(errors.hasErrors()){
            FieldError fieldError = errors.getFieldErrors().get(0);
            String key = fieldError.getField();
            String value = fieldError.getDefaultMessage();
            return new ResponseEntity<>(value+":"+key, HttpStatus.BAD_REQUEST);
        }


        return ResponseEntity.ok().body(null);
        // return ResponseEntity.ok(null);
        // return new ResponseEntity<>("null", HttpStatus.BAD_REQUEST); // 다른 응답할 때
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(){

        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> userInfo(){

        return ResponseEntity.ok().body(null);
    }

}
