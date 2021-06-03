package PersonRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.Answer;
import com.example.Situations;

public class SituationMapper implements RowMapper<Situations> {

    private AnswerRepository repo;
    public void setRepo(AnswerRepository repo) {
    	this.repo = repo;
  
    }
    
	@Override
	public Situations mapRow(ResultSet rs, int rowNum) throws SQLException {
		Situations s = new Situations();
		s.setMainId(rs.getInt("main_id"));	
		s.setSituation(rs.getString("situation"));
		s.setBegin(rs.getInt("begin"));
		System.out.println(repo == null);
		s.setAnswers(
				new ArrayList<Answer>(
						repo.getAnswers(s.getMainId()
								)));
	        return s;	
	        
	  }
}


