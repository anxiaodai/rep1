package com.itheima.controller;


import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/register")
    public String register(@Validated User user , BindingResult result ,ModelMap map){
          if(result.hasErrors()){
              List<FieldError> errors  =result.getFieldErrors();
              for (FieldError error : errors) {
                  map.put(error.getField(),error.getDefaultMessage());
              }
              return "register";
          }
          return "success";
    }
}
