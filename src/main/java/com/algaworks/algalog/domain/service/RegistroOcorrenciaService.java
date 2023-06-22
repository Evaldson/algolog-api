package com.algaworks.algalog.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.api.model.Ocorrencia;
import com.algaworks.algalog.domain.model.Entrega;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {

	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public Ocorrencia registrar(Long entregaId, String descricao) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		return entrega.adicionarOcorrencia(descricao);
	}
}
