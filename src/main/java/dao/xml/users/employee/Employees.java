package dao.xml.users.employee;

import entities.users.Employee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denys Vodotiiets.
 */

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {

    @XmlElement(name = "employee")
    private List<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employee) {
        this.employees = employee;
    }

}
