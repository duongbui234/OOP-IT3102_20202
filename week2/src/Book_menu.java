package week2;


import java.util.Scanner;

public class Book_menu {
    public static int selectChoice(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n========= Main Menu =========");
        System.out.println("1. Show library information");
        System.out.println("2. Add new book");
        System.out.println("3. Find book");
        System.out.println("4. Exit");
        System.out.println("=============================");
        System.out.print("Enter menu ID (1-4): ");
        int choice = sc.nextInt();

        return choice;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int max_size = 100;
       String[] list_book = new String[max_size];
       int i=0;

       list_book[0]="Mat Biec";
       list_book[1]="Toi thay hoa vang tren co xanh";
       list_book[2]="Chien tranh va hoa binh";
       list_book[3]="Tieng chim hot trong bui man gai";

       int choice = selectChoice();

       while(choice != 4){
           switch(choice) {
               case 1:
                   System.out.println("1. Show library information");
                   i=0;
                   while(i != max_size - 1 && list_book[i] != null){
                       System.out.println(list_book[i]);
                       i++;
                   }
                   break;

               case 2:
                   System.out.println("\n2. Add new book");
                   i=0;
                   while (i != max_size-1 && list_book[i] != null) i++;
                   if(i == max_size-1)
                       System.out.println("List book is full. Can not add new book.");
                   else{
                       System.out.println("Enter book title: ");
                       list_book[i] = sc.nextLine();
                   }
                   break;

               case 3:
                   System.out.println("\n3. Find book");
                   System.out.println("Enter a string to find: ");
                   String key_word = sc.nextLine();

                   i=0;
                   while(i != max_size - 1 && list_book[i] != null){
                        int check = list_book[i].toLowerCase().indexOf(key_word.toLowerCase());
                        if(check == 0 )
                            System.out.println(list_book[i]);

                        i++;
                   }

                   break;
               case 4:
                   System.out.println("\n4. Exit()");
                   break;

               default:
                   System.out.println("\nOut of choice ! Please enter again !");
                   break;
           }
       choice = selectChoice();
       }
    }
}