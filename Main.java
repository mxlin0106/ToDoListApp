// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
  public static void main(String[] args) {
  ToDoListApp list = new ToDoListApp();
  Task task1 = new Task();
  list.addTask(task1);
  list.displayToDoList();
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  //}
  }
}