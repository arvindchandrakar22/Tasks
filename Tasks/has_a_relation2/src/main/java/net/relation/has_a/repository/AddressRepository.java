package net.relation.has_a.repository;

import net.relation.has_a.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    @Query(value = "SELECT * FROM persons_address WHERE id = :addressId", nativeQuery = true)
    Address findAddressById(@Param("addressId") Long addressId);
}
