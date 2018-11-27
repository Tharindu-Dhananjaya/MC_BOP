package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.Ward;
import mc.kurunegala.bop.model.WardExample;
import org.apache.ibatis.annotations.Param;

public interface WardMapper {
    long countByExample(WardExample example);

    int deleteByExample(WardExample example);

    int deleteByPrimaryKey(Integer idward);

    int insert(Ward record);

    int insertSelective(Ward record);

    List<Ward> selectByExample(WardExample example);

    Ward selectByPrimaryKey(Integer idward);

    int updateByExampleSelective(@Param("record") Ward record, @Param("example") WardExample example);

    int updateByExample(@Param("record") Ward record, @Param("example") WardExample example);

    int updateByPrimaryKeySelective(Ward record);

    int updateByPrimaryKey(Ward record);

	List<Ward> selectAllByState(int state);
}