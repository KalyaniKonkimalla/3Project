package com.exam.Service;

import java.util.Optional;

import com.exam.Model.test;

public interface TestService {
	public test addTest(test test);
	
	public Optional<test> findByTest_Id(long test_id);

}
