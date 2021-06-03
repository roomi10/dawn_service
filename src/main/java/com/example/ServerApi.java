package com.example;

import java.util.List;

public interface ServerApi {
	@GET("getSituations")
	List<Situations> getSituations(String text);
	
	@GET("getAnswers")
	List<Answer> getAnswer(String text);
}
