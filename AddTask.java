package ToDoListUsingJava;

import java.util.*;

public class AddTask {

   static ArrayList<String> tasks = new ArrayList<>();

    static void addTask(){

        System.out.println("Enter the Task");

         Scanner sca = new Scanner(System.in);

        String task = sca.nextLine();

        tasks.add(task);

        System.out.println("Task Added Successfully");
    }

    static void viewTasks(){

        if(tasks.isEmpty()){

        }
    }
}
