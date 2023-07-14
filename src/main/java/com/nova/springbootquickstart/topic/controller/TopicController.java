package com.nova.springbootquickstart.topic.controller;

import com.nova.springbootquickstart.topic.service.TopicService;
import com.nova.springbootquickstart.topic.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.setTopics(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
