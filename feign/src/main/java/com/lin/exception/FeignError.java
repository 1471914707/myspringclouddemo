package com.lin.exception;

import com.lin.domain.Student;
import com.lin.fc.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public String port() {
        return "服务器维护中....";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
