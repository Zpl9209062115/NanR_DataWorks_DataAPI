package com.nanrui.dataworks.dataapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tbl_user_test")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class TestJpa {
    /**
     * 主键且自增
     */
    @Id //这是一个主键
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String id;

    @Column(columnDefinition = "varchar(255) COMMENT '姓名注释'")
    private String lastName;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private Integer age;

    @Column()
    private Date birthday;

    public TestJpa() {
    }

    public TestJpa(String lastName, String email, Integer age, Date birthday) {
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
