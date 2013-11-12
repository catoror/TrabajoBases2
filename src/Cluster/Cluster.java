package Cluster;

import Punto.*;
import java.util.ArrayList;

public class Cluster implements Comparable<Cluster> {
	public Punto centroide;
	public float condicionGeneracion;
	public ArrayList<Punto> listaP;        

	public Cluster(Punto c, float d, ArrayList<Punto> al) {
		centroide = c;
		condicionGeneracion = d;
		listaP = al;
	}
	public Cluster(Punto c, ArrayList<Punto> al) {
		centroide = c;
		listaP = al;
	}

	public void maxRadio(){
		float m = Integer.MIN_VALUE;
		for(Punto f: listaP){
			float r = f.distancia(centroide);
			m = Math.max(m, r);
		}
		condicionGeneracion = m;
	}
	public void maxDiametro(){
		float m = Integer.MIN_VALUE;
		
		for(int i = 0; i<listaP.size();i++){
			for(int k = i+1; k<listaP.size();k++){
				float r = listaP.get(i).distancia(listaP.get(k));
				m = Math.max(m, r);
			}
		}
		condicionGeneracion = m;
	}
	public void promedio(){
		float m = 0;
		for(int i = 0; i<listaP.size();i++){
			for(int k = i+1; k<listaP.size();k++){
				m += listaP.get(i).distancia(listaP.get(k));
			}
		}
		condicionGeneracion = m/listaP.size();
	}
	public void minDistancia(){
		
	}
	
	public int compareTo(Cluster c) {
		return Float.compare(this.condicionGeneracion, c.condicionGeneracion);
	}
}