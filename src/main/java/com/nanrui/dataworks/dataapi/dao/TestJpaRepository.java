package com.nanrui.dataworks.dataapi.dao;

import com.nanrui.dataworks.dataapi.entity.TestJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestJpaRepository extends JpaRepository<TestJpa,String> {

//    @Query(value = "SELECT DISTINCT bin FROM rule_wide_table WHERE variable = ?1")
//    public List<Object[]> selectJpa();

}
