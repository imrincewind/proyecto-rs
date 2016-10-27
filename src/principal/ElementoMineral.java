package principal;

public abstract class ElementoMineral {
	Integer valor;
	String nombre;
	Integer ubicacion;
	double xp;
	
	public ElementoMineral(String n,Integer v, Integer ubi, double exp) {
		valor = v;
		nombre = n;
		ubicacion = ubi;
		xp = exp;
	}
	public Integer getValor() {
		return valor;
	}
	public Integer getUbicacion() {
		return ubicacion;
	}
	public double getXp(int cant) {
		return xp*cant;
	}
}
