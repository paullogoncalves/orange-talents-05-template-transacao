package br.com.oragentalent5.transacao.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.oragentalent5.transacao.dto.EventoTransacaoDTO;
import br.com.oragentalent5.transacao.dto.TransacaoRequest;
import feign.Headers;

@RestController
@FeignClient(name = "transacoes", url = "http://localhost:7777")
public interface TransacaoClient {
	
	@PostMapping(value = "/api/cartoes", consumes = MediaType.APPLICATION_JSON_VALUE )
	@Headers("Content-Type: " + MediaType.APPLICATION_JSON_VALUE)
	EventoTransacaoDTO getTransacoes(@RequestBody TransacaoRequest request);
}
