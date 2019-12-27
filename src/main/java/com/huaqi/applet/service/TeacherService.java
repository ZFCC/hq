package com.huaqi.applet.service;

import com.huaqi.applet.controller.dto.QueryTeacherByPageDTO;
import com.huaqi.applet.controller.dto.FileUploadeDTO;
import com.huaqi.applet.entry.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher findAllTeacher(String name);

    public int insertTeacher(Teacher teacher);

    public  int updateTeacher(Teacher teacher);

    public List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO);

    public int photoUploade(FileUploadeDTO fileUploadeDTO);

    public FileUploadeDTO getPhotoByNumber(int id);
}
