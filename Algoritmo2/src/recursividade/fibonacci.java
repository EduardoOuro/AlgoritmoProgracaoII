/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author luis.eoconrado
 */
public class fibonacci {
    public static void  main( String args[] ){
  
    int resposta = Fib(11);
   
    System.out.println("Fibonacci de 11:"+resposta);
  
  }
  public static int Fib( int n )
  {
    if( n == 0 || n == 1)
      return n;
    else
      return Fib(n-1)+Fib(n-2);

  }
    
}
