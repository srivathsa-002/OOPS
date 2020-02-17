import java.util.*;
public class Testing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book title: ");
		String title=sc.nextLine();
		MyBook newNovel=new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is: "+newNovel.getTitle());
      	sc.close();
	}
}