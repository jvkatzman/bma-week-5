import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Assignment {

	static String[] values  = {"a","b","c"};
	
	// test different versions of index
	static int index = 2;  // first index is at 0,  last index is (length - 1)
	//static int index = 0;
	//static int index = 9;
	
	public static void main(String[] args) {
	
		System.out.println("In Main");	
		//getElement();
		
		// Assignment homework week 5 - Item 2-2
		String strvalue = getElement(values,index);
		
		if(strvalue != null ) {
			//System.out.println("value found");
		} else{
			System.out.println("no value found");
			//return;
		}// no value
		
		/////////////////////////////////////////////////////////////////////////////////////
		// create Task
		// Assignment homework week 5 - Item 2-3
		
		 Date dtDate = new Date();
		 String strDescription = "Take that shower!";
		 String strPersonName ="This is mine.";
		
		Task task0 = new Task();
		// no good: System.out.println("task0 is " + task0);
		System.out.println(task0.toString());
		
		Task task1 = new Task(dtDate, strDescription, strPersonName);
		// no good: System.out.println("task1 is " + task1);
		System.out.println(task1.toString());
		
	}//main
	
	
	// Assignment homework week 5 - Item 2-2
	 static String getElement(String[] values, int index){
		 // check if index is less than zero, array has no elements 
		 // and index greater than array element length
		if((index < 0 ) || (values.length == 0 ) || (index >= values.length))  {
			System.out.println("Index out of range");
			return null;
		}//index check
		else{
		System.out.println(values[index]);
		return values[index];
		}
	}//getElement
	
	
}//Assignment


////////////////////////////////////////////////////////////////////////////////////////
//Assignment homework week 5 - Item 2-3
class Task {
	 
	 Date itemDate;
	 String itemDescription;
	 String itemPersonName;
	 
	 
	 Task(){
		 System.out.println("No arguments");
		 itemDate=null;
		 itemDescription="";
		 itemPersonName="";		 
	 }// no arguments
	 
	 Task(Date dt, String Description, String PersonName){
		 System.out.println("All 3 arguments");
		 itemDate=dt;
		 itemDescription=Description;
		 itemPersonName=PersonName;		
	 }// all 3 arguments

	 
		public String toString(){
			DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
			//String strDate = dateformat.format(itemDate);
			String strDate;
			//= dateformat.format(itemDate);
			if(itemDate != null){
				strDate = dateformat.format(itemDate);
			}else{
				strDate = "";
			}
							
			return "Task is: Description: " + itemDescription + " Person: " + itemPersonName + " Date:" + strDate ;
		}//toString

		
	 
}//Task


