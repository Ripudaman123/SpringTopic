package io.springboot.topic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.topic.service.TopicService;

@RestController
public class TopicController {

	private TopicService service=new TopicService();
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return service.getAllTopic();
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void add(@RequestBody Topic topic)
	{
	     service.add(topic);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void add(@PathVariable String id)
	{
	     service.delete(id);
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void add(@RequestBody Topic topic,@PathVariable String id)
	{
	     service.update(topic,id);
	}
	
}
