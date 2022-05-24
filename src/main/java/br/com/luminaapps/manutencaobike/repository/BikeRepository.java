package br.com.luminaapps.manutencaobike.repository;

import br.com.luminaapps.manutencaobike.model.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends CrudRepository<Bike, Long> {
    Iterable<Bike> findByOwnerId(Long ownerId);
}
