package Spring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mainclass {

	@RequestMapping("/View")
	public String myname()
	{
		return "NewFile";
	}
}
