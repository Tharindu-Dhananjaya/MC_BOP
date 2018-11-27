package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.Street;
import mc.kurunegala.bop.model.StreetExample;
import org.apache.ibatis.annotations.Param;

public interface StreetMapper {
    long countByExample(StreetExample example);

    int deleteByExample(StreetExample example);

    int deleteByPrimaryKey(Integer idstreet);

    int insert(Street record);

    int insertSelective(Street record);

    List<Street> selectByExample(StreetExample example);

    Street selectByPrimaryKey(Integer idstreet);

    int updateByExampleSelective(@Param("record") Street record, @Param("example") StreetExample example);

    int updateByExample(@Param("record") Street record, @Param("example") StreetExample example);

    int updateByPrimaryKeySelective(Street record);

    int updateByPrimaryKey(Street record);

	List<Street> selectByState(int state);
}