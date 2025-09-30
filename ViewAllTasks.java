package ToDoListUsingJava;

import static ToDoListUsingJava.AddTask.tasks;

public class ViewAllTasks {

    static void viewTask(){

        if(tasks.isEmpty()){

            System.out.println("no tasks available");
        }

        System.out.println("your tasks :");

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println((i+1)+"."+tasks.get(i));

        }
    }
}
