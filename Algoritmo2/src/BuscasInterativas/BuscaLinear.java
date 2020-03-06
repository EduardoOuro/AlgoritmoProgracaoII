/*
 A busca Binaria tem a caracteriste de LOG

 */
package BuscasInterativas;

/**
 *
 * @author luis.eoconrado
 */
public class BuscaLinear {
    public static int passos=0;
  public static void  main( String args[] ){
    
    //int [] v= {10,12,5,8,7,15,3,15};
    int v[] = new int[1000000];
    for(int i=0;i<v.length;i++)
      v[i] = i;
    
    imprimeVetor(v);
    
    System.out.println("k="+busca(v,v.length));
    System.out.println("Busca Linear Para N="+v.length+" passos="+passos);
    
    
  }
  /*
   Dado um inteiro x e um vetor v[0..n-1] de inteiros, o problema da busca 
   consiste em encontrar x em v, ou seja, encontrar um índice k tal que v[k] == x.
   */
  public static int busca(int v[], int x)
  {
    for( int k=0; k < v.length; k++ ){
      // contar quantas vezes executo o laco
      passos = passos + 1;
      if( v[k] == x )
        return k;
    }
    return -1;
  }
  
  public static void imprimeVetor( int [] v )
  {
    
    for( int i=0; i < v.length; i++ )
      System.out.print(v[i]+" ");
    System.out.println();
  }
    
}
