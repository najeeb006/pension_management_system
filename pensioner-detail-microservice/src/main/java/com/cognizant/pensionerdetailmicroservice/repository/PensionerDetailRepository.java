package com.cognizant.pensionerdetailmicroservice.repository;

import com.cognizant.pensionerdetailmicroservice.entity.PensionerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PensionerDetailRepository extends JpaRepository<PensionerDetail,String> {


    
}
