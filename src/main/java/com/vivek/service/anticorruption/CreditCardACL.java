package com.vivek.service.anticorruption;

import com.vivek.service.anticorruption.mapper.CreditCardMapper;
import com.vivek.service.anticorruption.model.CreditCardMessage;
import com.vivek.service.services.dto.CCReportsDTO;
import org.springframework.stereotype.Service;

@Service
public class CreditCardACL {
    CreditCardMapper creditCardMapper;
    CreditCardACL(CreditCardMapper creditCardMapper){
        this.creditCardMapper = creditCardMapper;
    }
    public CCReportsDTO mapMessage(CreditCardMessage message){
        return creditCardMapper.mapResponse(message);
    }
}
