package com.cognizant.processpensionmicroservice.service;

import com.cognizant.processpensionmicroservice.entity.PensionDetail;
import com.cognizant.processpensionmicroservice.model.PensionerDetail;

import java.util.List;

public interface ProcessPensionService {
    PensionDetail calculate(PensionerDetail pensionerDetail);

    List<PensionDetail> findPensionDetail();
}
