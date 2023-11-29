package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Feedback;
import com.example.demo.repo.FeedbackRepo;

@Service
public class FeedbackService {
	@Autowired
	FeedbackRepo feed;
	
	//insert
	public Feedback insert(Feedback f) {
		return feed.save(f);
		}
	
	public List<Feedback> insertall(List<Feedback> f) {
		return feed.saveAll(f);
		}
	
	public List<Feedback> getall(){
		return feed.findAll();
		}
	
	public void deletebyid(int id) {
		feed.deleteById(id);
		}
	
	public Feedback updatebyname(Feedback e) {
		Feedback ee=feed.findById(e.getFeedbackId()).orElse(null);
		ee.setAboutToday(e.getAboutToday());
		return feed.save(ee);
		}


}
