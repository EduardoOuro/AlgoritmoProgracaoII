
package recursividade;

public class mergesort {
    public static void main(String[] args) {
        int v[]= {4,1,3,2};
    
    MergeSort( v, 0, v.length);
    imprimeVetor(v);
  }
  // A funcao mergesort rearranja o vetor v[p..n-1]
  // em ordem crescente
  public static void MergeSort(int v[], int p, int n)
  {
     if (p < n-1) {
        int q = (p + n)/2;
        MergeSort( v, p, q);
        MergeSort( v, q, n);
        intercala( v, p, q, n);
     }
  }
  // A funcao recebe vetores crescentes v[p..q-1] e 
  // v[q..n-1] e rearranja v[p..n-1] em ordem crescente.
  public static void intercala(int v[], int p, int q, int n) 
  {
     int i, j, k, w[];
     w = new int[n-p]; 
     
     i = p; j = q; // preciso guardar o inicio e o meio dos vetores
     k = 0;
  
     while (i < q && j < n) {
        if (v[i] <= v[j])  
          w[k++] = v[i++];
        else  
          w[k++] = v[j++];
     }
     // testa caso resta algum elemento no vetores
     while (i < q) 
       w[k++] = v[i++];
     while (j < n)  
       w[k++] = v[j++];
     
         
     for (i = p, j=0; i < n; i++, j++)  
       v[i] = w[j];
     
  }
  
  public static void imprimeVetor( int [] v )
  {
    
    for( int i=0; i < v.length; i++ )
      System.out.println("v["+i+"]:"+v[i]);

  }
    
    
}
