package com.yusi.spring.boot.blog.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.yusi.spring.boot.blog.domain.User;

/**
 * User Repository 接口.
 * 
 */
public interface UserRepository extends CrudRepository<User, Long>, PagingAndSortingRepository<User, Long>, 
QueryByExampleExecutor<User> {
}
