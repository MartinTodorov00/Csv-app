package org.acme.services;

import org.acme.DTO.PersonDTO;
import org.acme.entities.Person;
import org.apache.camel.spi.DataFormat;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mappings({})
    Person mapPersonDTOToPerson(PersonDTO personDTO);

    @Mappings({})
    PersonDTO mapPersonToPersonDTO(Person person);
}