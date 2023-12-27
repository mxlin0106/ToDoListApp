import java.util.List;
import java.util.ArrayList;

class ToDoListApp {
  //attributes
  private List<Task> _tasksList;
  private List<Category> _categoriesList;
  
  public ToDoListApp(){
    _tasksList = new ArrayList<Task>();
  }
  //constructor
  public ToDoListApp(List<Task> tasksList) {
    if(tasksList == null)
    {
       _tasksList = new ArrayList<Task>();
    }
    else
    {
      _tasksList = tasksList;
    }
  }
  //methods
  public void addTask(Task task){
    _tasksList.add(task);
  }
  public void removeTask(Task task){
    _tasksList.remove(task);
  }
  public void updateTask(String taskId, String newDetails){
    Task task = findTask(taskId);
    task.updateDetails(newDetails);  
  }
  public void updateStatus(String taskId, boolean Complete)
  {
    Task task = findTask(taskId);
    if(Complete)
    {
      task.markAsCompleted();
    }
    else
    {
      task.markAsPending();
    }
  }
  public Task findTask(String taskId){
    for(Task t : _tasksList){
      if (t.getTaskId() == taskId)
      {
        return t;
      }
    }
    return null;
  }
  public void displayToDoList(){
    for(Task t : _tasksList){
      t.displayTask();
    }
  }
}