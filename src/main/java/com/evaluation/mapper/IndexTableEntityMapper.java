package com.evaluation.mapper;

import com.evaluation.entity.IndexTableEntity;
import com.evaluation.entity.IndexTableEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 课程指标数据操作类
 */
@Repository
public interface IndexTableEntityMapper {
    long countByExample(IndexTableEntityExample example);

    int deleteByExample(IndexTableEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insertBatch(List<IndexTableEntity> records);

    int insert(IndexTableEntity record);

    int insertSelective(IndexTableEntity record);

    IndexTableEntity selectOneByExample(IndexTableEntityExample example);

    List<IndexTableEntity> selectByExamplePaging(@Param("example") IndexTableEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<IndexTableEntity> selectByExample(IndexTableEntityExample example);

    IndexTableEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IndexTableEntity record, @Param("example") IndexTableEntityExample example);

    int updateByExample(@Param("record") IndexTableEntity record, @Param("example") IndexTableEntityExample example);

    int updateByPrimaryKeySelective(IndexTableEntity record);

    int updateByPrimaryKey(IndexTableEntity record);
}