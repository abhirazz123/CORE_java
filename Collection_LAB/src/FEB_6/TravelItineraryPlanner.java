package FEB_6;

import java.util.ArrayList;
import java.util.List;

class Activity {
    private String name;
    private String schedule;

    public Activity(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return name + " (" + schedule + ")";
    }
}

class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destination: ").append(name).append("\n");
        for (Activity activity : activities) {
            sb.append("- ").append(activity).append("\n");
        }
        return sb.toString();
    }
}

class ItineraryPlanner {
    private List<Destination> destinations;

    public ItineraryPlanner() {
        this.destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return destinations;
    }
}

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        ItineraryPlanner planner = new ItineraryPlanner();

        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        Destination london = new Destination("London");
        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

        planner.addDestination(paris);
        planner.addDestination(london);

        for (Destination destination : planner.getDestinations()) {
            System.out.println(destination);
        }
    }
}
