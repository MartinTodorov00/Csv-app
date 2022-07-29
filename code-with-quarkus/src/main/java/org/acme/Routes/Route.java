package org.acme.Routes;

import org.acme.DTO.PersonDTO;
import org.acme.entities.Person;
import org.acme.services.PersonMapper;
import org.acme.services.PersonServices;
import org.acme.services.PersonServicesImpl;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

import java.util.List;

public class Route extends RouteBuilder {

    PersonServices personServices = new PersonServicesImpl();

    @Override
    public void configure() throws Exception {

        DataFormat bind = new BindyCsvDataFormat(PersonDTO.class);

        from("file:C:\\Users\\Marto\\Desktop\\Work\\EADX?fileName=username.csv")
                .unmarshal(bind)
                .log("Persons: ${body}")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        List<PersonDTO> personDTOS = exchange.getIn().getBody(List.class);

                        for (PersonDTO personDTO : personDTOS) {
                            Person person = PersonMapper.INSTANCE.mapPersonDTOToPerson(personDTO);
                            personServices.create(person);
                        }
                    }
                });
    }
}