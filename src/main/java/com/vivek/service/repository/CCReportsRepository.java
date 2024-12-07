package com.vivek.service.repository;

import com.vivek.service.domain.CCReports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CCReportsRepository extends JpaRepository<CCReports, Long> {
}
