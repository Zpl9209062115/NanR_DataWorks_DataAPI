package com.nanrui.dataworks.dataapi.dao;

import com.nanrui.dataworks.dataapi.entity.DataSecurity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSecurityRepository extends JpaRepository<DataSecurity,String> {
}
