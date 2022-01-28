package com.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.Model.test;

public interface TestRepository extends JpaRepository<test,Long> {

}
