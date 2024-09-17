package FourFiveDays;

public class ActionLog {

    public static void logAction(String actionName) {
        System.out.println("Action: " + actionName);
    }

    public static void logAction(String actionName, int priorityLevel) {
        System.out.println("Action: " + actionName + ", Priority Level: " + priorityLevel);
    }

    public static void main(String[] args) {
        // Testing logAction with just the action name
        logAction("User login");

        // Testing logAction with action name and priority level
        logAction("Database backup", 1);
    }
}
