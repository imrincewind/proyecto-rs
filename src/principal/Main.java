package principal;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		
		File ores = new File("C:\\TUDAI-ws\\proyecto-rs\\src\\principal\\ores.txt");
		LeerArchivo datos = new LeerArchivo();
		//datos.conectarDB();
		
		// ores
		Ore runite = new Ore("runite", 10490,182,125);
		Ore coal = new Ore("coal", 183,47,50);
		Ore adamantite = new Ore("adamantite", 1000, 19, 95);
		
		
		
		//bars
		Bar rune = new Bar("rune", 14035,167,75);
		Bar adamant = new Bar("adamant", 2300, 4, 62.5d);
		rune.setComposicion(coal, 8);
		rune.setComposicion(runite, 1);
		adamant.setComposicion(coal, 6);
		adamant.setComposicion(adamantite, 1);
		
		
		
		//ITEMS
		Item runeSword = new Item("rune sword", 12490, 28,75, "C:\\TUDAI-ws\\proyecto-rs\\src\\principal\\txt\\itemsRune.txt");
		runeSword.setComposicion(rune, 1);
		Item adamantPlateBody = new Item("adamant Platebody", 5000, 533,62.5d, "C:\\TUDAI-ws\\proyecto-rs\\src\\principal\\txt\\itemsAdamant.txt");
		adamantPlateBody.setComposicion(adamant, 5);
		
		//tomando datos de los valores
		runite.setValor(datos);
		coal.setValor(datos);
		rune.setValor(datos);
		adamantite.setValor(datos);
		adamant.setValor(datos);
		runeSword.setValor(datos);
		adamantPlateBody.setValor(datos);
		
		System.out.println("valor G.E adamant bar: " + adamant.getValor());
		System.out.println("valor G.E adamantite ore: " + adamantite.getValor());
		System.out.println("valor G.E runite ore: " + runite.getValor());
		System.out.println("valor G.E coal: " + coal.getValor());
		System.out.println("valor G.E rune bar: " + rune.getValor());
		System.out.println("valor G.E rune sword: " + runeSword.getValor());
adamant.calcularGanancia(1);
rune.calcularGanancia(1);
runeSword.calcularGanancia(1);
runeSword.calcularGanancia(1);
runeSword.getXp(1);
adamantPlateBody.calcularGanancia(1);
adamantPlateBody.getXp(1);
	}

}
