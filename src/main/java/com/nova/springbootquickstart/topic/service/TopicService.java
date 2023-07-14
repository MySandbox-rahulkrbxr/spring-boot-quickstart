package com.nova.springbootquickstart.topic.service;

import com.nova.springbootquickstart.topic.dao.TopicRepository;
import com.nova.springbootquickstart.topic.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("java", "Java", "Java programming language"),
                new Topic("javascript", "JavaScript", "JavaScript scripting language"),
                new Topic("python", "Python", "Python scripting language")
    ));

    public List<Topic> getAllTopics() {
//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
//        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void setTopics(Topic topic) {
//        topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
//        for (int i=0; i<topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(topic -> topic.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
