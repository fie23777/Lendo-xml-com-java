package fiexml;


import java.io.StringReader;
import java.util.List;

import org.junit.Test;

public class CarregaXmlParaTeste {

	
	@Test
	public void carregaXmlComUmNegocioEmListaUnitaria() {
	  String xmlDeTeste = "<list>" +
	          "  <negocio>" +
	          "    <preco>43.5</preco>" +
	          "    <quantidade>1000</quantidade>" +
	          "  </negocio>" +
	          "</list>"; // o XML vai aqui!
	  
	  LeitorXML leitor = new LeitorXML();
	  List<Negocio> negocios = leitor.carrega(new StringReader(xmlDeTeste));
	}
}
