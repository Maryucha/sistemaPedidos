package br.com.mariani.ProjetoPedidos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mariani.ProjetoPedidos.domain.Categoria;
import br.com.mariani.ProjetoPedidos.repositories.CategoriaRepositorie;

@SpringBootApplication
public class ProjetoPedidosApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepositorie repo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		repo.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
