package com.jenkins.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jenkins.crud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
