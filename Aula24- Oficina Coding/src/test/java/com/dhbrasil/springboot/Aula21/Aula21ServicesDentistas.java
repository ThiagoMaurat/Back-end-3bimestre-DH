package com.dhbrasil.springboot.Aula21;

import com.dhbrasil.springboot.Aula21.dao.impl.DentistaDaoH2;
import com.dhbrasil.springboot.Aula21.model.Dentista;
import com.dhbrasil.springboot.Aula21.model.Usuario;
import com.dhbrasil.springboot.Aula21.service.DentistaService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class Aula21ServicesDentistas {
	private static DentistaService dentistaService = new DentistaService(
			new DentistaDaoH2());

	@Test
	void contextLoads() {
	}

	@Test
	public void carregarTresDentistas(){
		Dentista d1 = new Dentista("Pedro", "pramos@gmail.com", 123456789,0);
		Dentista d2 = new Dentista("Thiago", "thiago@gmail.com", 12345678,0);
		Dentista d3 = new Dentista("Guilherme", "guilherme@gmail.com", 1234589,0);
		dentistaService.salvar(d1);
		dentistaService.salvar(d2);
		dentistaService.salvar(d3);
	}

	@Test
	public void trazerTodosDentistas(){
		List<Dentista> dentistas = dentistaService.buscarTodos();
		System.out.println(dentistas);
	}

	@Test
	public void excluirDentistaComId2(){
			dentistaService.excluir(2);
	}

	@Test
	public void buscarPorId(){
		Optional<Dentista> asd = dentistaService.buscar(8);
		System.out.println(asd);
	}

	@Test
	public void busccarDentistaPorId1(){
		Optional<Dentista> d = dentistaService.buscar(8);
		System.out.println(d);
	}

	@Test
	public void excluirdentista(){
		dentistaService.excluir(2);
	}

	@Test
	public void atualizarDentistaComId3(){
		Dentista d = new Dentista(8,"Pedro", "dentista@gmail.com", 123456789,1);
		Dentista denteupdate = dentistaService.atualizar(d);
		System.out.println(denteupdate);
	}
}
