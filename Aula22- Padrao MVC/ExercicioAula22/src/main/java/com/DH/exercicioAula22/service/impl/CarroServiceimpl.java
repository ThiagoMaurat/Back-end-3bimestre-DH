package com.DH.exercicioAula22.service.impl;

import com.DH.exercicioAula22.model.Carros;
import com.DH.exercicioAula22.service.CarroService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarroServiceimpl implements CarroService {

    @Override
    public List<Carros> listar() {
            return Arrays.asList(
                    new Carros("VW", "Gol"),
                    new Carros("VW", "Fox"),
                    new Carros("VW", "Up!")
            );

    }
}
