package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.BopHasAssessment;
import mc.kurunegala.bop.model.BopHasAssessmentExample;
import org.apache.ibatis.annotations.Param;

public interface BopHasAssessmentMapper {
    long countByExample(BopHasAssessmentExample example);

    int deleteByExample(BopHasAssessmentExample example);

    int deleteByPrimaryKey(Integer idbopHasAssessmentcol);

    int insert(BopHasAssessment record);

    int insertSelective(BopHasAssessment record);

    List<BopHasAssessment> selectByExample(BopHasAssessmentExample example);

    BopHasAssessment selectByPrimaryKey(Integer idbopHasAssessmentcol);

    int updateByExampleSelective(@Param("record") BopHasAssessment record, @Param("example") BopHasAssessmentExample example);

    int updateByExample(@Param("record") BopHasAssessment record, @Param("example") BopHasAssessmentExample example);

    int updateByPrimaryKeySelective(BopHasAssessment record);

    int updateByPrimaryKey(BopHasAssessment record);

	List<BopHasAssessment> selectByState(int state);
}