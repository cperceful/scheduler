package com.cperceful.models.data;

import com.cperceful.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Employee Data Access Object
 */
@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
