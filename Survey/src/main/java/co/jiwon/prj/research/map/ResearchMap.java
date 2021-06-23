package co.jiwon.prj.research.map;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import co.jiwon.prj.research.vo.ResearchVO;

public interface ResearchMap {
	@Select("select * from research")
	List<ResearchVO> researchSelectList();
	
	@Select("select * from research where id = #{id}")
	ResearchVO researchSelect(ResearchVO vo);
	
	int researchInsert(ResearchVO vo);
	
	int researchUpdate(ResearchVO vo);
	
	@Delete("delete from research where id = #{id}")
	int researchDelete(ResearchVO vo);
}
