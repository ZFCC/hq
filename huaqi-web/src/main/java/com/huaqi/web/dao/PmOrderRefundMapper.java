package com.huaqi.web.dao;

import com.huaqi.base.entity.PmOrderRefund;

public interface PmOrderRefundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_order_refund
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_order_refund
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insert(PmOrderRefund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_order_refund
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int insertSelective(PmOrderRefund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_order_refund
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    PmOrderRefund selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_order_refund
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKeySelective(PmOrderRefund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_order_refund
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    int updateByPrimaryKey(PmOrderRefund record);
}