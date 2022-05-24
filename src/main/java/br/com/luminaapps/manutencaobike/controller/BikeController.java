package br.com.luminaapps.manutencaobike.controller;

import br.com.luminaapps.manutencaobike.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/bike")
public class BikeController {
    @Autowired
    private BikeService bikeService;

    @GetMapping("/owner/{id}")
    public ResponseEntity<?> getBikesByOwner(@PathParam("id") Long ownerId) {
        return ResponseEntity.ok(bikeService.findByOwnerId(ownerId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBikeById(@PathParam("id") Long bikeId) {
        return ResponseEntity.ok(bikeService.findById(bikeId));
    }
}
