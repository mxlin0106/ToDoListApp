import java.util.Date;
enum Status {Pending,InProgress, Completed}

class Task {
    //attributes
    String _taskId;
    String _title;
    String _taskDetails;
    int _priority;
    Date _dueDate;
    Status _status;
    Category _category;
    List<String> tags;

    //constructor
    public Task()
    {
      _taskId = null;
      _taskDetails = null;
      _priority = 0;
      _dueDate = null;
      _status = Status.Pending;
      _category = Category.Uncategorized;
      tags = new ArrayList<String>();
    }
    public Task(String taskId, String taskDetails, int priority, Date dueDate){
      _taskId = taskId;
      _taskDetails = taskDetails;
      _priority = priority;
      _dueDate = dueDate;
      _status = Status.Pending;
    }

    //methods
    public String getTaskId() {
      return _taskId;
    }
    public void markAsCompleted(){
      _status = Status.Completed;
    }
    public void markAsPending(){
      _status = Status.Pending;
    }
    public void updateDetails(String newDetails){
      _taskDetails = newDetails;
    }
    public void setDueDate(Date newDueDate){
      _dueDate = newDueDate;
    }
    public void setPriority(int newPriority){
      _priority = newPriority;
    }
    public void updateDueDate(Date newDate)
    {
      _dueDate = newDate;
    }
    public void addTag(String tag)
    {
      this.tags.add(tag);
    }
    public void removeTag(String tag)
    {
      this.tags.remove(tag);
    }
    public void displayTask()
    {
      System.out.println("Task ID: " + _taskId);
      System.out.println("Task Details: " + _taskDetails);
      System.out.println("Priority: " + _priority);
      System.out.println("Due Date: " + _dueDate);
      System.out.println("Status: " + _status);
    }
}