package com.demo.cousesspring.courseapi.controller;

import com.demo.cousesspring.courseapi.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework is a good frame work"),
                new Topic("java", "Core Java", "Java is a beautiful language"),
                new Topic("javascript", "JavaScript", "Javascript is a bad language")
        );
    }

}
