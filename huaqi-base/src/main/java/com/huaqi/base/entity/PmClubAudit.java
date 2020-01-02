package com.huaqi.base.entity;

import java.util.Date;

public class PmClubAudit {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.id
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.club_user_id
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private Long clubUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.audit_status
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private String auditStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.audit_type
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private String auditType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.audit_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.audit_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private String auditUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.create_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.create_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.update_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.update_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pm_club_audit.is_deleted
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    private Boolean isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.id
     *
     * @return the value of pm_club_audit.id
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.id
     *
     * @param id the value for pm_club_audit.id
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.club_user_id
     *
     * @return the value of pm_club_audit.club_user_id
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public Long getClubUserId() {
        return clubUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.club_user_id
     *
     * @param clubUserId the value for pm_club_audit.club_user_id
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setClubUserId(Long clubUserId) {
        this.clubUserId = clubUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.audit_status
     *
     * @return the value of pm_club_audit.audit_status
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.audit_status
     *
     * @param auditStatus the value for pm_club_audit.audit_status
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.audit_type
     *
     * @return the value of pm_club_audit.audit_type
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public String getAuditType() {
        return auditType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.audit_type
     *
     * @param auditType the value for pm_club_audit.audit_type
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setAuditType(String auditType) {
        this.auditType = auditType == null ? null : auditType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.audit_time
     *
     * @return the value of pm_club_audit.audit_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.audit_time
     *
     * @param auditTime the value for pm_club_audit.audit_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.audit_user
     *
     * @return the value of pm_club_audit.audit_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public String getAuditUser() {
        return auditUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.audit_user
     *
     * @param auditUser the value for pm_club_audit.audit_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.create_time
     *
     * @return the value of pm_club_audit.create_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.create_time
     *
     * @param createTime the value for pm_club_audit.create_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.create_user
     *
     * @return the value of pm_club_audit.create_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.create_user
     *
     * @param createUser the value for pm_club_audit.create_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.update_time
     *
     * @return the value of pm_club_audit.update_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.update_time
     *
     * @param updateTime the value for pm_club_audit.update_time
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.update_user
     *
     * @return the value of pm_club_audit.update_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.update_user
     *
     * @param updateUser the value for pm_club_audit.update_user
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pm_club_audit.is_deleted
     *
     * @return the value of pm_club_audit.is_deleted
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pm_club_audit.is_deleted
     *
     * @param isDeleted the value for pm_club_audit.is_deleted
     *
     * @mbggenerated Thu Jan 02 11:58:20 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}