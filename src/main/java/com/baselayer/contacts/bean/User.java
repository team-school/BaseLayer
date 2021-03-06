package com.baselayer.contacts.bean;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.id
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.UserName
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.Password
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.LoginName
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.Sex
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private Boolean sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.CreateTimeDate
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private Date createTimeDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.CreateUserId
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private Integer createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.UpdateTimeDate
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private Date updateTimeDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.UpdateUserId
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    private Integer updateUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.id
     *
     * @return the value of User.id
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.id
     *
     * @param id the value for User.id
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.UserName
     *
     * @return the value of User.UserName
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.UserName
     *
     * @param userName the value for User.UserName
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.Password
     *
     * @return the value of User.Password
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.Password
     *
     * @param password the value for User.Password
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.LoginName
     *
     * @return the value of User.LoginName
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.LoginName
     *
     * @param loginName the value for User.LoginName
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.Sex
     *
     * @return the value of User.Sex
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.Sex
     *
     * @param sex the value for User.Sex
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.CreateTimeDate
     *
     * @return the value of User.CreateTimeDate
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public Date getCreateTimeDate() {
        return createTimeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.CreateTimeDate
     *
     * @param createTimeDate the value for User.CreateTimeDate
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setCreateTimeDate(Date createTimeDate) {
        this.createTimeDate = createTimeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.CreateUserId
     *
     * @return the value of User.CreateUserId
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.CreateUserId
     *
     * @param createUserId the value for User.CreateUserId
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.UpdateTimeDate
     *
     * @return the value of User.UpdateTimeDate
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public Date getUpdateTimeDate() {
        return updateTimeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.UpdateTimeDate
     *
     * @param updateTimeDate the value for User.UpdateTimeDate
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setUpdateTimeDate(Date updateTimeDate) {
        this.updateTimeDate = updateTimeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.UpdateUserId
     *
     * @return the value of User.UpdateUserId
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.UpdateUserId
     *
     * @param updateUserId the value for User.UpdateUserId
     *
     * @mbggenerated Fri Jul 12 14:56:12 CST 2019
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
}