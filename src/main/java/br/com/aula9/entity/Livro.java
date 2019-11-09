package br.com.aula9.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_livro;

	@NotNull
	@Column(name = "nome_livro")
	private String nome;

	@Column(name = "autor_livro")
	private String autor;

	@Column(name = "sinopse_livro")
	private String sinopse;



//	@ManyToOne
//	@JoinColumn(name = "id_categoria", nullable = false)
//	private Categoria livro;

}
