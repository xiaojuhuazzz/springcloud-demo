package com.yjk.ms_two.repository;

import com.yjk.ms_two.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByIp(String ip);
}
