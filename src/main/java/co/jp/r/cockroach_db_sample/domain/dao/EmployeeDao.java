package co.jp.r.cockroach_db_sample.domain.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> findById(int id) {
        final String sql = "select * from employee where id = ?;";
        return jdbcTemplate.query(sql, new Integer[]{id}, ROW_MAPPER);
    }

    private static final RowMapper<Employee> ROW_MAPPER = (rs, i) -> {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setAge(rs.getInt("age"));
        return employee;
    };
}
