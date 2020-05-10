package com.evaluation.mapper;

import com.evaluation.entity.StudentEntity;
import com.evaluation.entity.StudentEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 学生数据操作类
 */
@Repository
public interface StudentEntityMapper {
    long countByExample(StudentEntityExample example);

    int deleteByExample(StudentEntityExample example);

    int deleteByPrimaryKey(Long stuId);

    int insertBatch(List<StudentEntity> records);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    StudentEntity selectOneByExample(StudentEntityExample example);

    List<StudentEntity> selectByExamplePaging(@Param("example") StudentEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<StudentEntity> selectByExample(StudentEntityExample example);

    StudentEntity selectByPrimaryKey(Long stuId);

    int updateByExampleSelective(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByExample(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByPrimaryKeySelective(StudentEntity record);

    int updateByPrimaryKey(StudentEntity record);
}