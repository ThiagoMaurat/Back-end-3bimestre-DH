package com.DH.exercicioAula22.controller;

import com.DH.exercicioAula22.model.Carros;
import com.DH.exercicioAula22.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {
    private CarroService carroService;

    @Autowired
    public CarroController(CarroService carroService){
        this.carroService = carroService;
    }

    @GetMapping
    public List<Carros> listar(){
        return carroService.listar();
    }
}

