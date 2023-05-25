package org.in;
/*LAB EXAM
Course: PG-DAC March 2023 					Date: 30-April-2023
Duration: 2 hours

1.Create a Java console Application that creates a POJO class representing the details of a Category class that contains
a.Int catId
b.String categoryName
c.String categoryDesc
d.String categoryImageUrl
Create a menu driven program that allows the user to enter the value of the Category and store in a any Collection object of your choice.  Duplicate entries should not be permitted.
Option 1 : allows the user to accept input from the console relating to the above class and store the same in Collection Object
Option 2 : will allow the user to list all the Category objects stored in the Collection Object.
Option 3 : Write a Consumer which takes the Collection Object as an argument and displays all categories whose name starts with ‘E’

IMPORTANT :-
If your surname is Patil then all the Category class created by you should be  class Category_Patil { }. All the objects you create in the above application should have the suffix as objCategory_Patil , objList_Patil, objData_Patil etc.
*/

/*
Upload your solution on below google drive link:
https://forms.gle/BWRearE5tVCiEiDg9
*/

import java.util.*;
import java.util.function.Consumer;

public class MenuPogram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Category> categorySet = new HashSet<>();
		int choice;
		do {
			System.out.println("MENU PROGRAM");
			System.out.println("1. Add data into categorySet");
			System.out.println("2. List all  data present in  categorySet");
			System.out.println("3. Display categories whose name start with 'E' ");
			System.out.println("4. Exit");
			System.out.println("Enter the choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter category  id:");
                int catId = scanner.nextInt();
                	scanner.nextLine();
                System.out.println("Enter category name:");
                String categoryName =scanner.nextLine();
                System.out.println("Enter category description:");
                String categoryDesc = scanner.next();
                System.out.println("Enter category  image url:");
                String categoryImageUrl = scanner.next();
                String[] name=categoryName.split(" ");
                String surName=name[name.length-1];
				categorySet.add(new Category(catId, categoryName,surName+ categoryDesc,surName+ categoryImageUrl));

				break;
			case 2:
					
				break;
			case 3:
			{
				Consumer<Category> nameStartingWithE=(categ)->{
					if(categ.getCategoryName().charAt(0)=='E')
						System.out.println(categ.getCategoryName());
				};
				
				
			}
				break;
			case 4:
					System.out.println("Exit");
				break;
			}

		} while (choice != 4);

	}

}
