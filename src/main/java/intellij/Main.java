package intellij;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Maps and HashMaps
        // Map - set of key value pairs, doesn't guarantee a certain order
        HashMap<String, Integer> employeeIds = new HashMap<>(); // don't use primitive types - use full Java wrapper classes

        // add new map
        employeeIds.put("John", 322323);
        employeeIds.put("Ian", 3749273);
        employeeIds.put("Max", 3472837);

        System.out.println(employeeIds);

        // getting one element
        System.out.println(employeeIds.get("Max"));

        // if a given key exist
        System.out.println(employeeIds.containsKey("Jerry"));

        // contain a certain value
        System.out.println(employeeIds.containsValue(322323));

        // put updates a value if the key already exist
        employeeIds.put("Max", 32341443);
        System.out.println(employeeIds);

        // replace
        employeeIds.replace("John", 57478467);
        System.out.println(employeeIds);

        // put if absent
        employeeIds.putIfAbsent("Kramer", 34875789);
        System.out.println(employeeIds);

        // remove key value pairs
        employeeIds.remove("Ian");
        System.out.println(employeeIds);











    }
}