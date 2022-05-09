package Baloncesto;

import java.util.*; 

public class Main {
	
	Scanner sc = new Scanner(System.in);
	static ArrayList<NBA> nb = new ArrayList<NBA>();
	
	public void introducir() {
		
		NBA nba[] = new NBA[10];
		nba[0] = new NBA("Le Bron James",39,"Lakers",10,"Los Angeles");
		nba[1] = new NBA("Michael Jordan",27,"Gulls",20,"Chicago");
		nba[2] = new NBA("kevin Durant",62,"Nets",15,"Brooklin");
		nba[3] = new NBA("Stephen Curry",21,"Warriors",11,"Golden state");
		nba[4] = new NBA("Paul Gasol",69,"Seleccion",5,"España");
		nba[5] = new NBA("Kobe Bryant",10,"Lakers",12,"Los Angeles");
		nba[6] = new NBA("Devin Booker",71,"Suns",4,"Phoenix");
		nba[7] = new NBA("James Harden",31,"76er",3,"Philadelpia");
		nba[8] = new NBA("Trae Young",26,"hawks",2,"Athlanta");
		nba[9] = new NBA("Cris Paul",43,"Suns",1,"Phoenix");
		
		for(int i=0;i<nba.length;i++) {
			nb.add(nba[i]);
		}
		
	}
	
	public void consul_dat_nom(String nombre) {
		
		Iterator<NBA> c = nb.iterator();
		int i = 0;
		
		if(nb.isEmpty()) {
			System.out.println("Introduce primero valores");
		}
		else {
			while(c.hasNext()) {
				if(c.next().getNombre() == nombre) {
					System.out.println(nb.get(i));
				}
				i++;
			}
		}
		
		/*if(nb.isEmpty()) {
			System.out.println("Introduce primero valores");
		}
		else {
			for(int i=0; i<nb.size();i++) {
				if(nb.get(i).getNombre() == nombre) {
					System.out.println(nb.get(i).toString());
				}
			}
		}*/
	}
	
	public void consul_prob_jug(String provincia) {
		
		Iterator<NBA> c = nb.iterator();
		int i=0;
		
		if(nb.isEmpty()) {
			System.out.println("Introduce primero valores");
		}
		else {
			while(c.hasNext()) {
				if(c.next().getCiudad() == provincia) {
					System.out.println(nb.get(i).getNombre());
				}
				i++;
			}
		}
		
	}
	
	public void midifi_canas(int canastas, String nombre) {
		
		for(int i=0;i<nb.size();i++) {
			if(nb.get(i).getNombre() == nombre) {
				nb.get(i).setNumCanIntroducidas(canastas);
			}
		}
	}
	
	public void borrar_jug_pocas_can() {
		/*Hay que terminarlo*/
			
			/*Collections.sort(nb, new Comparator<NBA>(){
				public int compare(NBA j1,NBA j2) {
					return Integer.valueOf(j1.numCanIntroducidas).compareTo(j2.numCanIntroducidas);
				}
			});*/
		
			Collections.sort(nb, new Comparator<NBA>(){
				public int compare(NBA j1,NBA j2) {
					return Integer.valueOf(j2.numCanIntroducidas).compareTo(j1.numCanIntroducidas);
				}
			});
			
	}

	public void borrado_todo() {
		nb.removeAll(nb);
	}
	
	public static void main(String[]args) {
		
		Main main = new Main();
		
		//Introducir los valores
		main.introducir();
		
		//Coger a los jugadores con esos dos nombre
		main.consul_dat_nom("Le Bron James");
		main.consul_dat_nom("Cris Paul");
		
		//coger el nombre de jugador de esa provincia
		main.consul_prob_jug("Los Angeles");
		
		System.out.println("");
		
		//Imprimir los jugadores
		for(int i=0;i<nb.size();i++) {
			System.out.println(nb.get(i));
		}
		
		System.out.println("");
		
		//Modificar canastas
		main.midifi_canas(5, "kevin Durant");
		
		for(int i=0;i<nb.size();i++) {
			System.out.println(nb.get(i));
		}
		
		System.out.println("");
		
		//Ordenar con Comparator
		main.borrar_jug_pocas_can();
		
		for(int i=0;i<nb.size();i++) {
			System.out.println(nb.get(i));
		}
		
		System.out.println("");
		
		//Borrado de datos 
		main.borrado_todo();
		
		main.consul_dat_nom("Le Bron James");
		main.consul_dat_nom("Cris Paul");
	}
	

}

