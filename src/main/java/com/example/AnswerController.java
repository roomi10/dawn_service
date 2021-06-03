package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PersonRepository.AnswerRepository;
@RestController
public class AnswerController {
	
    @Autowired
    private AnswerRepository repo;

    @RequestMapping(value = "/getanswers", method=RequestMethod.GET)
    public List<Answer> getAnswers(@RequestParam("main_id") int main_id){
        return  repo.getAnswers(main_id);
    }

}
