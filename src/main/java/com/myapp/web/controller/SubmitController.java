package com.myapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.web.model.JobListing;
import com.myapp.web.service.JobService;

@RestController
@RequestMapping(path="/jobs")
public class SubmitController {
	
	@Autowired
	JobService js;
	
	@RequestMapping(path = "/createjob", method = RequestMethod.POST)
	public void createJob(@RequestBody JobListing jl) {
		System.out.println(jl.getTitle());
		js.createjob(jl);
	}
	
	

}
