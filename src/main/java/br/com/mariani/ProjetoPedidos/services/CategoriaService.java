package br.com.mariani.ProjetoPedidos.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mariani.ProjetoPedidos.domain.Categoria;
import br.com.mariani.ProjetoPedidos.repositories.CategoriaRepositorie;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositorie repo;
	
	
	public Categoria buscar(Integer id) {
		try {
			Optional<Categoria> obj = repo.findById(id);
			return obj.get();
		} catch (Exception e) {
			System.out.println("Item não cadastrado");
			return null;
		}
		
	}
}
