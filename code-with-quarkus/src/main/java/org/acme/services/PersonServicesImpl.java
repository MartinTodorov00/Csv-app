package org.acme.services;

import org.acme.entities.Person;
import org.acme.repositories.StoreDataRepository;

import javax.transaction.Transactional;

public class PersonServicesImpl implements PersonServices {

    StoreDataRepository storeDataRepository = new StoreDataRepository();

    @Transactional
    public void create(Person person) {
        storeDataRepository.persist(person);
        if (storeDataRepository.isPersistent(person)) {
            System.out.println("Is persist");
        }
    }
}
