package com.huaqi.web.dao;

import com.huaqi.base.entity.UmPlayer;

public interface UmPlayerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table um_player
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table um_player
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insert(UmPlayer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table um_player
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insertSelective(UmPlayer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table um_player
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    UmPlayer selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table um_player
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKeySelective(UmPlayer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table um_player
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKey(UmPlayer record);
}