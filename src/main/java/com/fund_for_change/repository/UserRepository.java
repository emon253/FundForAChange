package com.fund_for_change.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fund_for_change.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	@Query("select u from User u where u.userName = : userName")
	public User findByUserName(@Param("userName") String userName);

	
}
