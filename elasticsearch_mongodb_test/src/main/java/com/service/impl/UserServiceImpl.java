package com.service.impl;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.index.Term;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserRepository;
@Service
public class UserServiceImpl {
	  @Autowired
	  private UserRepository userRepository;

	  public void save(User user) {
	    userRepository.save(user);
	  }

	  public Iterable<User> findAll(String username,String title) {
		  TermQueryBuilder term=new TermQueryBuilder("title",title);
		  MatchQueryBuilder match=new MatchQueryBuilder("users.username", username);
		  match.analyzer("ik");
		  SearchQuery searchQuery = new NativeSearchQueryBuilder().
	                withQuery(match).withFilter(term).
	                withPageable(new PageRequest(0, 2)).
	                build();
		  return userRepository.search(searchQuery);
	  }
}
