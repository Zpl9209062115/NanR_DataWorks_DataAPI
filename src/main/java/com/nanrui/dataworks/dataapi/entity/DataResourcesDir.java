package com.nanrui.dataworks.dataapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 数据资源目录
 */
@Entity
@Table(name = "data_resources_dir")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class DataResourcesDir {

    @Id //这是一个主键
    @Column(columnDefinition = "varchar(255) COMMENT '主键自增'")
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String id;

    @Column(name = "total_system_count",columnDefinition = "bigint(20) COMMENT '当前共盘点的系统数' ")
    private String TotalSystemCount;

    @Column(name = "total_table_count",columnDefinition = "bigint(20) COMMENT '数据表数量' ")
    private String TotalTableCount;

    @Column(name = "valid_table_count",columnDefinition = "bigint(20) COMMENT '有效表数' ")
    private String ValidTableCount;

    @Column(name = "field_count",columnDefinition = "bigint(20) COMMENT '字段数' ")
    private String FieldCount;

    @Column(name = "delta_table_count_week",columnDefinition = "bigint(20) COMMENT '本周新增数据表数' ")
    private String DeltaTableCountWeek;

    @Column(name = "delta_field_count_week",columnDefinition = "bigint(20) COMMENT '本周新增字段数' ")
    private String DeltaFieldCountWeek;

    public DataResourcesDir() {
    }

    public DataResourcesDir(String totalSystemCount, String totalTableCount, String validTableCount, String fieldCount, String deltaTableCountWeek, String deltaFieldCountWeek) {
        TotalSystemCount = totalSystemCount;
        TotalTableCount = totalTableCount;
        ValidTableCount = validTableCount;
        FieldCount = fieldCount;
        DeltaTableCountWeek = deltaTableCountWeek;
        DeltaFieldCountWeek = deltaFieldCountWeek;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotalSystemCount() {
        return TotalSystemCount;
    }

    public void setTotalSystemCount(String totalSystemCount) {
        TotalSystemCount = totalSystemCount;
    }

    public String getTotalTableCount() {
        return TotalTableCount;
    }

    public void setTotalTableCount(String totalTableCount) {
        TotalTableCount = totalTableCount;
    }

    public String getValidTableCount() {
        return ValidTableCount;
    }

    public void setValidTableCount(String validTableCount) {
        ValidTableCount = validTableCount;
    }

    public String getFieldCount() {
        return FieldCount;
    }

    public void setFieldCount(String fieldCount) {
        FieldCount = fieldCount;
    }

    public String getDeltaTableCountWeek() {
        return DeltaTableCountWeek;
    }

    public void setDeltaTableCountWeek(String deltaTableCountWeek) {
        DeltaTableCountWeek = deltaTableCountWeek;
    }

    public String getDeltaFieldCountWeek() {
        return DeltaFieldCountWeek;
    }

    public void setDeltaFieldCountWeek(String deltaFieldCountWeek) {
        DeltaFieldCountWeek = deltaFieldCountWeek;
    }
}
