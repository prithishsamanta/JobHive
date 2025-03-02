package com.prithish.job_portal.services;

import com.prithish.job_portal.model.Job;
import com.prithish.job_portal.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getJobsByCompany(String company) {
        return jobRepository.findByCompany(company);
    }
}
