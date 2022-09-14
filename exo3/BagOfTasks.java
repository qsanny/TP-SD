package exo3;

import java.rmi.Remote;

public interface BagOfTasks extends Remote {
    public Task nextTask();
    public void sendResult(Task t);
    public String toString();
}
