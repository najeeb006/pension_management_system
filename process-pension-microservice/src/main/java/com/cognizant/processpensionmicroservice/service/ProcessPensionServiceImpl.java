package com.cognizant.processpensionmicroservice.service;

import com.cognizant.processpensionmicroservice.entity.PensionDetail;
import com.cognizant.processpensionmicroservice.model.PensionerDetail;
import com.cognizant.processpensionmicroservice.repository.ProcessPensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessPensionServiceImpl implements ProcessPensionService{
    private ProcessPensionRepository processPensionRepository;
    @Autowired
    public ProcessPensionServiceImpl(ProcessPensionRepository processPensionRepository){
        this.processPensionRepository=processPensionRepository;
    }

    @Override
    public PensionDetail calculate(PensionerDetail pensionerDetail) {
        double pensionAmount = 0;
        PensionDetail pensionDetail = new PensionDetail();

        if(pensionerDetail.getPensionType().equalsIgnoreCase("self")){
            pensionAmount = (0.8*pensionerDetail.getSalary()+pensionerDetail.getAllowance());
        }else if(pensionerDetail.getPensionType().equalsIgnoreCase("family")){
            pensionAmount=(0.5*pensionerDetail.getSalary()+pensionerDetail.getAllowance());
        }

        if(pensionerDetail.getBankDetail().getBankType().equalsIgnoreCase("private")){
            pensionAmount=pensionAmount-550;
            pensionDetail.setPensionAmount(pensionAmount);
            pensionDetail.setBankServiceCharge(550);
            pensionDetail.setName(pensionerDetail.getName());
            pensionDetail.setPensionType(pensionerDetail.getPensionType());
            pensionDetail.setDateOfBirth(pensionerDetail.getDateOfBirth());
            pensionDetail.setPanNumber(pensionerDetail.getPanNumber());

        }else if(pensionerDetail.getBankDetail().getBankType().equalsIgnoreCase("public")){
            pensionAmount = pensionAmount - 500;
            pensionDetail.setPensionAmount(pensionAmount);
            pensionDetail.setBankServiceCharge(500);
            pensionDetail.setName(pensionerDetail.getName());
            pensionDetail.setPensionType(pensionerDetail.getPensionType());
            pensionDetail.setDateOfBirth(pensionerDetail.getDateOfBirth());
            pensionDetail.setPanNumber(pensionerDetail.getPanNumber());
        }
       processPensionRepository.save(pensionDetail);

        return pensionDetail;
    }

    @Override
    public List<PensionDetail> findPensionDetail() {
        return processPensionRepository.findAll();
    }
}
