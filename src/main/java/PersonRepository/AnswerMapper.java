package PersonRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.Answer;

public class AnswerMapper implements RowMapper<Answer> {

	@Override
	public Answer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Answer p = new Answer();
		p.setId((rs.getInt("id")));
		p.setMainId(rs.getInt("main_id"));
		p.setAnswer(rs.getString("answer"));
		p.setNext(rs.getInt("next"));
	        return p;	
	  }
}
