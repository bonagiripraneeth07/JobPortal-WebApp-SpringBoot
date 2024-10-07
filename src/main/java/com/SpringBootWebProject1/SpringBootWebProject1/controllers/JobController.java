package com.SpringBootWebProject1.SpringBootWebProject1.controllers;

import com.SpringBootWebProject1.SpringBootWebProject1.model.JobPost;
import com.SpringBootWebProject1.SpringBootWebProject1.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;
    @RequestMapping({"/","home"})
        public String home(){
            System.out.println("from show method ");
            return "home";
        }
        @RequestMapping("addjob")
        public String addJob(){
        return "addjob";
        }
        @PostMapping("handleForm")
        public String handleAddJobForm(JobPost jobPost) {
        service.addJob(jobPost);
            return "success";
        }
        @GetMapping("/viewalljobs")
        public  String viewAllJobs(Model m){
            List<JobPost> jobs =service.getAllJobs();
            m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
        }
}
