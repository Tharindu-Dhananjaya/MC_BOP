package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.UserHasApprovalCat;
import mc.kurunegala.bop.model.UserHasApprovalCatExample;
import org.apache.ibatis.annotations.Param;

public interface UserHasApprovalCatMapper {
	long countByExample(UserHasApprovalCatExample example);

	int deleteByExample(UserHasApprovalCatExample example);

	int deleteByPrimaryKey(Integer iduserHasApprovalCat);

	int insert(UserHasApprovalCat record);

	int insertSelective(UserHasApprovalCat record);

	List<UserHasApprovalCat> selectByExample(UserHasApprovalCatExample example);

	UserHasApprovalCat selectByPrimaryKey(Integer iduserHasApprovalCat);

	int updateByExampleSelective(@Param("record") UserHasApprovalCat record,
			@Param("example") UserHasApprovalCatExample example);

	int updateByExample(@Param("record") UserHasApprovalCat record,
			@Param("example") UserHasApprovalCatExample example);

	int updateByPrimaryKeySelective(UserHasApprovalCat record);

	int updateByPrimaryKey(UserHasApprovalCat record);

	List<UserHasApprovalCat> selectByUserId(int userId);
}