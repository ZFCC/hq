package com.huaqi.applet.dao;


import com.huaqi.applet.controller.dto.QueryTeacherByPageDTO;
import com.huaqi.applet.entry.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherDao {

    Teacher selectTeacherByName(String name);

    public int insetTeacher(Teacher teacher);

    public int updateTeacher(Teacher teacher);

//    public QueryResult<Teacher> queryTeachersByPage(QueryParam param);

    List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO);
}
