class SortUtility
{
       



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
	
 int comparisons=0;
long start=System.currentTimeMillis();
     Integer comparnums=ar.sort(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        comparisons++;
        return o1.compareTo(o2);
    } 
    });       
long end=System.currentTimeMillis(); 
long total=end-start;
   
   int k=(ar.size()-1)/2;
  int median=ar.get(k);


System.err.println("median"+","+total);
 System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+comparnums);

}




}
