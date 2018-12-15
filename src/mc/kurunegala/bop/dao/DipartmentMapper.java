package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.Dipartment;
import mc.kurunegala.bop.model.DipartmentExample;
import org.apache.ibatis.annotations.Param;

public interface DipartmentMapper {
    long countByExample(DipartmentExample example);

    int deleteByExample(DipartmentExample example);

    int deleteByPrimaryKey(Integer iddipartment);

    int insert(Dipartment record);

    int insertSelective(Dipartment record);

    List<Dipartment> selectByExample(DipartmentExample example);

    Dipartment selectByPrimaryKey(Integer iddipartment);

    int updateByExampleSelective(@Param("record") Dipartment record, @Param("example") DipartmentExample example);

    int updateByExample(@Param("record") Dipartment record, @Param("example") DipartmentExample example);

    int updateByPrimaryKeySelective(Dipartment record);

    int updateByPrimaryKey(Dipartment record);
}