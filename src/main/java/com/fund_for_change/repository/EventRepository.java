package com.fund_for_change.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fund_for_change.domain.Event;
@Repository
public interface EventRepository extends JpaRepository<Event, String>{

}
