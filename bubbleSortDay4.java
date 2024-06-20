//bubble sort


public class Main{
    public static void main(String[] args){
       
        int n=5;
        int a[]=new int[]{2,44,3,5,1};
        for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1;j++)
          {
            if(a[j]>a[j+1])
            {
              int temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
            
            
            
          } 
        }
        for(int k=0;k<n;k++)
        {
          System.out.print(a[k]+" ");
       }
        
        
    }
}
