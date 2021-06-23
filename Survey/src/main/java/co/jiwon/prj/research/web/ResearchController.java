package co.jiwon.prj.research.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.jiwon.prj.research.service.ResearchService;

@Controller
public class ResearchController {
	@Autowired
	private ResearchService researchDao;
	
	@RequestMapping("researchList.do")
	public String researchList(Model model) {
		model.addAttribute("lists", researchDao.researchSelectList());
		return "research/researchList";
	}
}
