package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.Privilage;
import mc.kurunegala.bop.model.PrivilageExample;
import org.apache.ibatis.annotations.Param;

public interface PrivilageMapper {
    long countByExample(PrivilageExample example);

    int deleteByExample(PrivilageExample example);

    int deleteByPrimaryKey(Integer idprivilage);

    int insert(Privilage record);

    int insertSelective(Privilage record);

    List<Privilage> selectByExample(PrivilageExample example);

    Privilage selectByPrimaryKey(Integer idprivilage);

    int updateByExampleSelective(@Param("record") Privilage record, @Param("example") PrivilageExample example);

    int updateByExample(@Param("record") Privilage record, @Param("example") PrivilageExample example);

    int updateByPrimaryKeySelective(Privilage record);

    int updateByPrimaryKey(Privilage record);
}