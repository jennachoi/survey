package co.jiwon.prj.research.map;

import java.util.List;

import co.jiwon.prj.research.vo.ResearchQuestionVO;

public interface ResearchQuestionMap {
	
	List<ResearchQuestionVO> questionList(ResearchQuestionVO vo);
//	
//	@Select("select * from research where id = #{id}")
//	ResearchQuestionVO researchSelect(ResearchQuestionVO vo);
//	
//	int researchInsert(ResearchQuestionVO vo);
//	
//	int researchUpdate(ResearchQuestionVO vo);
//	
//	@Delete("delete from research where id = #{id}")
//	int researchDelete(ResearchQuestionVO vo);
}
