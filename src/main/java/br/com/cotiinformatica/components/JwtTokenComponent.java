package br.com.cotiinformatica.components;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.cotiinformatica.entities.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenComponent {

	/*
	 * Método para criar e retornar um TOKEN JWT para o usuário autenticado no
	 * sistema
	 */
	public String getToken(Usuario usuario) {
		
		//chave para assinatura dos tokens
		var secretKey = "f6395c0b-5993-4688-90bf-ec893e5c4706";
		
		return Jwts.builder()
	               .setSubject(usuario.getEmail()) //email do usuário
	               .claim("perfil", usuario.getPerfil().getNome()) //perfil do usuário
	               .setIssuedAt(new Date())  //data de geração do token
	               .setExpiration(new Date(System.currentTimeMillis() + 1800000)) //data de expiração do token (30min)
	               .signWith(SignatureAlgorithm.HS256, secretKey) //chave para assinatura do token
	               .compact();
		}
}
