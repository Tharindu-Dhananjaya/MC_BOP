package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.ApprovalCat;
import mc.kurunegala.bop.model.ApprovalCatExample;
import org.apache.ibatis.annotations.Param;

public interface ApprovalCatMapper {
    long countByExample(ApprovalCatExample example);

    int deleteByExample(ApprovalCatExample example);

    int deleteByPrimaryKey(Integer idapprovalCat);

    int insert(ApprovalCat record);

    int insertSelective(ApprovalCat record);

    List<ApprovalCat> selectByExample(ApprovalCatExample example);

    ApprovalCat selectByPrimaryKey(Integer idapprovalCat);

    int updateByExampleSelective(@Param("record") ApprovalCat record, @Param("example") ApprovalCatExample example);

    int updateByExample(@Param("record") ApprovalCat record, @Param("example") ApprovalCatExample example);

    int updateByPrimaryKeySelective(ApprovalCat record);

    int updateByPrimaryKey(ApprovalCat record);
}