package io.javabrains.springbootstarter.topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("1", "name1", "desc2"),
				new Topic("2", "name2", "desc2"),
				new Topic("3", "name3", "desc3")
				);
	}
}
