package ToDoListUsingJava;

import java.util.Scanner;

import static ToDoListUsingJava.AddTask.tasks;

public class MarkTasks {

    static void markTasks(){

        if(tasks.isEmpty()){

            System.out.println("no tasks available");
        }

        ViewAllTasks.viewTask();

        System.out.println("Task Number You Mark");

        Scanner scan = new Scanner(System.in);

        int taskNumber = scan.nextInt();

        if(taskNumber<=0 || taskNumber>tasks.size()){

            System.out.println("Invalid Task Number");
        }

        else if(taskNumber==1){

            String complete = tasks.get(taskNumber)+"[Completed]";
            tasks.set(taskNumber , complete);
            System.out.println("Task Marked");
        }
        else{

            String complete = tasks.get(taskNumber-1)+"[Completed]";
            tasks.set(taskNumber-1 , complete);
            System.out.println("Task Marked");
        }
    }
}
