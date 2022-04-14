package com.example.Projeto1;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projeto1Application {
	public static void main(String[] args) {
		int tam;
		int x = 0;
		String palavra;
		String saida1 = "";
		String saida2 = "";
		palavra = ("A diva em Argel alegra-me a vida");
		tam = palavra.length();

		do { // verifica se caracter é letra ou numero
			if((Character.isLetter(palavra.charAt(x)))||(Character.isDigit(palavra.charAt(x))))
				saida1 += palavra.charAt(x);
			x++;
		} while(x < tam);

		for(int y = (saida1.length()-1); y >= 0; y--)	// inversão da saida1
			saida2 += saida1.charAt(y);

		if((saida1.toLowerCase()).equals(saida2.toLowerCase())){	// compara as saidas - trasformação de tamaho e compara
			System.out.println("É PALÍNDROMO!!!");
		}else{
			System.out.println("NÃO É PALÍNDROMO!!!");
		}
	}
}