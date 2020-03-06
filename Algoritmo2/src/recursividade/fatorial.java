
package recursividade;


public class fatorial {
    
    public static void main(String[] args) {
        System.out.println("calculo do fatorial:"+fatorial(4));
    }
    public static int fatorial( int n){
        if ( n == 0 )
            return 1;
        else{
            int fatAnterior = fatorial(n-1);
            int fatRetorno = n*fatAnterior;
            return fatRetorno;
        }
    }

    
}
