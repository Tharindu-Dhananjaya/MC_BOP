package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.UserHasApplicationCatagory;
import mc.kurunegala.bop.model.UserHasApplicationCatagoryExample;
import org.apache.ibatis.annotations.Param;

public interface UserHasApplicationCatagoryMapper {
    long countByExample(UserHasApplicationCatagoryExample example);

    int deleteByExample(UserHasApplicationCatagoryExample example);

    int deleteByPrimaryKey(Integer iduserHasApplicationCatagory);

    int insert(UserHasApplicationCatagory record);

    int insertSelective(UserHasApplicationCatagory record);

    List<UserHasApplicationCatagory> selectByExample(UserHasApplicationCatagoryExample example);

    UserHasApplicationCatagory selectByPrimaryKey(Integer iduserHasApplicationCatagory);

    int updateByExampleSelective(@Param("record") UserHasApplicationCatagory record, @Param("example") UserHasApplicationCatagoryExample example);

    int updateByExample(@Param("record") UserHasApplicationCatagory record, @Param("example") UserHasApplicationCatagoryExample example);

    int updateByPrimaryKeySelective(UserHasApplicationCatagory record);

    int updateByPrimaryKey(UserHasApplicationCatagory record);
}