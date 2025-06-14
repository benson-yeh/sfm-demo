package com.benson.sfmdemo.dao.jpa;

import com.benson.sfmdemo.entity.LoginRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRecordJpaRepo extends JpaRepository<LoginRecord, Long> {}
