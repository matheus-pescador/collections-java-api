package main.java.map.Ordering;

public class Event {

    private String name;

    private String attraction;

    public Event(String name, String performance) {
        this.name = name;
        this.attraction = performance;
    }

    public String getName() {
        return name;
    }

    public String getAttraction() {
        return attraction;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", performance='" + attraction + '\'' +
                '}';
    }
}
