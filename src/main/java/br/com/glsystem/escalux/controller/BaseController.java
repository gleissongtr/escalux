package br.com.glsystem.escalux.controller;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.context.request.WebRequest;

public class BaseController {

	public static final String HEADER_USUARIO = "usuario";
	public static final String HEADER_SENHA = "senha";
	
	public Map<String, String> getRequestMap(WebRequest webRequest){
		return webRequest.getParameterMap().entrySet().stream()
		  .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()[0]));
	}
	
}
