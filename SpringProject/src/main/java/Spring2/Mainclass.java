package Spring2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mainclass {

	@RequestMapping("/View")
public String myname(@RequestParam("name")String str,Model model)
	{
		
		model.addAttribute("abc","World" );
		System.out.println(str);
		
		return "NewFile";
	
	}
	
	@RequestMapping("/View/{xyz}")
	public String fun(@PathVariable("xyz")String str1)
	{
		System.out.println(str1);

		return "new";
		
	}
		
	@RequestMapping(path="/register" ,method=RequestMethod.POST)
	public String hello(@ModelAttribute("user") User user, Model model )
	{
		model.addAttribute("user", user);
		return "registerSuccess";
	}
	
	
	
}
