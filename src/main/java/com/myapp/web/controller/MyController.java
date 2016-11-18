package com.myapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.web.model.JobListing;
import com.myapp.web.service.JobService;

@RestController
public class MyController {
	@Autowired
	JobService js;

	@RequestMapping(path = "/newjob", method = RequestMethod.GET)
	public JobListing getJob() {
		JobListing j1 = new JobListing();
		j1.setTitle("This is a new job!");
		j1.setDuration(12);
		j1.setPay(1000);
		return j1;
	}

	@RequestMapping(path = "/getlist", method = RequestMethod.GET)
	public List<JobListing> getList() {
		/*
		 * ArrayList<JobListing> arr = new ArrayList<>(); JobListing j1 = new
		 * JobListing(); j1.setTitle("1.This is a new job!");
		 * j1.setDuration(12); j1.setPay(1000); JobListing j2 = new
		 * JobListing(); j2.setTitle("2.This is a new job!");
		 * j2.setDuration(13); j2.setPay(2000); JobListing j3 = new
		 * JobListing(); j3.setTitle("3.This is a new job!");
		 * j3.setDuration(14); j3.setPay(3000); arr.add(j1); arr.add(j2);
		 * arr.add(j3); return arr;
		 */

		return js.getAllJobs();
	}

}
