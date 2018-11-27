package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.Doccat;
import mc.kurunegala.bop.model.DoccatExample;
import org.apache.ibatis.annotations.Param;

public interface DoccatMapper {
    long countByExample(DoccatExample example);

    int deleteByExample(DoccatExample example);

    int deleteByPrimaryKey(Integer iddoccat);

    int insert(Doccat record);

    int insertSelective(Doccat record);

    List<Doccat> selectByExample(DoccatExample example);

    Doccat selectByPrimaryKey(Integer iddoccat);

    int updateByExampleSelective(@Param("record") Doccat record, @Param("example") DoccatExample example);

    int updateByExample(@Param("record") Doccat record, @Param("example") DoccatExample example);

    int updateByPrimaryKeySelective(Doccat record);

    int updateByPrimaryKey(Doccat record);
}