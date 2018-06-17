package todo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import todo.model.TODOItem;
import todo.service.ToDoService;
import todo.service.ToDoServiceImplementation;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ToDOController {
	
	ToDoService todoService = new ToDoServiceImplementation();

    
    /*
     * Method to fetch List of TODO Items
     */
    @RequestMapping("/todos")
    public List<TODOItem> getTODOList() {
    	return todoService.getTODOList();
    }
    /*
     * Add an item to the TODO List
     */
    @RequestMapping(value="/addTODO",method = RequestMethod.POST)
    public void addToDoList(@RequestBody TODOItem todoItem) {
    	todoService.addToDoList(Long.toString(todoItem.getId()), todoItem.getText(), 
    			todoItem.getCompleted(), todoItem.getDueDate());
    }
	 /*
	  * Set the status as completed for the to do list
	  */
    @RequestMapping(value="/completeTODO/{id}", method = RequestMethod.DELETE)
	 public void removeFromToDoList(@PathVariable("id") long id) {
    	todoService.removeFromToDoList(Long.toString(id));
    	
    }
    

    
    /*
     * Method to fetch Map of TODO Items
     */
     @RequestMapping("/todo")
     public Map<?, ?> todoList(@RequestParam(value="name", defaultValue="World")String name) {
     	//Get hashmap   of TODO List
         return todoService.getTODOData();
     }
}
