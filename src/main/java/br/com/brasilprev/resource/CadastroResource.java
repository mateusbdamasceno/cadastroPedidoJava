package br.com.brasilprev.resource;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import br.com.brasilprev.enums.ExceptionMessageEnum;
import br.com.brasilprev.service.CadastroService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/cadastro")
public class CadastroResource {
	
	@Autowired
	CadastroService cadastroService;
	
	@ApiOperation(value = "A findalidade desse serviço é cadastrar um pedido.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Alteração realizada com sucesso"),
			@ApiResponse(code = 200, message = "É apresentada a mensagem de erro da exceção"),
			@ApiResponse(code = 422, message = "'status' ou 'codRegraExec' com valor null")})
	@PostMapping(path = "/cadastraPedido")
	@ResponseStatus(HttpStatus.OK)
	//Essa seria a chamada correta, em um caso real o pedido viria preenchido do cliente, porém ele foi populado na classe CadastroRepositoryImp
	//public Response registraPedido(@RequestBody PedidoItem pedido) throws Exception {
	public Response registraPedido() throws Exception {
		
		//Esse if faria a verificação se o pedido viesse null
		/*if(pedido==null) {
			//UNPROCESSABLE_ENTITY
			return Response.status(422).entity(ExceptionMessageEnum.PedidoInvalido.getMensagem()).build();
		}*/
		
		cadastroService.cadastraPedido();
		
		return Response.status(Status.OK).entity(ExceptionMessageEnum.Sucesso.getMensagem()).build();
	}

}
