package com.dlsl.queue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueueService {

	@Autowired
	private QueueRepository queueRepository;	
	
	public List<Users> search(String currently_queueing) {
		return queueRepository.search(currently_queueing);
	}
}
