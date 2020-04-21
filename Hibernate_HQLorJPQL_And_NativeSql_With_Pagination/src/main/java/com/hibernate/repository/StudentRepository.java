package com.hibernate.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hibernate.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	@Query("from Student")
	public List<Student> findAllStudentsData();
	
	@Query("select st.name,st.subject from Student st")
	public List<Object[]> findAllSpecificData();
	
	@Query("from Student where name=:name")
	public Student findStudentsByName(@Param("name") String name);
	
	@Query("from Student where id>:min and id<:max")
	public List<Student> findStudentsByRange(@Param("min") Integer minId,@Param("max") Integer maxId);
 
	@Modifying
	@Query("delete from Student where name=:name")
	public void deleteByName(@Param("name") String stdName);

	
	@Query("from Student")
	public List<Student> findAllStudentsDataWithPagination(Pageable pageable);
	
	@Query("from Student")
	public List<Student> findAllStudentsDataWithPaginationWithSorting(Pageable pageable);


	//Native Queries
	
	@Query(value="select * from student",nativeQuery = true)
	public List<Student> findByAllStudents();
	
	@Query(value="select * from student where std_name=:name",nativeQuery = true)
	public Student findByAllStudentsByName(@Param("name") String stdName);
	
}
