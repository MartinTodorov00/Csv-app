package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.entities.Person;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StoreDataRepository implements PanacheRepository<Person> {

}
