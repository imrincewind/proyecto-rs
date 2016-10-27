package principal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bar extends ElementoMineral{
HashMap<Ore, Integer> composicion = new HashMap<>();
final String urlDatos = "C:\\TUDAI-ws\\proyecto-rs\\src\\principal\\txt\\metals.txt";

public Bar(String n, Integer v, Integer ubi, double exp){
	super(n, v, ubi, exp);
}
public void setComposicion(Ore o, Integer c) {
	composicion.put(o, c);
}
public int calcularCosto(int cant) {
	int costo = 0;
	Iterator<Entry<Ore, Integer>> it = composicion.entrySet().iterator();
	while (it.hasNext()) {
	Entry<Ore, Integer> e = it.next();
	costo += ((Ore)e.getKey()).getValor()*((Integer)e.getValue());
	}
	
	
	return costo*cant;
}

public void calcularGanancia(int cant) {
	System.out.println("ganancia " + nombre + " x" + cant + ": " + (valor*cant - this.calcularCosto(cant)));
	//return valor*cant - this.calcularCosto(cant);
}
public void setValor(LeerArchivo d) throws IOException {
	valor = d.obtenerValor(this,urlDatos);
}
}
