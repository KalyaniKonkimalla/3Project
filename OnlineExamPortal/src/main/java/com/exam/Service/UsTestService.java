package com.exam.Service;

import com.exam.Model.Enrollment;

public interface UsTestService {

	public Enrollment saveEnrollment(Enrollment Testenroll);


	public Enrollment fetchTestByCourseName(String courseType);

	
	public Enrollment updateTestEnrollment(Integer testid,Enrollment testenrollment);

}
