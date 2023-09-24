package main.java.map.Ordering;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class EventSchedule {

    private Map<LocalDate, Event> eventMap;

    public EventSchedule() {
        this.eventMap = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        eventMap.put(date, new Event(name, attraction));
    }

    public void showSchedule() {
        Map<LocalDate, Event> treeMapEvent = new TreeMap<>(eventMap);
        System.out.println(treeMapEvent);
    }

    public void getNextEvent() {
//        Set<LocalDate> dateSet = eventMap.keySet();
//        Collection<Event> values = eventMap.values();
//        eventMap.get();

        LocalDate currentDate = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;
        Map<LocalDate, Event> treeMapEvent = new TreeMap<>(eventMap);
        for (Map.Entry<LocalDate, Event> entry : treeMapEvent.entrySet()) {
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("Next event: " + nextEvent + " will happen in " + nextDate);
                break;
            }
        }
    }


    public static void main(String[] args) {
        EventSchedule eventSchedule = new EventSchedule();

        eventSchedule.addEvent(LocalDate.of(2023, Month.SEPTEMBER, 24), "Event 1", "Attraction 1");
        eventSchedule.addEvent(LocalDate.of(2023, 9, 15), "Event 2", "Attraction 2");
        eventSchedule.addEvent(LocalDate.of(2023, 1, 10), "Event 3", "Attraction 3");

        eventSchedule.showSchedule();

        eventSchedule.getNextEvent();
    }
}
