package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topicsList = new ArrayList<Topic>(Arrays.asList(new Topic("1", "name1", "desc2"),
			new Topic("2", "name2", "desc2"), new Topic("3", "name3", "desc3")));

	public List<Topic> getAllTopics() {
		return topicsList;
	}

	public Topic getTopic(String id) {
		return topicsList.stream().filter(e -> id.equals(e.getId())).findFirst().orElse(null);
	}

	public void addTopic(Topic topic) {
		topicsList.add(topic);
	}
}
