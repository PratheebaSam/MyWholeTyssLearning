

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id ;
	String username;
}
