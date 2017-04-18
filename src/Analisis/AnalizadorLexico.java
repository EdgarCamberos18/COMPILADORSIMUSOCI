package Analisis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//COMENTARIO
public class AnalizadorLexico {
    String regex;
    Pattern patron;
    
    public AnalizadorLexico(){
    
    }
    //EJEMPLO BASICO PARA IMPLEMENTAR EXPRESIONES REGULARES PARA VALIDAR UN TEXTO DE PARÁMETRO
    public boolean validacionEjemploExpresionRegular(String txt){
        String[] listaTextos=txt.split(",");
        regex = "[A-Za-z]+ +[A-Za-z]";
        patron = Pattern.compile(regex);
		for (String texto : listaTextos) {
			Matcher emparejador = patron.matcher(texto);
			boolean esCoincidente = emparejador.find();
			if (esCoincidente) {
				return true;
			}
		}
        return false;
    }
    //LISTA DE METODOS NECESARIOS PARA HACER FUNCIONAR EL ANALIZADOR
    /*
        1)ARREGLO QUE ALMACENE LAS PALABRAS RESERVADAS
        2)METODO QUE DETECTE SI UNA PALABRA ES RESERVADA
        ...
        IR PENSANDO QUE FALTA
    */
 
    public void main(String ar[]){
        AnalizadorLexico a= new AnalizadorLexico();
        System.out.println(a.validacionEjemploExpresionRegular("Cadena a validar"));
    }
    
}
