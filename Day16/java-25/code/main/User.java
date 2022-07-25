package main;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {
    @RequestMapping("/user/list")
    ArrayList listAllUser(){
        return (ArrayList) repository.findAll();
    }
    @Autowired UserRepository repository;
}

interface UserRepository extends CrudRepository<User, Integer> { }

@Table("users")
class User {
    @Id public Integer code;
    public String email;
    String password;
    public String name;
}