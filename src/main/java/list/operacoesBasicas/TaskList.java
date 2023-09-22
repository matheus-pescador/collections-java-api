package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

//Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo.
// Cada tarefa é representada por uma
// classe chamada "Tarefa" que possui um atributo de descrição.
// Implemente os seguintes métodos:
public class TaskList {
    private List<Task> taskList;


    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    //adicionarTarefa(String descricao):
    // Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    //removerTarefa(String descricao):
    // Remove uma tarefa da lista com base em sua descrição.
    public void removeTask(String decription) {
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task t : taskList) {
            if (t.getDescription().equalsIgnoreCase(decription)) {
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    //obterNumeroTotalTarefas():
    // Retorna o número total de tarefas na lista.
    public int getTotalAmountOfTasks() {
        return taskList.size();
    }

    //obterDescricoesTarefas():
    // Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void getTaskDescriptions() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.getTotalAmountOfTasks();


        System.out.println("The total amount of elements in the list is: " + taskList.getTotalAmountOfTasks());

        taskList.addTask("Task 1");
        taskList.addTask("Task 1");
        taskList.addTask("Task 3");
        System.out.println("The total amount of elements in the list is: " + taskList.getTotalAmountOfTasks());

        taskList.removeTask("Task 3");
        System.out.println("The total amount of elements in the list is: " + taskList.getTotalAmountOfTasks());

        taskList.getTaskDescriptions();
    }

}
