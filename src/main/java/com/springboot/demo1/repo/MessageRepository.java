package com.springboot.demo1.repo;

import com.springboot.demo1.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message,Long> {

    List<Message> findByTag(String tag);
}
