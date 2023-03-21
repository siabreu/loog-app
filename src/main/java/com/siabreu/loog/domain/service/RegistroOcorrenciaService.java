package com.siabreu.loog.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siabreu.loog.domain.model.Entrega;
import com.siabreu.loog.domain.model.Ocorrencia;

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
