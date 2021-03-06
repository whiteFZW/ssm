package com.generator.pojo;

public class OperationRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_record.operation_record_id
     *
     * @mbggenerated
     */
    private Integer operationRecordId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_record.operating_object
     *
     * @mbggenerated
     */
    private String operatingObject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_record.operating_people
     *
     * @mbggenerated
     */
    private String operatingPeople;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_record.operating_date
     *
     * @mbggenerated
     */
    private String operatingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_record.operating_name
     *
     * @mbggenerated
     */
    private String operatingName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_record.operation_record_id
     *
     * @return the value of operation_record.operation_record_id
     *
     * @mbggenerated
     */
    public Integer getOperationRecordId() {
        return operationRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_record.operation_record_id
     *
     * @param operationRecordId the value for operation_record.operation_record_id
     *
     * @mbggenerated
     */
    public void setOperationRecordId(Integer operationRecordId) {
        this.operationRecordId = operationRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_record.operating_object
     *
     * @return the value of operation_record.operating_object
     *
     * @mbggenerated
     */
    public String getOperatingObject() {
        return operatingObject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_record.operating_object
     *
     * @param operatingObject the value for operation_record.operating_object
     *
     * @mbggenerated
     */
    public void setOperatingObject(String operatingObject) {
        this.operatingObject = operatingObject == null ? null : operatingObject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_record.operating_people
     *
     * @return the value of operation_record.operating_people
     *
     * @mbggenerated
     */
    public String getOperatingPeople() {
        return operatingPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_record.operating_people
     *
     * @param operatingPeople the value for operation_record.operating_people
     *
     * @mbggenerated
     */
    public void setOperatingPeople(String operatingPeople) {
        this.operatingPeople = operatingPeople == null ? null : operatingPeople.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_record.operating_date
     *
     * @return the value of operation_record.operating_date
     *
     * @mbggenerated
     */
    public String getOperatingDate() {
        return operatingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_record.operating_date
     *
     * @param operatingDate the value for operation_record.operating_date
     *
     * @mbggenerated
     */
    public void setOperatingDate(String operatingDate) {
        this.operatingDate = operatingDate == null ? null : operatingDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_record.operating_name
     *
     * @return the value of operation_record.operating_name
     *
     * @mbggenerated
     */
    public String getOperatingName() {
        return operatingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation_record.operating_name
     *
     * @param operatingName the value for operation_record.operating_name
     *
     * @mbggenerated
     */
    public void setOperatingName(String operatingName) {
        this.operatingName = operatingName == null ? null : operatingName.trim();
    }
}