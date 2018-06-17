package todo.service;

import java.util.List;
import java.util.Map;

import todo.model.TODOItem;

public interface ToDoService {
	
	public Map<String,TODOItem> getTODOData() ;
	
	 public List<TODOItem> getTODOList() ;
	 
	 public void addToDoList(String id, String description, String status, String date) ;
	 
	 public void removeFromToDoList(String id);

}
