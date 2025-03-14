package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AutenticarUsuarioRequestDto {

	@Email(message = "Por favor, informe um endereço de email válido.")
	@NotEmpty(message = "Por favor, informe o email de acesso.")
	private String email;
	
	@Size(min = 8, message="Por favor, informe a senha de acesso com no mínimo 8 caracteres.")
	@NotEmpty(message = "Por favor, informe a senha de acesso.")
	private String senha;
	
	
}
