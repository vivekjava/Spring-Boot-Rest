package com.vivek.service.repository;

import com.vivek.service.domain.CCReports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface CCReportsRepository extends JpaRepository<CCReports, Long> {
}
