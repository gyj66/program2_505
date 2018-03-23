import java.lang.*;
import java.util.*;
import java.io.*;


class SortUtility
{
       
  static int comparisons=0;


public static void main(String[] args)
throws IOException {

	

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String line;
	 //line=in.readLine();
    
    ArrayList<Integer> ar=new ArrayList<>();
	
	while((line=in.readLine())!=null)
	{
       ar.add(Integer.parseInt(line));
       

	}
	

long start=System.currentTimeMillis();
     ar.sort(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        comparisons++;
        return o1.compareTo(o2);
    } 
    });       
long end=System.currentTimeMillis(); 
Integer total= (int)(long)(end-start);
Integer comparnums=comparisons;
  int k=(ar.size()-1)/2;
  int median=ar.get(k);

	
System.out.println(("median"+","+median);
System.out.println(("runtime"+","+total);
 System.out.println(("comparisons"+","+comparnums);

}




}



