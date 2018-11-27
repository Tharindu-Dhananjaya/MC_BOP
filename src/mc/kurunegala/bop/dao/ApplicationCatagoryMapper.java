package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.ApplicationCatagory;
import mc.kurunegala.bop.model.ApplicationCatagoryExample;
import org.apache.ibatis.annotations.Param;

public interface ApplicationCatagoryMapper {
    long countByExample(ApplicationCatagoryExample example);

    int deleteByExample(ApplicationCatagoryExample example);

    int deleteByPrimaryKey(Integer idapplicationCatagory);

    int insert(ApplicationCatagory record);

    int insertSelective(ApplicationCatagory record);

    List<ApplicationCatagory> selectByExample(ApplicationCatagoryExample example);

    ApplicationCatagory selectByPrimaryKey(Integer idapplicationCatagory);

    int updateByExampleSelective(@Param("record") ApplicationCatagory record, @Param("example") ApplicationCatagoryExample example);

    int updateByExample(@Param("record") ApplicationCatagory record, @Param("example") ApplicationCatagoryExample example);

    int updateByPrimaryKeySelective(ApplicationCatagory record);

    int updateByPrimaryKey(ApplicationCatagory record);
}