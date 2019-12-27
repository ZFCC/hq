package com.huaqi.applet.service.serviceImpl;


import com.huaqi.applet.service.TeacherService;
import com.huaqi.applet.Utils.StringUtils;
import com.huaqi.applet.controller.dto.FileUploadeDTO;
import com.huaqi.applet.controller.dto.QueryTeacherByPageDTO;
import com.huaqi.applet.dao.FileUploadeDao;
import com.huaqi.applet.dao.TeacherDao;
import com.huaqi.applet.entry.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherDao teacherDao;

    @Resource
    FileUploadeDao fileUploadeDao;

    @Override
    public Teacher findAllTeacher(String name) {
        return teacherDao.selectTeacherByName(name);
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        String phone = teacher.getPhone();
        //插入姓名不能为空
        if (teacher.getName() == null){
            return 0;
        }
        //校验手机号码是否合法,不合法就直接返回0，合法进行插入
        if (!StringUtils.validateTelNumber(phone)){
            return 0;
        }
        return teacherDao.insetTeacher(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        String phone = teacher.getPhone();
        //校验手机号码是否合法,不合法就直接返回0，合法进行更新
        if (!StringUtils.validateTelNumber(phone)){
            return 0;
        }
        return teacherDao.updateTeacher(teacher);
    }

    @Override
    public List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO) {
        return teacherDao.selectByPage(queryTeacherByPageDTO);
    }

    @Override
    public int photoUploade(FileUploadeDTO fileUploadeDTO) {
        return fileUploadeDao.photoUploade(fileUploadeDTO);
    }

    @Override
    public FileUploadeDTO getPhotoByNumber(int id) {
        return fileUploadeDao.getPhotoByUserNumber(id);
    }


}
