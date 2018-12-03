package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.NeedDoc;
import mc.kurunegala.bop.model.NeedDocExample;
import org.apache.ibatis.annotations.Param;

public interface NeedDocMapper {
    long countByExample(NeedDocExample example);

    int deleteByExample(NeedDocExample example);

    int deleteByPrimaryKey(Integer idneeddoc);

    int insert(NeedDoc record);

    int insertSelective(NeedDoc record);

    List<NeedDoc> selectByExample(NeedDocExample example);

    NeedDoc selectByPrimaryKey(Integer idneeddoc);

    int updateByExampleSelective(@Param("record") NeedDoc record, @Param("example") NeedDocExample example);

    int updateByExample(@Param("record") NeedDoc record, @Param("example") NeedDocExample example);

    int updateByPrimaryKeySelective(NeedDoc record);

    int updateByPrimaryKey(NeedDoc record);
    
    List<NeedDoc> viewAll();
}