package com.SpringBootWebProject1.SpringBootWebProject1.services;

import com.SpringBootWebProject1.SpringBootWebProject1.model.JobPost;
import com.SpringBootWebProject1.SpringBootWebProject1.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    public  void addJob(JobPost job){
        repo.addJob(job);
    }

    public List<JobPost> getAllJobs(){
       return repo.getAllJobs();
    }

}
