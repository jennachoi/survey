package co.jiwon.prj;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
}
