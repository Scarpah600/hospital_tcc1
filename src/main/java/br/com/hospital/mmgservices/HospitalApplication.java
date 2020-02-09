package br.com.hospital.mmgservices;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.hospital.mmgservices.domain.Categoria;
import br.com.hospital.mmgservices.repository.CategoriaRepository;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//Operacao de instanciação automatico
	
	}

}
