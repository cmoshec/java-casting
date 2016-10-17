import java.util.ArrayList;



public class app {

	public static void main(String[] args){
		
		//declare ArraLlist object - list
		
		ArrayList<String> list=new ArrayList<>();
		Integer num;
		
		//adding values to the ArrayList with 'add' method
		
		for (int i=0;i<5;i++){
			
			num=i;
			list.add("Index number "+num.toString());
			
		}
		
		//displaying the data
		
		for (int i=0;i<list.size();i++){

			String text=list.get(i);
			System.out.println(text);

		}
		
		//displaying the data with  a different way - new for  
		for (Object obj:list){
			System.out.println(obj);
		}
			
		
	}		
}
		
	

  