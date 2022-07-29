package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.entities.Person;

public class StoreDataRepository implements PanacheRepository<Person> {

}
