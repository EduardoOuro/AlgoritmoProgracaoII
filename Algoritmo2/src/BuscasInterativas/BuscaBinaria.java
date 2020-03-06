/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscasInterativas;

/**
 *
 * @author luis.eoconrado
 */
public class BuscaBinaria {
    // variavel global
   public static int passos=0;
   
   public static void  main( String args[] ){
  
    //int [] v= {3,7,8,11,14,18,21,25};
    int v[] = new int[1024];
    for(int i=0;i<v.length;i++)
      v[i] = i;
    
    System.out.println("resposta Busca Binaria:"+buscaBinaria(v, v.length));
    System.out.println("Busca Binaria Para N="+v.length+" passos="+passos);
  
   
  }
  /*
  Método recebe um número x e um vetor em ordem crescente v[0..n-1]. 
  Ele devolve um índice m tal que v[m] == x ou devolve -1 se tal m não existe.
  */
  public static int buscaBinaria( int v[], int x )
  {
    int i, m, f;
    i = 0; f = v.length-1;
    while (i <= f){ 
      passos = passos + 1;
      m = (i + f)/2; 
      if (v[m] == x) 
        return m;
      
      if (x < v[m]) // esquerda
        f = m - 1;
      else // x > v[m] - direita
        i = m + 1;
    }
    return -1;
  }

  public static void imprimeVetor( int [] v )
  {
    
    for( int i=0; i < v.length; i++ )
      System.out.println("v["+i+"]:"+v[i]);

  }
    
}
