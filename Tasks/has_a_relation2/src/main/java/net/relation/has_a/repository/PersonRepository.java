package net.relation.has_a.repository;

import net.relation.has_a.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    @Query(value = "SELECT * FROM person WHERE id = :personId", nativeQuery = true)
    Person findPersonById(@Param("personId") Long personId);
}
