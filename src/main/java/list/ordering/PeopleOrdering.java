package main.java.list.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleOrdering {

    private List<People> peopleList;

    public PeopleOrdering() {
        this.peopleList = new ArrayList<>();
    }

    public void addPeople(String name, int age, double height) {
        peopleList.add(new People(name,age,height));
    }

    public List<People> orderByAge() {
        List<People> peopleByAge = new ArrayList<>(peopleList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }
    public List<People> orderByHeight() {
        List<People> peopleByHeight = new ArrayList<>(peopleList);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        PeopleOrdering peopleOrdering = new PeopleOrdering();

        peopleOrdering.addPeople("Name 1",20,1.56);
        peopleOrdering.addPeople("Name 2",30,1.80);
        peopleOrdering.addPeople("Name 3",25,1.70);
        peopleOrdering.addPeople("Name 4",26,1.82);
        peopleOrdering.addPeople("Name 5",17,1.56);

        System.out.println(peopleOrdering.orderByAge());
        System.out.println(peopleOrdering.orderByHeight());
    }
}
