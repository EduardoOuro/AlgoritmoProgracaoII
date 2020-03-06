
package recursividade;

public class TestaQuickSort {
    public static void main(String[] args) {
        int [] v= {40,30,20,10};
    
    QuickSort( v, 0, v.length-1, "");

    imprimeVetor(v);
   
  }
  // A função QuickSort recebe como parametro, p < r, 
  // e rearranja o vetor de modo que ele fique em ordem crescente. 
  public static void QuickSort( int v[], int p, int r, String tab)
  {
     if (p < r) {
        int q = particao(v, p, r );
        System.out.println(tab+"p="+p+" r="+r+" q="+q+"\n");
        QuickSort(v, p, q-1, tab+"--");
        QuickSort(v, q+1, r, tab+"--");
     }else
       System.out.println(tab+"p="+p+" r="+r+" q=?"+"\n");
    
   
  }

  // Supondo i < f, a função rearranja o vetor v[p]..v[r] de tal que de modo que: 
  // v[i]..v[j-1]<=v[j]<v[j+1]..v[f], para algum j em i..f , onde em v[j] estaria o pivô
  public static int particao( int v[], int p, int r) 
  {
     int c, i, j;
     c = v[p];
     
     i = p+1;
     j = r;
     while (i <= j) {
        if (v[i] <= c)  
          i++; // sobe i
        else if ( v[j] > c )  
          j--; // desce j
        else{
          // troca
          int t = v[i]; v[i] = v[j]; v[j] = t; 
          i++; j--;
        }
     }
     // agora p == j+1
     v[p] = v[j]; v[j]=c;
     return j;
     
  }
  public static void imprimeVetor( int [] v )
  {
    
    for( int i=0; i < v.length; i++ )
      System.out.println("v["+i+"]:"+v[i]);

  }
    
    
}
