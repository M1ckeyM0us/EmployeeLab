//********************************************************************
//  Firm.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm
{
   //-----------------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {   
       StaffMember[] staffList = new StaffMember[6];

      staffList[0] = new Executive ("Elliot", "123 Main Line",
         "555-0469", "123-45-6789", 2423.07);

      staffList[1] = new Employee ("Dr. Kelso", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15);
      staffList[2] = new Employee ("Turk", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23);

      staffList[3] = new Hourly ("Dr. Cox", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55);

      staffList[4] = new Volunteer ("J.D.", "987 Suds Blvd.",
         "555-8374");
      staffList[5] = new Volunteer ("Carla", "321 Duds Lane",
         "555-7282");
      
     //3 Write the code to award a bonus of 500 to Elliot
      ((Executive) staffList[0]).awardBonus(500);
      
      //4 Write the code to add 40 hours to Dr. Cox
      ((Hourly) staffList[3]).addHours(40);
   

   //-----------------------------------------------------------------
   //  Pays all staff members.
   //-----------------------------------------------------------------

      for (int count=0; count < staffList.length; count++)
      {
         //1 Print out information about each object using the toString method
         System.out.println(staffList[count]);
         
         //2 Write the code to pay a staff member and print it
         System.out.println("Payment: $" + staffList[count].pay());

         System.out.println ("-----------------------------------");
      }
   


   }
}
