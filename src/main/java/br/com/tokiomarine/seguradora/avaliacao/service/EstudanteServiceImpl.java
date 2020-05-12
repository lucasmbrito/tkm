package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

// TODO Efetue a implementação dos métodos da classe service
@Service
public class EstudanteServiceImpl implements EstudandeService {

	@Autowired
	private EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {
		try {
			this.repository.save(estudante);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			throw new RuntimeException("Erro ao salvar estudantes.");
		}
	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		try {
			this.repository.save(estudante);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			throw new RuntimeException("Erro ao atualizar estudantes.");
		}
	}

	@Override
	public List<Estudante> buscarEstudantes() {
		try {
			return this.repository.findAll();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			throw new RuntimeException("Erro ao buscar estudantes.");
		}
	}

	@Override
	public Estudante buscarEstudante(Integer id) {
		try {
			return this.repository.getOne(id);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			throw new RuntimeException("Erro ao buscar estudantes.");
		}
	}

	@Override
	public void excluirEstudante(Integer id) {
		try {
			this.repository.deleteById(id);
		}catch (Exception e) {
			throw new RuntimeException("Erro ao excluir estudante.");
		}
	}

}
