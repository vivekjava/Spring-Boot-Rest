package com.vivek.service.anticorruption.mapper;

import com.vivek.service.anticorruption.model.CreditCardMessage;
import com.vivek.service.services.dto.CCReportsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CreditCardMapper {
    @Mapping(target = "id",ignore = true)
    CCReportsDTO mapResponse(CreditCardMessage requestMessage);
}
