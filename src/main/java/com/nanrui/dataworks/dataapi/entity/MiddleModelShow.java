package com.nanrui.dataworks.dataapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 中央模块展示
 */
@Entity
@Table(name = "data_middle_show")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class MiddleModelShow {

    @Id //这是一个主键
    @Column(columnDefinition = "varchar(255) COMMENT '主键自增'")
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String id;

    /**
     * 数据分层名称
     * 包括：1、贴源层、2、共享层、3、分析层、4、服务层
     */
    @Column(name = "level_name",columnDefinition = "varchar(255) COMMENT '数据分层名称，包括：1、贴源层、2、共享层、3、分析层、4、服务层'")
    private String levelName;

    /**
     * 服务数量
     * 服务层-服务数量
     */
    @Column(name = "api_number",columnDefinition = "varchar(255) COMMENT '服务层：服务数量'")
    private String apiNumber;

    /**
     * 服务调用次数排行-API名字
     */
    @Column(name = "api_hot_trend_name",columnDefinition = "varchar(255) COMMENT '功能:展示API调用次数的列表，倒序。字段含义:展示服务API名字'")
    private String apiHotTrendName;

    /**
     * 服务调用次数排行-API调用次数
     */
    @Column(name = "api_hot_trend_num",columnDefinition = "varchar(255) COMMENT '功能:展示API调用次数的列表，倒序。字段含义:展示服务API调用次数'")
    private Integer apiHotTrendNum;

    /**
     * 汇总、维度表调用热度-表名
     */
    @Column(name = "table_hot_trend_name",columnDefinition = "varchar(255) COMMENT '功能:展示多个汇总表的使用热度、倒序。字段含义:汇总、维度表表名'")
    private Integer tableHotTrendName;

    /**
     * 汇总、维度表调用热度-调用次数
     */
    @Column(name = "table_hot_trend_num",columnDefinition = "varchar(255) COMMENT '功能:展示多个汇总表的使用热度、倒序。字段含义:汇总、维度表调用次数'")
    private Integer tableHotTrendNum;

    /**
     * 接入表数量
     */
    @Column(name = "source_table_count",columnDefinition = "bigint(20) COMMENT '接入表数量'")
    private Integer sourceTableCount;

    /**
     * 模型完成率
     */
    @Column(name = "model_complete_rate",columnDefinition = "double(13,4) COMMENT '模型完成率'")
    private Integer modelCompleteRate;

    /**
     * 模型遵从度
     */
    @Column(name = "model_follow_rate",columnDefinition = "double(13,4) COMMENT '模型遵从度'")
    private Integer modelFollowRate;

    /**
     * 数据增长量
     */
    @Column(name = "delta_data_capacity",columnDefinition = "bigint(20) COMMENT '数据增长量'")
    private Integer deltaDataCapacity;

    /**
     * 数据总容量
     */
    @Column(name = "total_data_capacity",columnDefinition = "bigint(20) COMMENT '数据总容量'")
    private Integer totalDataCapacity;

    /**
     * 运行成功任务数
     */
    @Column(name = "success_task_number",columnDefinition = "bigint(20) COMMENT '运行成功任务数'")
    private Integer successTaskNumber;

    /**
     * 运行失败任务数
     */
    @Column(name = "failed_task_number",columnDefinition = "bigint(20) COMMENT '运行失败任务数'")
    private Integer failedTaskNumber;

    public MiddleModelShow() {
    }

    public MiddleModelShow(String levelName, String apiNumber, String apiHotTrendName, Integer apiHotTrendNum, Integer tableHotTrendName, Integer tableHotTrendNum, Integer sourceTableCount, Integer modelCompleteRate, Integer modelFollowRate, Integer deltaDataCapacity, Integer totalDataCapacity, Integer successTaskNumber, Integer failedTaskNumber) {
        this.levelName = levelName;
        this.apiNumber = apiNumber;
        this.apiHotTrendName = apiHotTrendName;
        this.apiHotTrendNum = apiHotTrendNum;
        this.tableHotTrendName = tableHotTrendName;
        this.tableHotTrendNum = tableHotTrendNum;
        this.sourceTableCount = sourceTableCount;
        this.modelCompleteRate = modelCompleteRate;
        this.modelFollowRate = modelFollowRate;
        this.deltaDataCapacity = deltaDataCapacity;
        this.totalDataCapacity = totalDataCapacity;
        this.successTaskNumber = successTaskNumber;
        this.failedTaskNumber = failedTaskNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getApiNumber() {
        return apiNumber;
    }

    public void setApiNumber(String apiNumber) {
        this.apiNumber = apiNumber;
    }

    public String getApiHotTrendName() {
        return apiHotTrendName;
    }

    public void setApiHotTrendName(String apiHotTrendName) {
        this.apiHotTrendName = apiHotTrendName;
    }

    public Integer getApiHotTrendNum() {
        return apiHotTrendNum;
    }

    public void setApiHotTrendNum(Integer apiHotTrendNum) {
        this.apiHotTrendNum = apiHotTrendNum;
    }

    public Integer getTableHotTrendName() {
        return tableHotTrendName;
    }

    public void setTableHotTrendName(Integer tableHotTrendName) {
        this.tableHotTrendName = tableHotTrendName;
    }

    public Integer getTableHotTrendNum() {
        return tableHotTrendNum;
    }

    public void setTableHotTrendNum(Integer tableHotTrendNum) {
        this.tableHotTrendNum = tableHotTrendNum;
    }

    public Integer getSourceTableCount() {
        return sourceTableCount;
    }

    public void setSourceTableCount(Integer sourceTableCount) {
        this.sourceTableCount = sourceTableCount;
    }

    public Integer getModelCompleteRate() {
        return modelCompleteRate;
    }

    public void setModelCompleteRate(Integer modelCompleteRate) {
        this.modelCompleteRate = modelCompleteRate;
    }

    public Integer getModelFollowRate() {
        return modelFollowRate;
    }

    public void setModelFollowRate(Integer modelFollowRate) {
        this.modelFollowRate = modelFollowRate;
    }

    public Integer getDeltaDataCapacity() {
        return deltaDataCapacity;
    }

    public void setDeltaDataCapacity(Integer deltaDataCapacity) {
        this.deltaDataCapacity = deltaDataCapacity;
    }

    public Integer getTotalDataCapacity() {
        return totalDataCapacity;
    }

    public void setTotalDataCapacity(Integer totalDataCapacity) {
        this.totalDataCapacity = totalDataCapacity;
    }

    public Integer getSuccessTaskNumber() {
        return successTaskNumber;
    }

    public void setSuccessTaskNumber(Integer successTaskNumber) {
        this.successTaskNumber = successTaskNumber;
    }

    public Integer getFailedTaskNumber() {
        return failedTaskNumber;
    }

    public void setFailedTaskNumber(Integer failedTaskNumber) {
        this.failedTaskNumber = failedTaskNumber;
    }
}
