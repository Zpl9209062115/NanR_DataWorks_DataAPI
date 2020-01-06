package com.nanrui.dataworks.dataapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 数据安全
 */
@Entity
@Table(name = "data_security")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class DataSecurity {

    @Id //这是一个主键
    @Column(columnDefinition = "varchar(255) COMMENT '主键自增'")
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String id;

    /**
     * 分类名
     */
    @Column(name = "category_name",columnDefinition = "varchar(255) COMMENT '分类名'")
    private String categoryName;

    /**
     * 日期
     */
    @Column(name = "date",columnDefinition = "datetime COMMENT '日期'")
    private String date;

    /**
     * 识别数据表
     */
    @Column(name = "table_number",columnDefinition = "bigint(20) COMMENT '识别数据表'")
    private Integer tableNumber;

    /**
     * 识别字段
     */
    @Column(name = "field_number",columnDefinition = "bigint(20) COMMENT '识别字段'")
    private Integer fieldNumber;

    /**
     * 识别条目
     */
    @Column(name = "record_number",columnDefinition = "bigint(20) COMMENT '识别条目'")
    private Integer recordNumber;

    public DataSecurity() {
    }

    public DataSecurity(String categoryName, String date, Integer tableNumber, Integer fieldNumber, Integer recordNumber) {
        this.categoryName = categoryName;
        this.date = date;
        this.tableNumber = tableNumber;
        this.fieldNumber = fieldNumber;
        this.recordNumber = recordNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(Integer fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public Integer getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(Integer recordNumber) {
        this.recordNumber = recordNumber;
    }
}
