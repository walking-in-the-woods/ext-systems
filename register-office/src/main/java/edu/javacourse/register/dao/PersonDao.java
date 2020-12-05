package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;

import javax.persistence.*;
import java.util.List;

public class PersonDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> findPersons() {
        Query query = entityManager.createNamedQuery("Person.findPersons");
        query.setParameter("personId", 1L);
        return query.getResultList();
    }

    public Long addPerson(Person person) {
//        EntityTransaction tr = entityManager.getTransaction();
//        tr.begin();
//        try {
            entityManager.persist(person); // save person
            entityManager.flush(); // drop all temporary data
//            tr.commit();
//        } catch (Exception e) {
//            tr.rollback();
//            throw new RuntimeException(e);
//        }
        return person.getPersonId();
    }
}
