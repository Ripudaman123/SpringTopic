package io.springboot.topic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import io.springboot.topic.controller.Topic;

@Service
public class TopicService {

	List<Topic> topic=new ArrayList<Topic>(
			Arrays.asList(
					new Topic("1","Spring-Framework","Spring Framework Description"),
					new Topic("2","core-java","java description"),
					new Topic("3","Javascript","javascript description")
					));
	
  public List<Topic> getAllTopic()
  {
	  return topic;
  }
  
  public void add(Topic topic)
  {
	  this.topic.add(topic);
  }

public void delete(String id) {
//	topic.remove(id);
  topic.removeIf(r->r.getId().equals(id));
}

public void update(Topic topic, String id) {
	
	
	
}
}
