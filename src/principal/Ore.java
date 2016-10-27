package principal;

import java.io.IOException;

public class Ore extends ElementoMineral{
	
	final String urlDatos = "C:\\TUDAI-ws\\proyecto-rs\\src\\principal\\txt\\metals.txt";
	
public Ore(String n,Integer v, Integer ubi, double exp) {
	super(n, v, ubi, exp);
}


public void setValor(LeerArchivo d) throws IOException {
	valor = d.obtenerValor(this,urlDatos);
}

}
