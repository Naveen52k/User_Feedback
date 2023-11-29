package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Feedback;
import com.example.demo.service.FeedbackService;


@RestController
public class FeedbackController {

    @Autowired
    FeedbackService service;

    @PostMapping("/insert")
    public Feedback insert(@RequestBody Feedback e) {
        return service.insert(e);
    }

    @PostMapping("/insertall")
    public List<Feedback> insertall(@RequestBody List<Feedback> e) {
        return service.insertall(e);
    }

    @GetMapping("/getall")
    public List<Feedback> getall() {
        return service.getall();
    }

    @DeleteMapping("/delete/{id}")
    public String deletebyid(@PathVariable("id") int id) {
        service.deletebyid(id);
        return "deleted record with id " + id;
    }

    @PutMapping("/update")
    public Feedback updatebyname(@RequestBody Feedback e) {
        return service.updatebyname(e);
    }
}
