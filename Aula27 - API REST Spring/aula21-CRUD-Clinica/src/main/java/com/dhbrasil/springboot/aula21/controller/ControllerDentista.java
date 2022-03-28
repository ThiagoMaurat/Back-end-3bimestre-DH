package com.dhbrasil.springboot.aula21.controller;

import com.dhbrasil.springboot.aula21.dao.impl.DentistaDaoH2;
import com.dhbrasil.springboot.aula21.model.Dentista;
import com.dhbrasil.springboot.aula21.service.DentistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentistas")
public class ControllerDentista {
    private DentistaService dentistaService = new DentistaService(new DentistaDaoH2());

    @PostMapping
    public ResponseEntity<Dentista> cadastrar(@RequestBody Dentista dentista) {
        return ResponseEntity.ok(dentistaService.salvar(dentista));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentista> buscar(@PathVariable Integer id) {
        return ResponseEntity.ok(dentistaService.buscar(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<Dentista>> buscarTodos() {
        return ResponseEntity.ok(dentistaService.buscarTodos());
    }

    @PutMapping
    public ResponseEntity<Dentista> atualizar(@RequestBody Dentista dentista) {
        ResponseEntity<Dentista> dentistaResponse = null;
        if (dentista.getId() != null && dentistaService.buscar(dentista.getId()).isPresent()) {
            dentistaResponse = ResponseEntity.ok(dentistaService.atualizar(dentista));
        } else {
            dentistaResponse = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return dentistaResponse;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir(@PathVariable Integer id) {
        ResponseEntity<String> dentistaResponse = null;
        if (dentistaService.buscar(id).isPresent()) {
            dentistaService.excluir(id);
            dentistaResponse = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Dentista excluído com sucesso!");
        } else {
            dentistaResponse = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return dentistaResponse;
    }

}
