package br.edu.ifgoiano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifgoiano.entidade.Livro;
import br.edu.ifgoiano.servico.LivroService;
import br.edu.ifgoiano.servico.LivroServiceImpl;

@Controller
public class LivroController {
	
    private final LivroService livroServiceImpl;

    public LivroController(LivroServiceImpl livroServiceImpl) {
        this.livroServiceImpl = livroServiceImpl;
    }

    @GetMapping("/livros")
    public String listarLivros(Model model) {
        model.addAttribute("livros", livroServiceImpl.listarLivros());
        return "listar-livros";
    }   
    @GetMapping("/livros/novos")
    	public String abrirNovoLivro(Model model) {
    	Livro livro = new Livro();
    	model.addAttribute("livro", livro);
    	return "inserir-livro";
    }
    @PostMapping("/livros/inserir")
    public String inserirLivro(Livro livro) {
    	//inserir livros no banco de dados
    	this.livroServiceImpl.inserir(livro);
    	
    	return "redirect:/livros";
    }
}
