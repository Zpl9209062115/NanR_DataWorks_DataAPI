package com.nanrui.dataworks.dataapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 两级贯通
 */
@Entity
@Table(name = "two_stage_through")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class TwoStageThrough {

    @Id //这是一个主键
    @Column(columnDefinition = "varchar(255) COMMENT '主键自增'")
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String id;

    /**
     * 省份名字
     */
    @Column(name = "province_name",columnDefinition = "varchar(255) COMMENT '省份名字'")
    private String provinceName;

    /**
     * 上传数据量
     */
    @Column(name = "upload",columnDefinition = "double(13,4) COMMENT '上传数据量'")
    private String upload;

    /**
     * 下发数据量
     */
    @Column(name = "download",columnDefinition = "double(13,4) COMMENT '下发数据量'")
    private String download;

    public TwoStageThrough() {
    }

    public TwoStageThrough(String provinceName, String upload, String download) {
        this.provinceName = provinceName;
        this.upload = upload;
        this.download = download;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }
}
