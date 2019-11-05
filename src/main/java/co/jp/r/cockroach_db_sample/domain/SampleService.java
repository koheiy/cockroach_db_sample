package co.jp.r.cockroach_db_sample.domain;

import co.jp.r.cockroach_db_sample.domain.dao.Employee;
import co.jp.r.cockroach_db_sample.domain.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    @Autowired
    private EmployeeDao dao;

    public Employee find(final int id) {
        return dao.findById(id).get(0);
    }
}
