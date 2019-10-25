package com.dlsl.queue;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface QueueRepository extends CrudRepository<Users, String> {
	
	List<Users> findAll();
	
	@Query(value = "SELECT * FROM users WHERE currently_queueing='yes'" , nativeQuery = true)
	public List<Users> search(@Param("currently_queueing") String currently_queueing);

}
