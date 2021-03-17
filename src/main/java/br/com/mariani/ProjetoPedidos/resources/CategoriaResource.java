package br.com.mariani.ProjetoPedidos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mariani.ProjetoPedidos.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		Categoria categoria1 = new Categoria(1,"informática");
		return "Rest Está funcionando";
	}

}
