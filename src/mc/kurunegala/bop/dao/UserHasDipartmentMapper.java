package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.UserHasDipartment;
import mc.kurunegala.bop.model.UserHasDipartmentExample;
import org.apache.ibatis.annotations.Param;

public interface UserHasDipartmentMapper {
    long countByExample(UserHasDipartmentExample example);

    int deleteByExample(UserHasDipartmentExample example);

    int deleteByPrimaryKey(Integer iduserHasDepartment);

    int insert(UserHasDipartment record);

    int insertSelective(UserHasDipartment record);

    List<UserHasDipartment> selectByExample(UserHasDipartmentExample example);

    UserHasDipartment selectByPrimaryKey(Integer iduserHasDepartment);

    int updateByExampleSelective(@Param("record") UserHasDipartment record, @Param("example") UserHasDipartmentExample example);

    int updateByExample(@Param("record") UserHasDipartment record, @Param("example") UserHasDipartmentExample example);

    int updateByPrimaryKeySelective(UserHasDipartment record);

    int updateByPrimaryKey(UserHasDipartment record);
}