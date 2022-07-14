package com.bloodbank.feedback.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.feedback.model.Feedback;
import com.bloodbank.feedback.repository.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	public FeedbackService(FeedbackRepository feedbackRepository) {
		super();
		this.feedbackRepository = feedbackRepository;
	}
	
	public Set<Feedback> getAllFeedbacks()
	{
		return ((FeedbackService) feedbackRepository).getAllFeedbacks();
	}
	
	public int addFeedback(Feedback feedback){
		//get id of the particular city
		int cityId = feedbackRepository.getCityIdByCityName(feedback.getCity());
		return feedbackRepository.addFeedback(feedback.getHospitalName(), cityId, feedback.getComment(), feedback.getUserId());
	}
}

