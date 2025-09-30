package ToDoListUsingJava;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(" TO-DO-LIST \n");

        Scanner sc = new Scanner(System.in);

        int choice;

        boolean list = true;

        while (list){

            System.out.println("1.ADD TASK");
            System.out.println("2.VIEW ALL TASKS");
            System.out.println("3.MARK TASKS");
            System.out.println("4.DELETE TASKS");
            System.out.println("5.EXIT\n");

            System.out.println("Select the number");
            choice=sc.nextInt();

            switch (choice){

                case 1 :
                    AddTask.addTask();
                    break;

                case 2 :
                    ViewAllTasks.viewTask();
                    break;

                case 3 :
                    MarkTasks.markTasks();
                    break;

                case 4 :
                    DeleteTask.deleteTask();
                    break;

                case 5 :
                    list = false;
                    break;

                default:
                    System.out.println("Enter Numbers Only");
                    break;
            }
        }
          sc.close();
    }
}
