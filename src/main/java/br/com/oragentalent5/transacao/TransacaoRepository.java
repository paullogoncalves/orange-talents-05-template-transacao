package br.com.oragentalent5.transacao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.oragentalent5.transacao.dto.EventoTransacaoDTO;

public interface TransacaoRepository extends MongoRepository<EventoTransacaoDTO, Long> {

	//Page<EventoTransacaoDTO> findByEventoTransacaoDTOIdCartao(String id, Pageable pegeable);
	Page<EventoTransacaoDTO> findByCartaoId(String id, Pageable pegeable );
}
