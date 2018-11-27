package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.AssNature;
import mc.kurunegala.bop.model.AssNatureExample;
import org.apache.ibatis.annotations.Param;

public interface AssNatureMapper {
    long countByExample(AssNatureExample example);

    int deleteByExample(AssNatureExample example);

    int deleteByPrimaryKey(Integer idassNature);

    int insert(AssNature record);

    int insertSelective(AssNature record);

    List<AssNature> selectByExample(AssNatureExample example);

    AssNature selectByPrimaryKey(Integer idassNature);

    int updateByExampleSelective(@Param("record") AssNature record, @Param("example") AssNatureExample example);

    int updateByExample(@Param("record") AssNature record, @Param("example") AssNatureExample example);

    int updateByPrimaryKeySelective(AssNature record);

    int updateByPrimaryKey(AssNature record);
}