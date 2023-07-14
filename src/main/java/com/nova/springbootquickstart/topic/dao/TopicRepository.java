package com.nova.springbootquickstart.topic.dao;

import com.nova.springbootquickstart.topic.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
