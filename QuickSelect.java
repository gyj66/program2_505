import java.lang.*;
import java.util.*;
import java.io.*;

class QuickSelect
{

	static int comparnums;

   Integer select(List<Integer> list,int l,int r,int k)
  {
   int size=r-l+1;
   if(size<9)
   {
    
    int pindex=partition(list,l,r);

    if(k>0)
    {
     if(pindex==l+k-1)
      	return list.get(pindex);
      if(pindex>l+k-1)
       return select(list,l,pindex-1,k);
     if(pindex<l+k-1)
       return select(list,pindex+1,r,k-pindex+l-1);

    }
    



   }
    else
    {
    	if(k>0)
     { int median= medianOf3(list, l, r);
      int pindex=partitionIt(list,l,r,median);
      
      if(pindex==l+k-1)
      	return list.get(pindex);
      if(pindex>l+k-1)
       return select(list,l,pindex-1,k);
     if(pindex<l+k-1)
       return select(list,pindex+1,r,k-pindex+l-1);
     }

    }


  
  }



 public Integer medianOf3(List<Integer> list, int l, int r)
 {
    int center=(l+r)/2;
    
    if(list.get(l)>list.get(center))
    	swap(list,l,center);
    if(list.get(l)>list.get(r))
    	swap(list,l,r);
    if(list.get(center)>list.get(r))
    	swap(list,center,r);

    swap(list,center,r-1);
    comparnums+=3;

    return list.get(r-1);


  }

  public void swap(List<Integer> list,int index1,int index2)
  {
      int temp=list.get(index1);
      list.set(index1,list.get(index2));
      list.set(index2,list.get(index1));


  }

public int partitionIt(List<Integer> list,int l, int r, int pivot)
{
	// int left=l;
	// int right=r-1;
       

 //       while(true)
 //       {
 //           while(list.get(++left)<pivot)
 //           	comparnums++;


 //           while(list.get(--right)>pivot)
 //             comparnums++;

 //            comparnums+=2;
 //            if(left>=right)
 //            	break;
 //             else
 //             	swap(list,left,right);



 //       }
    
 //    swap(list,left,r-1);

 //    return left;

int i=l;
for (int j=l+1; j<r-1; j++)
        {
            comparnums++;
            if (list.get(j) <= pivot)
            {
                i++;
 
               swap(list,i,j);
            }
        }


        swap(list,i+1,r-1);
 
        return i+1;



}

public int partition(List<Integer> list, int l, int r)
{
  

   int pivot = list.get(r);
        int i = (l-1); 
        for (int j=l; j<r; j++)
        {
            comparnums++;
            if (list.get(j) <= pivot)
            {
                i++;
 
               swap(list,i,j);
            }
        }
 
        swap(list,i+1,r);
 
        return i+1;

}

public static void main(String[] args)
throws IOException
{

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String line;
	 ArrayList<Integer> ar=new ArrayList<>();
	
	while((line=in.readLine())!=null)
	{
       ar.add(Integer.parseInt(line));
       

	}
	int k=(ar.size()+1)/2;

   QuickSelect result=new QuickSelect();
   long start=System.currentTimeMillis();
	Integer median =result.select(ar,0,ar.size()-1,k);
    long end=System.currentTimeMillis(); 
     long total=end-start;
  

   System.err.println("median"+","+median);
  System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+comparnums);





}




}
