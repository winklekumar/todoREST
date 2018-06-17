package todo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import todo.model.TODOItem;

public class ToDoServiceImplementation implements ToDoService {
	private static Map<String, TODOItem> todoMap = new HashMap<String, TODOItem>();
	static {
		todoMap.put("1", new TODOItem(1, "Learn React", "false"));
		todoMap.put("2", new TODOItem(2, "Bundle UI and Java", "false"));
		todoMap.put("3", new TODOItem(3, "Submit Test Result", "false"));
		
	}

	private static Map<String, TODOItem> initialMap() {
		
		return todoMap;

	}

	public Map<String, TODOItem> getTODOData() {
		todoMap = initialMap();
		return todoMap;

	}

	public List<TODOItem> getTODOList() {
		System.out.println("Start of getTODOList");
		List<TODOItem> todoList = new ArrayList<TODOItem>(getTODOData().values());
		System.out.println("todoList"+todoList);
		return todoList;
	}


	public void addToDoList(String id, String description, String status, String date) {
		// TODO Auto-generated method stub
		todoMap.put(id,new TODOItem(Integer.parseInt(id),description,status));
		
	}
	
	public void removeFromToDoList(String id) {
		todoMap.remove(id);
	}


}
