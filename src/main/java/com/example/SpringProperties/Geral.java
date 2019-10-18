package com.example.SpringProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Geral implements ApplicationListener<ContextRefreshedEvent> {

	// Carrega uma informacao do arquivo de propriedades (applications.properties)
	@Value("${geral.nome}")
	private String nome;
	
	// Carregar uma informacao do arquivo properties.yml (YAML) - É um arquivo de propriedades em um outro formato.
	@Value("${my.server}")
	private String server;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Start - Pegando uma variavel do arquivo de propriedades - geral.nome -> " + nome);
		System.out.println("Pegando uma variavel do arquivo de propriedades YAML (properties.yml) - my.server -> " + server);
	}

}
