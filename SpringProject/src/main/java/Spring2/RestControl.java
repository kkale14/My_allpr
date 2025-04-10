package Spring2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {

	
		
		@RequestMapping("/employee")
		public User name()
		{
			User user=new User();
			user.setId(1);
			user.setName("Kalyani");
			
			//user.getId();
			return  user;
			
		}
		
		@RequestMapping("/valid")
		public String special()
		{

			return "error";
			
		}
}
