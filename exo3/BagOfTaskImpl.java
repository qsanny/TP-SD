package exo3;

import java.util.Queue;

public class BagOfTaskImpl implements BagOfTasks {

    Queue<Task> tasks;

    @Override
    public Task nextTask() {
        return this.tasks.poll();
    }

    @Override
    public void sendResult(Task t) {
        
    }

    @Override
    public String toString() {
        return "I am the bag of task";
    }
    
}
