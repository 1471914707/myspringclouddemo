package com.lin.controller;

import com.lin.domain.Student;
import com.lin.fc.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/hystrix")
@RestController
public class FeignHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/port")
    public String port(){
        return feignProviderClient.port();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return feignProviderClient.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        feignProviderClient.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        feignProviderClient.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        feignProviderClient.deleteById(id);
    }
}
