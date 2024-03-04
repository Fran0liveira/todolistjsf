package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.DaoGeneric;
import model.Todo;

@ManagedBean(name = "todoBean")
@RequestScoped
public class TodoBean {
	
	private Todo todo = new Todo();
	private DaoGeneric dao = new DaoGeneric();

	public Todo getTodo() {
		return todo;
	}

	public void setTodo(Todo todo) {
		this.todo = todo;
	}
	
	public void salvar() {
		dao.salvar(todo);
	}
}
