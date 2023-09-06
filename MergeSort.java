//Merge Sort:
import java.io.*;
public class MergeSort
{   
    public static void merge(int []a,int l,int mid,int h){
        int i=l;
        int j=mid+1;
        int k=l;
        int []b=new int[10];
        
        while(i<=mid && j<=h){
            if(a[i]<=a[j]){
                b[k++]=a[i++];
            }
            else{
                b[k++]=a[j++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while(j<=h){
            b[k++]=a[j++];
        }
        for(k=l;k<=h;k++){
            a[k]=b[k];
        }
    }
    public static void mergeSort(int []a,int l,int h){
        if(l<h){
           int mid=(int)Math.floor((l+h)/2);
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    
    
    public static void main(String[] args) {
        int a[]=new int[]{4,3,1,9,5,6,10,2,7,8};
        System.out.println("Before Sorting:\n");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+"\t");
        }
        mergeSort(a,0,9);
        System.out.println("\nAfter Sorting:\n");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+"\t");
     }
        
}
/*
Output:
Before Sorting:

4       3       1       9       5       6       10      2       7       8
After Sorting:

1       2       3       4       5       6       7       8       9       10
*/
        
        
	}
}
