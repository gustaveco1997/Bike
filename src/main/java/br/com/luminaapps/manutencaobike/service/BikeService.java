package br.com.luminaapps.manutencaobike.service;

import br.com.luminaapps.manutencaobike.model.Bike;

public interface BikeService {
    Bike findById(Long id);
    Iterable<Bike> findByOwnerId(Long ownerId);
}
