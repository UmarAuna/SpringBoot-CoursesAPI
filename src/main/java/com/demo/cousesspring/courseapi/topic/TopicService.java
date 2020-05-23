package com.demo.cousesspring.courseapi.topic;

import com.demo.cousesspring.courseapi.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  new ArrayList<>( Arrays.asList(
        new Topic("spring", "Spring Framework", "Spring Framework is a good frame work"),
                new Topic("java", "Core Java", "Java is a beautiful language"),
                new Topic("javascript", "JavaScript", "Javascript is a bad language")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public  Topic getTopic(String id){
       return topics.stream().filter(t ->  t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
