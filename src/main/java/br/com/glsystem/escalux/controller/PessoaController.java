package br.com.glsystem.escalux.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import br.com.glsystem.escalux.controller.dto.PessoaDTO;
import br.com.glsystem.escalux.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags= {"Pessoa"})
@RestController
@RequestMapping("/pessoas")
public class PessoaController extends BaseController {

	@Autowired
	private PessoaService pessoaService;

//	@ApiOperation(value="Incluir Agrupador", tags={"Agrupadores"})
//	@PostMapping
//	public ResponseEntity<AgrupadorDTO> incluir(@Valid @RequestBody AgrupadorDTO agrupadorDTO) throws Exception {
//		agrupadorDTO = grupoFuncionalidadeService.incluir(agrupadorDTO);
//		return ResponseEntity.created(tratarResourceURI(agrupadorDTO.getId())).body(agrupadorDTO);
//	}
//	
//	@ApiOperation(value="Alterar Agrupador", tags={"Agrupadores"})
//	@PutMapping(value = "/{id}")
//	public ResponseEntity<AgrupadorDTO> alterar(@PathVariable("id") Long id, @Valid @RequestBody AgrupadorDTO agrupadorDTO) throws Exception {
//		agrupadorDTO.setId(id);
//		return ResponseEntity.ok(grupoFuncionalidadeService.alterar(agrupadorDTO));
//	}
//	
//	@ApiOperation(value="Excluir Agrupador", tags={"Agrupadores"})
//	@DeleteMapping(value = "/{id}")
//	public ResponseEntity<Void> excluir(@PathVariable("id") Long id) throws Exception {
//		grupoFuncionalidadeService.excluir(id);
//		return ResponseEntity.ok().build();
//	}
//
//	@ApiOperation(value="Detalhar Agrupador", tags={"Agrupadores"})
//	@GetMapping(value = "/{id}")
//	public ResponseEntity<AgrupadorDTO> detalhar(@PathVariable("id") Long id) throws Exception {
//		return ResponseEntity.ok(grupoFuncionalidadeService.detalhar(id));
//	}

	@ApiOperation(value="Listar Pessoas", tags={"Pessoa"})
	@GetMapping(value = "/pessoas")
	public ResponseEntity<List<PessoaDTO>> listar(WebRequest webRequest) throws Exception {
		return ResponseEntity.ok(pessoaService.listar(getRequestMap(webRequest)));
	}
	
}
//	@Autowired
//	private GastoRepository gastoRepository;
//	
//	fazer manter pessoas
//	
//	@GetMapping
//	public ResponseEntity<Gasto> teste() {
//		return new ResponseEntity<>(gastoRepository.save(new Gasto("1213",new BigDecimal(15),new Date())), HttpStatus.OK);
//	}
//	
//}
