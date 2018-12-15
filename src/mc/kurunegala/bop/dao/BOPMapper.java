package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.BOP;
import mc.kurunegala.bop.model.BOPExample;
import mc.kurunegala.bop.model.BOPWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface BOPMapper {
	long countByExample(BOPExample example);

	int deleteByExample(BOPExample example);

	int deleteByPrimaryKey(Integer idbop);

	int insert(BOPWithBLOBs record);

	int insertSelective(BOPWithBLOBs record);

	List<BOPWithBLOBs> selectByExampleWithBLOBs(BOPExample example);

	List<BOP> selectByExample(BOPExample example);

	BOPWithBLOBs selectByPrimaryKey(Integer idbop);

	int updateByExampleSelective(@Param("record") BOPWithBLOBs record, @Param("example") BOPExample example);

	int updateByExampleWithBLOBs(@Param("record") BOPWithBLOBs record, @Param("example") BOPExample example);

	int updateByExample(@Param("record") BOP record, @Param("example") BOPExample example);

	int updateByPrimaryKeySelective(BOPWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(BOPWithBLOBs record);

	int updateByPrimaryKey(BOP record);

	String viewMaxBopNo();

	@Select("select * from bop where BOP_no=#{bopNo}")
	@ResultMap("ResultMapWithBLOBs")
	BOPWithBLOBs selectByBopNo(String bopNo);
}