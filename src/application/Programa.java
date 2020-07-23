/*Vamos fazer um m�todo para retornar a soma das �reas de uma lista de
figuras.*/
package application;

import java.util.ArrayList;
import java.util.List;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		List<Forma> myForma = new ArrayList<>();
		myForma.add(new Retangulo(3.0, 2.0));
		myForma.add(new Circulo(2.0));
		
		System.out.println("�rea total : " + totalArea(myForma));
		}

	public static double totalArea(List<? extends Forma> lista) {
		double soma = 0.0;
		
		for(Forma f : lista) {
			soma += f.area();
		}
		return soma;
	}
}
