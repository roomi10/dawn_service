package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PersonRepository.SituationRepository;
@RestController
public class SituationController {
	
    @Autowired
    private SituationRepository repo;

    @RequestMapping(value = "/getsituation", method=RequestMethod.GET)
    public Situations getSituation(@RequestParam("main_id") int main_id){
        return  repo.getSituations(main_id);
    }
    
    @RequestMapping(value = "/getbegin", method=RequestMethod.GET)
    public Situations getBeginSituations(){
        return  repo.getBeginSituations();
    }

}
