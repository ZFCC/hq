package com.huaqi.base.service;

import com.huaqi.web.pojo.QueryTeacherByPageDTO;
import com.huaqi.web.pojo.FileUploadeDTO;
import com.huaqi.web.entry.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher findAllTeacher(String name);

    public int insertTeacher(Teacher teacher);

    public  int updateTeacher(Teacher teacher);

    public List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO);

    public int photoUploade(FileUploadeDTO fileUploadeDTO);

    public FileUploadeDTO getPhotoByNumber(int id);
}
