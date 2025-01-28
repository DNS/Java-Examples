/*
Dependencies:
https://mvnrepository.com/artifact/org.json/json
https://mvnrepository.com/artifact/org.json/json/20250107
wget -cnd https://repo1.maven.org/maven2/org/json/json/20250107/json-20250107.jar

Build + Run:
javac -cp '.;json-20250107.jar' json.java
java -cp '.;json-20250107.jar' json


*/


import org.json.*;

public class json {
    public static void main (String[] args) {
        // Create a JSON object
        JSONObject jo = new JSONObject();
        jo.put("name", "John Doe");
        jo.put("age", 30);
        jo.put("city", "New York");

        // Create a JSON array
        JSONArray ja = new JSONArray();
        ja.put("apple");
        ja.put("banana");
        ja.put("orange");

        // Add the JSON array to the JSON object
        jo.put("fruits", ja);

        // Print the JSON object
        System.out.println(jo.toString());
        
        System.out.println(jo.getString("name"));
        System.out.println(jo.getInt("age"));

		///////////////////
		
        // Parse String to the JSON object
        String s = "{'hello':['world','earth','mars']}";
        JSONObject jo2 = new JSONObject(s);
        
		
        // Print the parsed JSON object
        System.out.println(jo2.toString());
    }
}


