package com.cognizant.processpensionmicroservice.repository;

import com.cognizant.processpensionmicroservice.entity.PensionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessPensionRepository extends JpaRepository<PensionDetail,Integer> {


}
