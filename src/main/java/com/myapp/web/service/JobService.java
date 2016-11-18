package com.myapp.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.myapp.web.model.JobListing;

@Component
public class JobService {

	private static final List<JobListing> JobListingDatabase = new ArrayList<>();

	public void createjob(JobListing j) {
		JobListingDatabase.add(j);
	}

	public List<JobListing> getAllJobs() {
		return JobListingDatabase;
	}

}
