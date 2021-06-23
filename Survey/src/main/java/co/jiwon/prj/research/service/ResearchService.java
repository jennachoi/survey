package co.jiwon.prj.research.service;

import java.util.List;

import co.jiwon.prj.research.vo.ResearchVO;

public interface ResearchService {
	List<ResearchVO> researchSelectList();
	ResearchVO researchSelect(ResearchVO vo);
	int researchInsert(ResearchVO vo);
	int researchUpdate(ResearchVO vo);
	int researchDelete(ResearchVO vo);
}
