package com.huaqi.web.dao;

import com.huaqi.base.entity.PmSpecialContestRelation;

public interface PmSpecialContestRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_special_contest_relation
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_special_contest_relation
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insert(PmSpecialContestRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_special_contest_relation
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insertSelective(PmSpecialContestRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_special_contest_relation
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    PmSpecialContestRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_special_contest_relation
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKeySelective(PmSpecialContestRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_special_contest_relation
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKey(PmSpecialContestRelation record);
}