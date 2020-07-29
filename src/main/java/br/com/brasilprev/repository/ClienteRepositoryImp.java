package br.com.brasilprev.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.brasilprev.beans.Cliente;

@Repository
public class ClienteRepositoryImp implements ClienteRepository{
	Logger logger = LoggerFactory.getLogger(ClienteRepositoryImp.class);

	@Override
	public Cliente populaCliente() {
		logger.info("Populando um cliente.");
		
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setNome("Mateus Borges Damasceno");
		cliente.setEmail("mateusbdamasceno@gmail.com");
		cliente.setSenha("12345");
		cliente.setRua("Avenida Nove de Julho");
		cliente.setCidade("São Paulo");
		cliente.setBairro("Consolação");
		cliente.setCep("01313-001");
		cliente.setEstado("SP");
		
		return cliente;
	}

}
