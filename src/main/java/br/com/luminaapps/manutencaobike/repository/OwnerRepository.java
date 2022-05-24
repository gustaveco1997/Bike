package br.com.luminaapps.manutencaobike.repository;

import br.com.luminaapps.manutencaobike.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
