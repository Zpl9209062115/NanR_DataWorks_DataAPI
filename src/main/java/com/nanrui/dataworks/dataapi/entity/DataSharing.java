package com.nanrui.dataworks.dataapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 数据共享
 */
@Entity
@Table(name = "data_sharing")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class DataSharing {
    @Id //这是一个主键
    @Column(columnDefinition = "varchar(255) COMMENT '主键自增'")
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String id;

    /**
     * 场景名字
     */
    @Column(name = "business_name",columnDefinition = "varchar(255) COMMENT '场景名字'")
    private String businessName;

    /**
     * 依赖的贴源层表数量
     */
    @Column(name = "table_dependency_count",columnDefinition = "bigint(20) COMMENT '依赖的贴源层表数量'")
    private String tableDependencyCount;

    /**
     * 基础系统名字
     */
    @Column(name = "system_name",columnDefinition = "varchar(255) COMMENT '基础系统名字'")
    private String systemName;

    public DataSharing() {
    }

    public DataSharing(String businessName, String tableDependencyCount, String systemName) {
        this.businessName = businessName;
        this.tableDependencyCount = tableDependencyCount;
        this.systemName = systemName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getTableDependencyCount() {
        return tableDependencyCount;
    }

    public void setTableDependencyCount(String tableDependencyCount) {
        this.tableDependencyCount = tableDependencyCount;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}
