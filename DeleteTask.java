package ToDoListUsingJava;

import java.util.Scanner;

import static ToDoListUsingJava.AddTask.tasks;

public class DeleteTask {

    static void deleteTask(){

        if(tasks.isEmpty()){

            System.out.println("no tasks available");
        }

        ViewAllTasks.viewTask();

        System.out.println("Task Number You Delete");

        Scanner scan = new Scanner(System.in);

        int taskNumber = scan.nextInt();

        if(taskNumber<=0 || taskNumber>tasks.size()){

            System.out.println("Invalid Task Number");
        }

        else{

            tasks.remove(taskNumber-1);
            System.out.println("Successfully Deleted");
        }
    }
}
