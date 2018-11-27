package mc.kurunegala.bop.dao;

import java.util.List;
import mc.kurunegala.bop.model.Uploads;
import mc.kurunegala.bop.model.UploadsExample;
import org.apache.ibatis.annotations.Param;

public interface UploadsMapper {
    long countByExample(UploadsExample example);

    int deleteByExample(UploadsExample example);

    int deleteByPrimaryKey(Integer iduploads);

    int insert(Uploads record);

    int insertSelective(Uploads record);

    List<Uploads> selectByExample(UploadsExample example);

    Uploads selectByPrimaryKey(Integer iduploads);

    int updateByExampleSelective(@Param("record") Uploads record, @Param("example") UploadsExample example);

    int updateByExample(@Param("record") Uploads record, @Param("example") UploadsExample example);

    int updateByPrimaryKeySelective(Uploads record);

    int updateByPrimaryKey(Uploads record);
}