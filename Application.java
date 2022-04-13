import java.util.*;
public class Application {

	public static void main(String[] args) {
		
		// Array for contacts
		ArrayList <Person> contacts = new ArrayList<Person>();
		
		// Variables for inputs passed onto other classes
		String input1 = "";
		String input2 = "";
		String input3 = "";
		String input4 = "";
		String input5 = "";
		String input6 = "";
		String input7 = "";
		String input8 = "";
		String input9 = "";
		
		// Scanner and choice variable for user choice
		int choice;
		Scanner scanner = new Scanner(System.in);
		
		// Loop to have main menu run continuously 
		do {
			
		// Main menu
		System.out.println("\t\n***CONTACT BOOK***\n");
        System.out.println("Select an Option:");
        System.out.println("\n.1 Add Contact \n.2 Update Contact \n.3 Delete Contact \n.4 View Contacts \n.5 Exit");
        System.out.print("\nChoice: ");
        
        //User selects an option
        choice = scanner.nextInt();
     
        switch(choice){
        
           case 1:
               System.out.println("\n\t***Add a Contact****");
               
               System.out.println("Select one of the following contact types\n");
               System.out.println("\t1. Regular Contact (Name, Address, Phone #)");
               System.out.println("\t2. Business Contact (Name, Address, Phone #, Email, Work Phone #)");
               System.out.println("\t3. Personal Contact (Name, Address, Phone #, Birthday, Relation, Home Phone #)");
               System.out.print("\nChoice: ");
               int contactType = scanner.nextInt();
               
               if (contactType == 1) { // User selects to create new regular contact
               // User input
       			System.out.print("\nEnter first name and Last name:");
       			input1 = scanner.nextLine();
       			input2= scanner.nextLine();
       			 
       			System.out.println("Enter address");
       			input3 = scanner.nextLine();
       			 
       			System.out.println("Enter Phone number");
       			input4 = scanner.nextLine();
       			 
       			// Inputs passed on new instance of Person Class onto Array
       			contacts.add(new Person(input1, input2, input3,input4));
               }
               
               if (contactType == 2) { // User selects to create business contact
                   // User input
           			System.out.print("\nEnter first name and Last name:");
           			input1 = scanner.nextLine();
           			input2= scanner.nextLine();
           			 
           			System.out.println("Enter address");
           			input3 = scanner.nextLine();
           			 
           			System.out.println("Enter Phone number");
           			input4 = scanner.nextLine();
           			
           			System.out.println("Enter email address");
           			input5 = scanner.nextLine();
           			
           			System.out.println("Enter the Work Phone Number: ");
           			input6 = scanner.nextLine();
           			
           			// Inputs passed on new instance of BusinessContact Class onto Array
           			contacts.add(new BusinessContact(input1, input2, input3,input4, input5, input6));
                   }
               
               if (contactType == 3) { // User selects to create Personal contact
                   // User input
           			System.out.print("\nEnter first name and Last name:");
           			input1 = scanner.nextLine();
           			input2= scanner.nextLine();
           			 
           			System.out.println("Enter address");
           			input3 = scanner.nextLine();
           			 
           			System.out.println("Enter Phone number");
           			input4 = scanner.nextLine();
           			
           			System.out.println("Enter Contact's Birthdate");
           			input5 = scanner.nextLine();
           			
           			System.out.println("Enter relation to contact");
           			input6 = scanner.nextLine();
           			
           			System.out.println("Enter Home Phone Number");
           			input7 = scanner.nextLine();
           			
           			 
           			// Inputs passed on new instance of PersonalContact Class onto Array
           			contacts.add(new PersonalContact(input1, input2, input3, input4, input7, input8, input9));
                   }
               
                break;
                
           case 2:
        	   System.out.println("\n\t***Update a Contact***");
               //Code for updating contacts
        	   for (int i = 0; i < contacts.size(); i++) {
           	      System.out.println(i+1 +"."+ contacts.get(i));
                 }
        	   		// Number displays next to the number of the contact and user selects the one they want to update
           	      System.out.println("Select the number of the contact that you want to update");
           	      
           	        // Variable to save Array Index
                    int input10 = scanner.nextInt();
                    int index = input10 - 1;
                     
                    // User selects what part of contact they want to update                   
                     System.out.println("You have chosen the following contact: " + "\n**********" +  contacts.get(index) + "**********\n");
                     System.out.println("Which one of the following would you like to update?" + "\n1. Name" + "\n2.Address" + "\n3.Phone Number" +
                     "\n4.Email Address" + "\n5.Work Phone Number" + "\n6.BirthDate" + "\n7.Relation" + "\n8.Home Phone Number");
                     
                     System.out.print("\nChoice: ");
                     int contactChoice = scanner.nextInt();
                     
                     // New name
                     if (contactChoice == 1) {
                    	 System.out.println("\nEnter New First Name and Last Name:");
                    	 input1 = scanner.nextLine();
                    	 input2 = scanner.nextLine();
                    	 contacts.set(index, new Person(input1, input2, input3, input4));
                     }
                     
                     // New Address
                     if (contactChoice == 2) {
                    	 System.out.println("\nEnter New Address");
                    	 input3 = scanner.next();
                    	 contacts.set(index, new Person(input1, input2, input3, input4));
                     }
                     
                     // New Number
                     if (contactChoice == 3) {
                    	 System.out.println("\nEnter New Phone Number: ");
                    	 input4 = scanner.next();
                    	 contacts.set(index, new Person(input1, input2, input3, input4));
                     }
                     
                     // New Email
                     if (contactChoice == 4) {
                    	 System.out.println("\nEnter New Email Address: ");
                    	 input5 = scanner.next();
                    	 contacts.set(index, new BusinessContact(input1, input2, input3,input4, input5, input6));
                     }
                     
                     // New Work Number
                     if (contactChoice == 5) {
                    	 System.out.println("\nEnter New Work Phone Number");
                    	 input6 = scanner.next();
                    	 contacts.set(index, new BusinessContact(input1, input2, input3,input4, input5, input6));
                     }
                     
                     // New BDay
                     if (contactChoice == 6) {
                    	 System.out.println("\nEnter New Birthdate: ");
                    	 input7 = scanner.next();
                    	 contacts.set(index, new PersonalContact(input1, input2, input3, input4, input7, input8, input9));
                     }
                     
                     // new Relation
                     if (contactChoice == 7) {
                    	 System.out.println("\nEnter New Relation: ");
                    	 input8 = scanner.next();
                    	 contacts.set(index, new PersonalContact(input1, input2, input3, input4, input7, input8, input9));
                     }
                     
                     // New Home Phone
                     if (contactChoice == 8) {
                    	 System.out.println("\nEnter New Home Phone Number:");
                    	 input9 = scanner.next();
                    	 contacts.set(index, new PersonalContact(input1, input2, input3, input4, input7, input8, input9));
                     }
                     
                System.out.println("\n**Contact Has Been Sucessfully Updated!***\n");
                
              break;

           case 3:
               System.out.println("\n\t***Delete a Contact***");
               //Code for deleting contact
               
               // Variable for array index
               int delete;
               
               // Display contacts with numbers
               for (int i = 0; i < contacts.size(); i++) {
          	      System.out.println(i+1 +"."+ contacts.get(i));
                }
               
               // input from user
               System.out.println("Select the number of the contact you would like to delete.");
               System.out.print("Choice: ");
               delete = scanner.nextInt();
               
               // Delete from array
               contacts.remove(delete - 1);
               
               // Success message
               System.out.println("");
               System.out.println("Contact " + delete + " has been successfully deleted!\n");
                        
               break;
           
           case 4:
               System.out.println("\n\t***Contacts***");
               //Code for viewing contacts
               for (int i = 0; i < contacts.size(); i++) {
         	      System.out.println(i+1 +"."+ contacts.get(i));
               }
               break;

           case 5:
        	   // Exit choice
        	   System.out.println("Good Bye!");
        	   
        	   break;
        	   
           default:
               System.out.println("Invalid input");
                        
        	}	
		} while (choice != 5);
	}
}
