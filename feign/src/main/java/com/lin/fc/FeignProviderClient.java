package com.lin.fc;

import com.lin.domain.Student;
import com.lin.exception.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/port")
    public String port();

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/findById/{id}")
    public Student findById(@PathVariable("id") long id);

    @PostMapping("/student/save")
    public void save(@RequestBody Student student);

    @PutMapping("/student/update")
    public void update(@RequestBody Student student);

    @DeleteMapping("/student/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
