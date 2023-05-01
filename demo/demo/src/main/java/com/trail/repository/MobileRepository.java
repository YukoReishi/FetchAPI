package com.trail.repository;

import com.trail.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long> {

    List<Mobile> findByBrand(String brandName);
}
