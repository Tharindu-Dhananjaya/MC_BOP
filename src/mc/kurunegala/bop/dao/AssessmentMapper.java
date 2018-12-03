package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.Assessment;
import mc.kurunegala.bop.model.AssessmentExample;
import mc.kurunegala.bop.model.AssessmentSearcher;

import org.apache.ibatis.annotations.Param;

public interface AssessmentMapper {
    long countByExample(AssessmentExample example);

    int deleteByExample(AssessmentExample example);

    int deleteByPrimaryKey(Integer idassessment);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    List<Assessment> selectByExample(AssessmentExample example);

    Assessment selectByPrimaryKey(Integer idassessment);

    int updateByExampleSelective(@Param("record") Assessment record, @Param("example") AssessmentExample example);

    int updateByExample(@Param("record") Assessment record, @Param("example") AssessmentExample example);

    int updateByPrimaryKeySelective(Assessment record);

    int updateByPrimaryKey(Assessment record);
    
    List<Assessment> selectAllByState(@Param("state")int state);

	List<Assessment> selectbySeracher(@Param("searcher")AssessmentSearcher searcher);
	
	Assessment selectByPrimaryKeyWithCustomer(Integer idassessment);

	/*String viewMaxAssessmentNo();*/
}