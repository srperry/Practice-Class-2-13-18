import java.util.Scanner;
public class LibraryTest {

	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);

		System.out.println("Please enter the library location.");
			String LibraryLocation1=scanner.nextLine();
		System.out.println("Please enter the total number of books.");
			int TotalBooks1=scanner.nextInt();
		System.out.println("Please enter the number of staff in your Library.");
			int StaffTotal1=scanner.nextInt();
		System.out.println("Please enter the yearly expense of your library.");
			double YearlyExpense1=scanner.nextDouble();
Library library1=new Library("LibraryLocation1",TotalBooks1,StaffTotal1,YearlyExpense1);
System.out.println(library1.LibraryLocation+library1.LibraryTotalBooks+library1.LibraryStaffTotal+library1.LibraryYearlyExpense);
		System.out.println("Please enter the library location.");
			String LibraryLocation2=scanner.nextLine();
		System.out.println("Please enter the total number of books.");
			int TotalBooks2=scanner.nextInt();
		System.out.println("Please enter the number of staff in your Library.");
			int StaffTotal2=scanner.nextInt();
		System.out.println("Please enter the yearly expense of your library.");
			double YearlyExpense2=scanner.nextDouble();
Library library2=new Library("LibraryLocation2",TotalBooks2,StaffTotal2,YearlyExpense2);
System.out.println(library2.LibraryLocation+library2.LibraryTotalBooks+library2.LibraryStaffTotal+library2.LibraryYearlyExpense);
		System.out.println("Please enter the library location.");
			String LibraryLocation3=scanner.nextLine();
		System.out.println("Please enter the total number of books.");
			int TotalBooks3=scanner.nextInt();
		System.out.println("Please enter the number of staff in your Library.");
			int StaffTotal3=scanner.nextInt();
		System.out.println("Please enter the yearly expense of your library.");
			double YearlyExpense3=scanner.nextDouble();
Library library3=new Library("LibraryLocation3",TotalBooks3,StaffTotal3,YearlyExpense3);
System.out.println(library3.LibraryLocation+library3.LibraryTotalBooks+library3.LibraryStaffTotal+library3.LibraryYearlyExpense);
		System.out.println("Please enter the library location.");
			String LibraryLocation4=scanner.nextLine();
		System.out.println("Please enter the total number of books.");
			int TotalBooks4=scanner.nextInt();
		System.out.println("Please enter the number of staff in your Library.");
			int StaffTotal4=scanner.nextInt();
		System.out.println("Please enter the yearly expense of your library.");
			double YearlyExpense4=scanner.nextDouble();
Library library4=new Library("LibraryLocation4",TotalBooks4,StaffTotal4,YearlyExpense4);
System.out.println(library4.LibraryLocation+library4.LibraryTotalBooks+library4.LibraryStaffTotal+library4.LibraryYearlyExpense);
		System.out.println("Please enter the library location.");
			String LibraryLocation5=scanner.nextLine();
		System.out.println("Please enter the total number of books.");
			int TotalBooks5=scanner.nextInt();
		System.out.println("Please enter the number of staff in your Library.");
			int StaffTotal5=scanner.nextInt();
		System.out.println("Please enter the yearly expense of your library.");
			double YearlyExpense5=scanner.nextDouble();
Library library5=new Library("LibraryLocation5",TotalBooks5,StaffTotal5,YearlyExpense5);
System.out.println(library5.LibraryLocation+library5.LibraryTotalBooks+library5.LibraryStaffTotal+library5.LibraryYearlyExpense);




	}

}
