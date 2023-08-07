package com.pcc.apitest.repository;

import com.pcc.apitest.entity.apientity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
    public interface apijparepositoty extends JpaRepository<apientity, Date> {

}
