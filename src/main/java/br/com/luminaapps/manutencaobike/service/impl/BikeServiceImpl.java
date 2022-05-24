package br.com.luminaapps.manutencaobike.service.impl;

import br.com.luminaapps.manutencaobike.model.Bike;
import br.com.luminaapps.manutencaobike.repository.BikeRepository;
import br.com.luminaapps.manutencaobike.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public Bike findById(Long id) {
        //need throw exception if null?
        return bikeRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Bike> findByOwnerId(Long ownerId) {
        return bikeRepository.findByOwnerId(ownerId);
    }
}
