package PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.Answer;


@Component
public class AnswerRepository {

		@Autowired
	private JdbcTemplate jdbcTemplate;
	 
	   public List<Answer> getAnswers(Integer id){
	       return jdbcTemplate.query("SELECT * FROM \"answers\" WHERE\"main_id\"=?", new AnswerMapper(), id);
	   }
	 
	   //public List<Answer> getAnswers(){
	   //    return jdbcTemplate.query("SELECT * FROM \"answers\"", new AnswerMapper());
	   // }
	}



