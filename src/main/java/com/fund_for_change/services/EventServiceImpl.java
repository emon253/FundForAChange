package com.fund_for_change.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund_for_change.domain.Event;
import com.fund_for_change.domain.User;
import com.fund_for_change.dto.EventDTO;
import com.fund_for_change.repository.EventRepository;
@Service
public class EventServiceImpl implements EventService {
	@Autowired
	private EventRepository repository;

	@Override
	public Event saveEvent(EventDTO eventDto) {
		Event event = convertToEvent(eventDto);
		event.setEventId("event1");
		event.setUser(new User());
		event.setStates("Pending");
		return repository.save(event);

	}

	@Override
	public List<Event> getEvents() {
		return repository.findAll();
	}

	@Override
	public Event getEventById(String id) {
		
		return repository.findById(id).get();
	}

	@Override
	public Event updateEvent(Event event) {
		return repository.save(event);
	}

	@Override
	public void deleteEvent(Event event) {

		repository.delete(event);
	}

	public EventServiceImpl() {
	}

	private Event convertToEvent(EventDTO eventDTO) {
		return new Event(null,eventDTO.getEventName(), eventDTO.getEventDescriction(), eventDTO.getEventLocation(), eventDTO.getTargetAmount(), 0, null,null);
	}
}
