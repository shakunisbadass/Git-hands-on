package com.bloodbank.feedback.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.feedback.model.Feedback;
import com.bloodbank.feedback.service.FeedbackService;
/*
 * The FeedbackController class for request controller
 *
 */
@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;

	
	@GetMapping("/feedback")
	public ResponseEntity<Set<Feedback>> getAllFeedbacks(){
		return new ResponseEntity<Set<Feedback>>(feedbackService.getAllFeedbacks(),HttpStatus.OK);
	}
	//To add the feedback(Only to be done by the user)	
	@PostMapping("/feedback/add")
	public void addFeedback(@RequestBody Feedback feedback) {
		feedbackService.addFeedback(feedback);
		
	}

}

