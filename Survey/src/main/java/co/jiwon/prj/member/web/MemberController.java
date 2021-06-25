package co.jiwon.prj.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.jiwon.prj.member.service.MemberService;
import co.jiwon.prj.member.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberDao;
	
	@RequestMapping("memberRegister.do")
	public String memberRegister(
			@ModelAttribute("MemberVO") MemberVO vo, Model model, 
			@RequestParam("confirmPassword") String confirmPassword) { 
		// RequsetParam을 이용하면 VO를 이용하지 않고도 한개 이상의 파라미터를 받아올 수 있다. 
		
		System.out.println(confirmPassword);
		
		int n = memberDao.memberInsert(vo);
		if(n!=0) {
			model.addAttribute("msg", "등록에 성공하였습니다.");
		} else {
			model.addAttribute("msg", "등록에 실패하였습니다.");
		}
		model.addAttribute("MemberVO", vo);
//		return "member/memberRegister";
		return "member/memberInputForm"; // 이렇게 자기자신을 리턴하면 입력된 값을 그대로 보여줌 
	}
	
	@RequestMapping("member/memberInputForm")
	public String memberInputForm(MemberVO vo, Model model) {
		model.addAttribute("MemberVO", vo);
		return "member/memberInputForm";
	}
	
}
