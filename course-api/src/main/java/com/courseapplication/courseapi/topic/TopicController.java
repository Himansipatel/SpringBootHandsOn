package com.courseapplication.courseapi.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> allTopics(){
        return Arrays.asList(
                new Topic("Spring","Spring Framework","spring framework description"),
                new Topic("Java","Java Framework","Java framework description"),
                new Topic("Python","Python Framework","Python framework description")
        );
    }
}
