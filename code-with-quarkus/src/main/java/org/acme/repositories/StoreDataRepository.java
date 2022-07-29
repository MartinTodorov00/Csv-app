package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.DTO.PersonDTO;
import org.acme.entities.Person;
import org.acme.services.PersonMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import static org.apache.camel.main.EagerClassloadedHelper.LOG;

@ApplicationScoped
public class StoreDataRepository implements PanacheRepository<Person> {

//    private EntityManager em;

//    public StoreDataRepository(EntityManager em) {
//        this.em = em;
//    }

//    public StoreDataRepository() {
//    }

//    @Transactional
//    public void create(PersonDTO personDTO) {
//        Person person = PersonMapper.INSTANCE.mapPersonDTOToPerson(personDTO);
//        try {
//            persistAndFlush(person);
//        } catch (PersistenceException pe) {
//            LOG.error("Unable to create the parameter", pe);
//        }
//    }
}
