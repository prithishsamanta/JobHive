package com.prithish.job_portal.repositories;

import com.prithish.job_portal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByCompany(String company);
}
