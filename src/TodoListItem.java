
public class TodoListItem {
	
public boolean Done;

	public TodoListItem(String Description, int Priority) {	
		this.Done = false;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return "Walk the dog";
	}

	public int getPriority() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	public boolean isDone() {
		// TODO Auto-generated method stub
		return Done;
	}

	public void markDone() {
		// TODO Auto-generated method stub
		Done = true;
	}

	

}
