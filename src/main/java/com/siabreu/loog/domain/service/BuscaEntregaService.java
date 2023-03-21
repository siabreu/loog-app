package com.siabreu.loog.domain.service;

import org.springframework.stereotype.Service;

import com.siabreu.loog.domain.exception.EntidadeNaoEncontradaException;
import com.siabreu.loog.domain.model.Entrega;
import com.siabreu.loog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	private EntregaRepository entregaRepository;
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
