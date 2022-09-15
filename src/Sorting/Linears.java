package Sorting;

public class Linears {
	public static int linearSearch(String[] a1, String key){    
        for(int i=0;i<a1.length;i++){    
            if(a1[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        String[] a1= {"One","two","three","four"};    
        String key = "three";    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    

}
