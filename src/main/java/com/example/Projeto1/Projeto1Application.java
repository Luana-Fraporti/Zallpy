package com.example.Projeto1;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Projeto1Application {
		public static void main (String[]args){

			String saida1 = "";
			String saida2 = "";
			String palavra = "Olé! Maracujá, caju, caramelo".replaceAll("á|à|â|ã|ä","a") .replaceAll("é|è|ê|ë","e").replaceAll("\\p{Punct}", "").toLowerCase();;
			int tam = palavra.length();
			int x = 0;

			do { // verifica se caracter é letra ou numero
				if ((Character.isLetter(palavra.charAt(x))) || (Character.isDigit(palavra.charAt(x))))
					saida1 += palavra.charAt(x);
				x++;

			}

			while (x < tam);
			tam = saida1.length() - 1;
			saida1 = saida1.toLowerCase();
			for (int y = (tam); y >= 0; y--)    // inversão da saida1
				saida2 += saida1.charAt(y);

			if ((saida1).equals(saida2)) {    // compara as saidas - trasformação de tamanho e compara
				System.out.println("É PALÍNDROMO!!!");
			} else {
				System.out.println("NÃO É PALÍNDROMO!!!");
			}
		}
	}
