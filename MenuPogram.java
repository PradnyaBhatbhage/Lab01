package org.in;

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
