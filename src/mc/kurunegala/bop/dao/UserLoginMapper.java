package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.UserLogin;
import mc.kurunegala.bop.model.UserLoginExample;
import org.apache.ibatis.annotations.Param;

public interface UserLoginMapper {
    long countByExample(UserLoginExample example);

    int deleteByExample(UserLoginExample example);

    int deleteByPrimaryKey(Integer iduserLogin);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    List<UserLogin> selectByExample(UserLoginExample example);

    UserLogin selectByPrimaryKey(Integer iduserLogin);

    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}