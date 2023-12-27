class Category{
  //attribute
  String _categoryId;
  String _name;
  String _description;
  List<Task> _taskList;
  //constructor
  public Category(String categoryId, String name, String description){
    this._categoryId = categoryId;
    this._name = name;
    this._description = description;
  }
  //method
  public void addTask(Task task){
    this._taskList.add(task);
  }
  public void removeTask(Task task){
    this._taskList.remove(task);    
  }
  public void updateCategoryDetails(String name, String description)
  {
    this._name = name;
    this._description = description;
  }
}