package co.jiwon.prj.research.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.jiwon.prj.research.service.ResearchQuestionService;
import co.jiwon.prj.research.service.ResearchResponseService;
import co.jiwon.prj.research.service.ResearchService;
import co.jiwon.prj.research.vo.ResearchQuestionVO;
import co.jiwon.prj.research.vo.ResearchResponseVO;
import co.jiwon.prj.research.vo.ResearchVO;

@Controller
public class ResearchController {
	@Autowired
	private ResearchService researchDao;

	@Autowired
	private ResearchQuestionService questionDao;
	
	@Autowired
	private ResearchResponseService responseDao;
	
	@RequestMapping("researchList.do")
	public String researchList(Model model) {
		model.addAttribute("lists", researchDao.researchSelectList());
		return "research/researchList";
	}
	
	@RequestMapping("researchSelect.do")
	public String researchSelect(ResearchVO vo, Model model) {
		model.addAttribute("vo", researchDao.researchSelect(vo));
		return "research/researchSelect";
	} 
	
	@RequestMapping("researchAppend.do") 
	public String researchAppend(ResearchVO vo, Model model){
		ResearchQuestionVO rvo = new ResearchQuestionVO();
		rvo.setId(vo.getId());
		model.addAttribute("researchTitle",researchDao.researchSelect(vo));
		model.addAttribute("qlists", questionDao.questionList(rvo));
		return "research/researchAppend";
	}
	
	@RequestMapping("researchAppendWrite.do")
	public String researchAppendWrite(Model model, HttpServletRequest req) {
		List<ResearchResponseVO> list = new ArrayList<ResearchResponseVO>();
		ResearchResponseVO vo = new ResearchResponseVO();
		
		//int len = Integer.parseInt(req.getParameter("len")); // 문항 전체길이
		
		String[] result = req.getParameterValues("qResult[${q.qOrder }]");

		/* 넘겨받을 값 : responseid, qid, order, 결과값
			int id, qid, order
			qResult[1] 동일한 객체로
			while () { 
			vo 초기화
		 	넘어온 객체 vo 담고
		 	리스트 추가
		*/
		int n = responseDao.researchResponseInsert(list);
		String msg;
		if (n>0) {
			msg = "설문이 정상등록 되었습니다.";
		} else {
			msg = "설문 등록이 실패했습니다.";
		}
		
		model.addAttribute("str", msg);
		return "research/researchAppendWrite";
	}
}
