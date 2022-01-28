package com.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.Model.Enrollment;

@Repository
public interface UsTestRepository extends JpaRepository<Enrollment, Integer>{

		
		public Enrollment findByCourseType(String courseType);
		
		public Enrollment findByCourseTypeIgnoreCase(String courseType);
}
