package com.precedentes.Exeptions;

import java.io.IOException;

public class ExeptionsGerais {
	
	public String dadoNaoEncontrado() {
		
		try {
			return "Dado Não Encontrado!";
			
		} catch (Exception e) {
			return e.getMessage();
						
		}
		
	}

}
