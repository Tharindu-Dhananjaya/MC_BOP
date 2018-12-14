package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.ApproveDetails;
import mc.kurunegala.bop.model.ApproveDetailsExample;
import org.apache.ibatis.annotations.Param;

public interface ApproveDetailsMapper {
    long countByExample(ApproveDetailsExample example);

    int deleteByExample(ApproveDetailsExample example);

    int deleteByPrimaryKey(Integer idapproveDetails);

    int insert(ApproveDetails record);

    int insertSelective(ApproveDetails record);

    List<ApproveDetails> selectByExampleWithBLOBs(ApproveDetailsExample example);

    List<ApproveDetails> selectByExample(ApproveDetailsExample example);

    ApproveDetails selectByPrimaryKey(Integer idapproveDetails);

    int updateByExampleSelective(@Param("record") ApproveDetails record, @Param("example") ApproveDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") ApproveDetails record, @Param("example") ApproveDetailsExample example);

    int updateByExample(@Param("record") ApproveDetails record, @Param("example") ApproveDetailsExample example);

    int updateByPrimaryKeySelective(ApproveDetails record);

    int updateByPrimaryKeyWithBLOBs(ApproveDetails record);

    int updateByPrimaryKey(ApproveDetails record);
}