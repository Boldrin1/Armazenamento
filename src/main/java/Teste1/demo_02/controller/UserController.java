package Teste1.demo_02.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste1.demo_02.model.user;
@RestController
@RequestMapping("/users")
public class UserController {
     private List<user> users = new ArrayList<>();
     
     @PostMapping("/add")
     public user addUser(@RequestBody user user) {
    	 users.add(user);
    	 return user;
     }
     
     public List<user> getAllUsers(){
    	 return users;
     }
}
