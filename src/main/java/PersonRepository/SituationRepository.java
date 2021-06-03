package PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.Situations;
@Component

public class SituationRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

    @Autowired
    private AnswerRepository repo;
	 
	   public Situations getSituations(Integer main_id){
		   SituationMapper mapper = new SituationMapper();
		   System.out.println(mapper==null);
		   mapper.setRepo(repo);
	       return jdbcTemplate.queryForObject("SELECT * FROM \"situations\" WHERE\"main_id\"= ?",mapper, main_id);
	   }
	   
	   public Situations getBeginSituations() {
		   SituationMapper mapper = new SituationMapper();
		   System.out.println(mapper==null);
		   mapper.setRepo(repo);
	       return jdbcTemplate.queryForObject("SELECT * FROM \"situations\" WHERE\"begin\"= 1 limit 1", mapper);

	   }

}
