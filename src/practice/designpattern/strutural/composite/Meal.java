package practice.designpattern.strutural.composite;

import java.util.ArrayList;
import java.util.List;

public class Meal implements Task{
    List<Task> taskList;

    public void addTask(Task task){
        if(this.taskList == null || this.taskList.size() == 0){
            this.taskList = new ArrayList<>();
        }
        this.taskList.add(task);
    }

    public void removeTask(Task task){
        this.taskList.remove(task);
    }


    @Override
    public int takeTime() {
        if(this.taskList != null && this.taskList.size() > 0){
            int totalTime = 0;
            for(Task task : this.taskList){
                totalTime += task.takeTime();
            }

            return totalTime;
        } else {
            return 0;
        }
    }
}
