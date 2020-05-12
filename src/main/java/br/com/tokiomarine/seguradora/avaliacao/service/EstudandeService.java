package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;

public interface EstudandeService {

	List<Estudante> buscarEstudantes();

	void cadastrarEstudante(@Valid Estudante estudante);

	Estudante buscarEstudante(Integer id);

	void atualizarEstudante(@Valid Estudante estudante);

	void excluirEstudante(Integer id);
}
