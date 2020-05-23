package com.demo.cousesspring.courseapi.topic;

import com.demo.cousesspring.courseapi.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    //get single topic
    @RequestMapping("/topics/{id}")
    public Topic getTopic (@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics" )
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }


}
