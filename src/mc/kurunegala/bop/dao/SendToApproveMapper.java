package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.SendToApprove;
import mc.kurunegala.bop.model.SendToApproveExample;
import org.apache.ibatis.annotations.Param;

public interface SendToApproveMapper {
    long countByExample(SendToApproveExample example);

    int deleteByExample(SendToApproveExample example);

    int deleteByPrimaryKey(Integer idsendToApprove);

    int insert(SendToApprove record);

    int insertSelective(SendToApprove record);

    List<SendToApprove> selectByExample(SendToApproveExample example);

    SendToApprove selectByPrimaryKey(Integer idsendToApprove);

    int updateByExampleSelective(@Param("record") SendToApprove record, @Param("example") SendToApproveExample example);

    int updateByExample(@Param("record") SendToApprove record, @Param("example") SendToApproveExample example);

    int updateByPrimaryKeySelective(SendToApprove record);

    int updateByPrimaryKey(SendToApprove record);
}