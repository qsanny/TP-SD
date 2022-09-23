package exo3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Queue;

public class BagOfTaskImpl extends UnicastRemoteObject implements BagOfTasks {

    Queue<Task> tasks;

    protected BagOfTaskImpl() throws RemoteException {
    }

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
