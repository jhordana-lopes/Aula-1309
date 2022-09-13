package br.edu.ifgoiano.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.edu.ifgoiano.entidade.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long> {

}
