package com.huaqi.web.dao;

import com.huaqi.base.entity.PmHomePageConfig;

public interface PmHomePageConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_home_page_config
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_home_page_config
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insert(PmHomePageConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_home_page_config
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insertSelective(PmHomePageConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_home_page_config
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    PmHomePageConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_home_page_config
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKeySelective(PmHomePageConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_home_page_config
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKey(PmHomePageConfig record);
}