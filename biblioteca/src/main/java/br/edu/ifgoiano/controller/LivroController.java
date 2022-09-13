package br.edu.ifgoiano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
