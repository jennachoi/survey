package co.jiwon.prj;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home.do")
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@RequestMapping("*/*Form.do")	// 폼들은 모두 여기서 호출
	public String researchFormCall(HttpServletRequest request) {
		String viewPage = request.getServletPath();
		viewPage = viewPage.substring(0, viewPage.lastIndexOf(".do"));
		return viewPage;
	}
}
