package com.example;

import java.util.ArrayList;

public class Situations {
	 public int mainId;
	 public String situation;
	 public int begin;
	
    public ArrayList<Answer> answers;
  
    public Situations(String s, int variant) {
        this.situation = s;
        answers = new ArrayList<Answer>();
    }
    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public Situations(){

    }
	  public int getBegin() {
	        return begin;
	    }

	    public void setBegin(int begin) {
	        this.begin = begin;
	    }

	    public int getMainId() {
	        return mainId;
	    }

	    public void setMainId(int main_id) {
	        this.mainId = main_id;
	    }

	    public String getSituation() {
	        return situation;
	    }

	    public void setSituation(String situation) {
	        this.situation = situation;
	    }
}
