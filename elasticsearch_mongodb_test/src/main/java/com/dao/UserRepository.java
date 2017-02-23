package com.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bean.User;

public interface UserRepository extends ElasticsearchRepository<User, Long> {
	
}