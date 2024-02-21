package com.app.controller;

import com.app.exception.ProductNotfoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionController {

    @GetMapping("/exception-test/product/{no}")

    public String checkExceptionHandler(@PathVariable Integer no){
        if(no == 0) {
            throw new ProductNotfoundException("Product no 0 is invalid..");
        }
        return "Success execution";
    }
}
