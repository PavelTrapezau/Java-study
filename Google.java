package com.syntax.class15;

public class Google {
      int emplId;
      double salary;
      
      String name,lastName,title;
      
      void working() {
    	  System.out.println(title+" is working");
      }
      void getPaid() {
    	  System.out.println(name+" is getting paid "+salary);
      }
      
      void attendMeeting() {
    	  
    	  System.out.println(name+" attending meetings");
      }
      public static void main(String[] args) {
		
    	  Google emp1=new Google();
    	  emp1.emplId=123;
    	  emp1.name="John";
    	  emp1.lastName="Smith";
    	  emp1.title="CEO";
    	  emp1.salary=200000;
    	  
    	  emp1.working();
    	  emp1.getPaid();
    	  emp1.attendMeeting();
    	  
    	  
    	  Google emp2=new Google();
    	  emp2.emplId=123;
    	  emp2.name="Seyma";
    	  emp2.lastName="Atasoy";
    	  emp2.title="QA Engeneer";
    	  emp2.salary=200000;
    	  
    	  emp2.working();
    	  emp2.getPaid();
    	  emp2.attendMeeting();
    	  
	}
      
      
      
}
