package co.jp.r.cockroach_db_sample.web;

import co.jp.r.cockroach_db_sample.domain.SampleService;
import co.jp.r.cockroach_db_sample.domain.dao.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService service;

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity<Employee> findById(@PathVariable("id") final int id) {
        return new ResponseEntity<>(service.find(id), HttpStatus.OK);
    }
}
