package com.courseapplication.courseapi.topic;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("Spring","Spring Framework","spring framework description"),
            new Topic("Java","Java Framework","Java framework description"),
            new Topic("Python","Python Framework","Python framework description")
    );
   
    public List<Topic> getAllTopics(){
        return topics;
    }
}
