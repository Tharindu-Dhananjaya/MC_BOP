package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.ApprovalBy;
import mc.kurunegala.bop.model.ApprovalByExample;
import org.apache.ibatis.annotations.Param;

public interface ApprovalByMapper {
    long countByExample(ApprovalByExample example);

    int deleteByExample(ApprovalByExample example);

    int deleteByPrimaryKey(Integer idapprovalBy);

    int insert(ApprovalBy record);

    int insertSelective(ApprovalBy record);

    List<ApprovalBy> selectByExample(ApprovalByExample example);

    ApprovalBy selectByPrimaryKey(Integer idapprovalBy);

    int updateByExampleSelective(@Param("record") ApprovalBy record, @Param("example") ApprovalByExample example);

    int updateByExample(@Param("record") ApprovalBy record, @Param("example") ApprovalByExample example);

    int updateByPrimaryKeySelective(ApprovalBy record);

    int updateByPrimaryKey(ApprovalBy record);
}