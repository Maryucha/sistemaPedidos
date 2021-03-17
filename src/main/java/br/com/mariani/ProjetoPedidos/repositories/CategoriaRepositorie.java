package br.com.mariani.ProjetoPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mariani.ProjetoPedidos.domain.Categoria;

@Repository
public interface CategoriaRepositorie extends JpaRepository<Categoria, Integer> {
	
}
