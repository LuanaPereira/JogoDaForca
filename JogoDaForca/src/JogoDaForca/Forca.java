/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaForca;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luhpe
 */
public class Forca {
    int vida = 5;
    ArrayList<String> listaNome = new ArrayList<String>();
    
    public void addNome(){
        listaNome.add("luana");
        listaNome.add("bruno");
        listaNome.add("leonardo");
        listaNome.add("lucy");
        listaNome.add("isadora");
        listaNome.add("jessica");
    }
    public String sortearNome(){
        Random gerador = new Random();
        int nomeSorteado = gerador.nextInt(5);
        return listaNome.get(nomeSorteado); 
    }
    public void comparar(String nomeSorteado){
        int tamanho = nomeSorteado.length();
        char[] copia = new char[tamanho]; 
        boolean controle = false;
        
        for (int i=0; i<tamanho; i++){
            copia[i] = '_';
            
        }
       System.out.println(copia);
        while(vida > 0 ){
            Scanner entrada = new Scanner(System.in);
            char letra = entrada.next().charAt(0);
            for (int j=0; j<tamanho; j++){
                if (letra == nomeSorteado.charAt(j)){
                    controle = true;
                    copia[j]=letra;
                }
            }
            if (controle == false){
                vida--;
            }
            if (vida == 0){
                entrada.close();
                System.out.println("Perdeu =(");
            }else{
                controle = false;
                System.out.println(copia);
            }
            String nomeCP = String.copyValueOf(copia);
            if (nomeSorteado.trim().equals(nomeCP)){
                entrada.close();
                System.out.println("Ganhou =)");
            }
        }
    }
    public void jogar(){
        addNome(); 
        String nome = sortearNome(); 
        comparar(nome);
    }
    
}
