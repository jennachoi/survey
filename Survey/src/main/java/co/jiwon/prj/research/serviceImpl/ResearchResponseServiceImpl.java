package co.jiwon.prj.research.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jiwon.prj.research.map.ResearchResponseMap;
import co.jiwon.prj.research.service.ResearchResponseService;
import co.jiwon.prj.research.vo.ResearchResponseVO;

@Repository("responseDao")
public class ResearchResponseServiceImpl implements ResearchResponseService {

	@Autowired
	private ResearchResponseMap map;

	@Override
	public int researchResponseInsert(List<ResearchResponseVO> list) {
		return map.researchResponseInsert(list);
	}
}
