package Java_Scripts.github_repos.src;

import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Arrays;

public class ProcessRepos {
    
    public void JArray(JSONArray j) { //String[]

        String[] j_out_array;

        for (var i = 0; i < j.length(); i++){
            JSONObject obj = j.getJSONObject(i);
            
            JSONArray key = obj.names();

            for (int x = 0; x < key.length(); ++x){ // Don't need a second loop.
                String prod_name = obj.getString("name");
                String prod_url = obj.getString("url");
                String prod_create = obj.getString("created_at");
                String prod_update = obj.getString("updated_at");

                System.out.println(prod_name);
            }
        }
    }

}