package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.AssDiscription;
import mc.kurunegala.bop.model.AssDiscriptionExample;
import org.apache.ibatis.annotations.Param;

public interface AssDiscriptionMapper {
    long countByExample(AssDiscriptionExample example);

    int deleteByExample(AssDiscriptionExample example);

    int deleteByPrimaryKey(Integer idassDiscription);

    int insert(AssDiscription record);

    int insertSelective(AssDiscription record);

    List<AssDiscription> selectByExample(AssDiscriptionExample example);

    AssDiscription selectByPrimaryKey(Integer idassDiscription);

    int updateByExampleSelective(@Param("record") AssDiscription record, @Param("example") AssDiscriptionExample example);

    int updateByExample(@Param("record") AssDiscription record, @Param("example") AssDiscriptionExample example);

    int updateByPrimaryKeySelective(AssDiscription record);

    int updateByPrimaryKey(AssDiscription record);
}