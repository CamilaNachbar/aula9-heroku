package br.com.aula9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula9.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
