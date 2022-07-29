package org.acme.services;

import org.acme.entities.Person;
import org.acme.repositories.StoreDataRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class PersonServicesImpl implements PersonServices {

    @Inject
    StoreDataRepository storeDataRepository;

    @Transactional
    public void create(Person person) {
        storeDataRepository.persist(person);
        if (storeDataRepository.isPersistent(person)) {
            System.out.println("Is persist");
        }
    }
}
