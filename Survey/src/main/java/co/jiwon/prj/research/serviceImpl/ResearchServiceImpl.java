package co.jiwon.prj.research.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jiwon.prj.research.map.ResearchMap;
import co.jiwon.prj.research.service.ResearchService;
import co.jiwon.prj.research.vo.ResearchVO;

@Repository("researchDao")
public class ResearchServiceImpl implements ResearchService {

	@Autowired
	private ResearchMap map;
	
	@Override
	public List<ResearchVO> researchSelectList() {
		return map.researchSelectList();
	}

	@Override
	public ResearchVO researchSelect(ResearchVO vo) {
		return map.researchSelect(vo);
	}

	@Override
	public int researchInsert(ResearchVO vo) {
		return map.researchInsert(vo);
	}

	@Override
	public int researchUpdate(ResearchVO vo) {
		return map.researchUpdate(vo);
	}

	@Override
	public int researchDelete(ResearchVO vo) {
		return map.researchDelete(vo);
	}

}
