package com.fund_for_change.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fund_for_change.domain.Event;
import com.fund_for_change.dto.EventDTO;
import com.fund_for_change.services.EventService;

@RestController
@RequestMapping("event")
@CrossOrigin(origins = "*")
public class EventController {
	@Autowired
	private EventService service;

	@PostMapping("addEvent")
	public ResponseEntity<Event> saveEvent(@RequestBody EventDTO event) {
		try {
			return new ResponseEntity<>(this.service.saveEvent(event), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@GetMapping("all")
	public ResponseEntity<List<Event>> getAllEvents() {
		List<Event> events = service.getEvents();
		if (!events.isEmpty()) {
			return new ResponseEntity<>(events, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("pending-events")
	public ResponseEntity<List<Event>> getAllPendingEvents() {
		List<Event> events = service.getPendingEvents();
		if (!events.isEmpty()) {
			return new ResponseEntity<>(events, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("accepted-events")
	public ResponseEntity<List<Event>> getAllAcceptedEvents() {
		List<Event> events = service.getAcceptedEvents();
		if (!events.isEmpty()) {
			return new ResponseEntity<>(events, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	@GetMapping("event/{id}")
	public ResponseEntity<Event> getEventByID(@RequestParam String id) {
		try {
			return new ResponseEntity<>(service.getEventById(id), HttpStatus.FOUND);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}

	}

	@PutMapping("/updateEvent")
	public ResponseEntity<Event> updateEvent(@RequestBody Event event) {
		try {
			return new ResponseEntity<>(service.updateEvent(event), HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("deleteEvent/{id}")
	public ResponseEntity<Void> deleteEvent(@RequestParam String id) {
		try {
//			Event event = service.getEventById(id);
			return new ResponseEntity<>( HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

}
