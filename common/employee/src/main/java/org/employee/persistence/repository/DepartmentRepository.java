

package org.employee.persistence.repository;

import org.employee.persistence.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByCode(String code);
}
