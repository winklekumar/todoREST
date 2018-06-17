package todo.model;

public class TODOItem {

    private long id;
    private String text;
    private String completed;
    private String dueDate;


	public TODOItem(long id, String text, String completed) {
        this.id = id;
        this.text = text;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

	public String getText() {
		return text;
	}

	public String getCompleted() {
		return completed;
	}
	

    public String getDueDate() {
		return dueDate;
	}
    public void setDueDate(String dueDate) {
		this.dueDate=dueDate;;
	}

   
}
