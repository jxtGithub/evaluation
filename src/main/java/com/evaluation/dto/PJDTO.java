package com.evaluation.dto;

import lombok.Data;

/**
 * @author: xieyong
 * @date: 2019/4/25 22:57
 * @Description:
 */
@Data
public class PJDTO {

    private Long id;

    private Integer zongfen;

    private String shijian;

    private String teacherName;

    private String studentName;

    private String courseName;

    public void setId(Long id) {
        this.id = id;
    }
    public void setZongfen(Integer zongfen) {
        this.zongfen = zongfen;
    }
    public void setShijian(String shijian) {
        this.shijian = shijian;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
