package com.springBasics.model;

import com.springBasics.beans.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

//import javax.swing.tree.RowMapper;
//import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int save(Employee employee)
    {
        String sqlSave="insert into employee(id,name,designation,salary) values('"+employee.getId()+"',"+employee.getName()+"',"+employee.getDesignation()+"',"+employee.getSalary()+"')";
    return template.update(sqlSave);
    }

    public List<Employee> getEmployees(){
        return template.query("select * from employee",new RowMapper<Employee>(){



            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee e=new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getFloat(3));
                e.setDesignation(rs.getString(4));
                return e;
            }
        });
    }
}
