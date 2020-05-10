package com.evaluation.dto;

import com.evaluation.entity.TeacherEntity;

/**
 * @author: xieyong
 * @date: 2019/4/23 19:48
 * @Description:
 */
public class TeacherDTO extends TeacherEntity {

    Long[] courseIds;

    public Long[] getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(Long[] courseIds) {
        this.courseIds = courseIds;
    }
}
