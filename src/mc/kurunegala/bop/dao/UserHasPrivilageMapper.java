package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.UserHasPrivilage;
import mc.kurunegala.bop.model.UserHasPrivilageExample;
import org.apache.ibatis.annotations.Param;

public interface UserHasPrivilageMapper {
    long countByExample(UserHasPrivilageExample example);

    int deleteByExample(UserHasPrivilageExample example);

    int deleteByPrimaryKey(Integer iduserHasPrivilage);

    int insert(UserHasPrivilage record);

    int insertSelective(UserHasPrivilage record);

    List<UserHasPrivilage> selectByExample(UserHasPrivilageExample example);

    UserHasPrivilage selectByPrimaryKey(Integer iduserHasPrivilage);

    int updateByExampleSelective(@Param("record") UserHasPrivilage record, @Param("example") UserHasPrivilageExample example);

    int updateByExample(@Param("record") UserHasPrivilage record, @Param("example") UserHasPrivilageExample example);

    int updateByPrimaryKeySelective(UserHasPrivilage record);

    int updateByPrimaryKey(UserHasPrivilage record);
}