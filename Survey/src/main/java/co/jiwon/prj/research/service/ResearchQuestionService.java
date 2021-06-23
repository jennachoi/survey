package co.jiwon.prj.research.service;

import java.util.List;

import co.jiwon.prj.research.vo.ResearchQuestionVO;

public interface ResearchQuestionService {
	List<ResearchQuestionVO> questionList(ResearchQuestionVO vo);
	
//	ResearchQuestionVO researchSelect(ResearchQuestionVO vo);
//	int researchInsert(ResearchQuestionVO vo);
//	int researchUpdate(ResearchQuestionVO vo);
//	int researchDelete(ResearchQuestionVO vo);
}
