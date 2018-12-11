package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.User;
import mc.kurunegala.bop.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer iduser);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer iduser);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	@ResultMap("BaseResultMap")
	@Select("select * from user where user_username=#{un} and user_password=#{pw} and user_status=1")
	User viewForLogin(@Param("un") String userName, @Param("pw") String password);
}