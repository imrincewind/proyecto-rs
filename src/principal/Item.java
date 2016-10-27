package principal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Item extends ElementoMineral{
	HashMap<Bar, Integer> composicion = new HashMap<>();
	String urlDatos = "";
	public Item(String n, Integer v, Integer ubi, double exp, String url) {
		super(n, v, ubi, exp);
		urlDatos = url;
	}
	public void setComposicion(Bar b, Integer c) {
		composicion.put(b, c);
	}
	public int calcularCosto(int cant) {
		int costo = 0;
		Iterator<Entry<Bar, Integer>> it = composicion.entrySet().iterator();
		while (it.hasNext()) {
		Entry<Bar, Integer> e = it.next();
		costo += ((Bar)e.getKey()).calcularCosto(1)*((Integer)e.getValue());
		}
		
		System.out.println("costo materiales, "+  nombre + " x"+cant +": " + (costo*cant));
		return costo*cant;
	}
	public void calcularGanancia(int cant) {
		System.out.println("ganancia " + nombre + " x" + cant + ": " + (valor*cant - this.calcularCosto(cant)));
		
	}
	public void setValor(LeerArchivo d) throws IOException {
		valor = d.obtenerValor(this,urlDatos);
	}
	@Override
	public double getXp(int cant) {
		double xp = 0d;
		
		Iterator<Entry<Bar, Integer>> it = composicion.entrySet().iterator();
		while (it.hasNext()) {
		Entry<Bar, Integer> e = it.next();
		xp += ((Bar)e.getKey()).getXp(1)*((Integer)e.getValue());
		}
		
		System.out.println("XP ganada haciendo "+  nombre + " x"+cant +": " + xp*cant);
		
		return xp;
	}
}
