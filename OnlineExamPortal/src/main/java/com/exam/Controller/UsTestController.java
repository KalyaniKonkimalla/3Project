package com.exam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.Model.Enrollment;
import com.exam.Service.UsTestService;

@RestController
public class UsTestController {

	@Autowired
	private UsTestService Testservice;
	
	
	@PostMapping("/saveEnrollment")
	public Enrollment saveEnrollement(@RequestBody Enrollment Testenroll)
	{
		
		return Testservice.saveEnrollment(Testenroll);
	}
	
	@GetMapping("/saveEnrollment/courseType/{courseType}")
	public Enrollment fetchTestByCourseName(@PathVariable("courseType") String courseType)
	{
		return Testservice.fetchTestByCourseName(courseType);
	}
	
	@PutMapping("/saveEnrollment/{tid}")
	public Enrollment updateTestEnrollment(@PathVariable("tid") Integer testid,
												@RequestBody Enrollment testenrollment)
	{
		return Testservice.updateTestEnrollment(testid,testenrollment);
	}

}
