package co.jiwon.prj.research.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jiwon.prj.research.map.ResearchQuestionMap;
import co.jiwon.prj.research.service.ResearchQuestionService;
import co.jiwon.prj.research.vo.ResearchQuestionVO;

@Repository("questionDao")
public class ResearchQuestionServiceImpl implements ResearchQuestionService {

	@Autowired
	ResearchQuestionMap map;
	
	@Override
	public List<ResearchQuestionVO> questionList(ResearchQuestionVO vo) {
		return map.questionList(vo);
	}


}
