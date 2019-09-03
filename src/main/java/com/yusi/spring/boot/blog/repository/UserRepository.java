package com.yusi.spring.boot.blog.repository;
 
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.yusi.spring.boot.blog.domain.User;

/**
 * User Repository 接口.
 * 
 */
public interface UserRepository extends   CrudRepository<User, Long>, PagingAndSortingRepository<User, Long>, 
QueryByExampleExecutor<User> {
	/**
	 * 根据用户姓名分页查询用户列表
	 */
	Page<User> findByNameLike(String name,  Pageable pageable);
	
	/**
	 * 根据用户账号查询
	 * @param username
	 * @return
	 */
	User findByUsername(String username);
}
