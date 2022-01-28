package com.exam.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.Model.test;
import com.exam.Repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepo;
	public test addTest(test test) {
		test ts=testRepo.save(test);
		return ts;
	}
	@Override
	public Optional<test> findByTest_Id(long test_id) {
	
		return testRepo.findById(test_id);
	}

}
