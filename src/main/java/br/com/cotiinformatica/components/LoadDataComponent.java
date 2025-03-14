package br.com.cotiinformatica.components;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.cotiinformatica.entities.Perfil;
import br.com.cotiinformatica.repositories.PerfilRepository;

@Component
public class LoadDataComponent implements ApplicationRunner {

	//Injeção de dependência / auto-inicialização
	@Autowired PerfilRepository perfilRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		var perfilAdministrador = new Perfil();
		perfilAdministrador.setId(UUID.fromString("21b21702-6b47-407d-942b-3c54e2ad6e9b"));
		perfilAdministrador.setNome("Administrador");
		
		var perfilOperador = new Perfil();
		perfilOperador.setId(UUID.fromString("1f1f7b5b-7e6f-4f7d-8b5b-7e6f4f7d8b5b"));
		perfilOperador.setNome("Operador");
		
		//gravando no banco de dados
		perfilRepository.save(perfilAdministrador);
		perfilRepository.save(perfilOperador);
	}

	
	
}
