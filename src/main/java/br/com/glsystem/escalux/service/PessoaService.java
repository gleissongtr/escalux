package br.com.glsystem.escalux.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.glsystem.escalux.controller.dto.PessoaDTO;
import br.com.glsystem.escalux.domain.Pessoa;
import br.com.glsystem.escalux.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
//	@Transactional
//	public FuncionalidadeDTO incluir(FuncionalidadeDTO funcionalidadeDTO) throws Exception {
//		validar(funcionalidadeDTO);
//		Funcionalidade funcionalidade = new Funcionalidade(funcionalidadeDTO);
//		return toDTO(funcionalidadeRepository.save(funcionalidade));
//	}
//
//	@Transactional
//	public FuncionalidadeDTO alterar(FuncionalidadeDTO funcionalidadeDTO) throws Exception {
//		validar(funcionalidadeDTO);
//		Funcionalidade funcionalidade = new Funcionalidade(funcionalidadeDTO);
//		return toDTO(funcionalidadeRepository.save(funcionalidade));
//	}
//
//	@Transactional
//	public void excluir(Long id) throws Exception {
//		try {
//			funcionalidadeRepository.delete(id);
//		} catch (EmptyResultDataAccessException e) {
//			LOGGER.log(Level.SEVERE, e.getMessage(), e);
//			throw new RecursoNaoEncontradoException("Funcionalidade não encontrada");
//		}
//	}
//
//	public FuncionalidadeDTO detalhar(Long id) throws Exception {
//		Funcionalidade funcionalidade = funcionalidadeRepository.findOne(id);
//		if(funcionalidade == null){
//			throw new RecursoNaoEncontradoException("Funcionalidade não encontrada");
//		}
//		return toDTO(funcionalidade);
//	}
	
	public List<PessoaDTO> listar(Map<String, String> filtro) throws Exception {
		List<Pessoa> lstPessoa = pessoaRepository.findAll();
		lstPessoa.add(new Pessoa());
		return lstPessoa.stream().map(pessoa -> new PessoaDTO(pessoa)).collect(Collectors.toList());
	}
	
	
	
	
}
