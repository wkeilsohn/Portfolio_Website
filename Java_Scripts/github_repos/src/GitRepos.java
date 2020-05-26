package Java_Scripts.github_repos.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;


public class GitRepos {
    
    public JSONObject getJSON() throws IOException, JSONException{

        String url = "https://api.github.com/users/wkeilsohn/repos";
        URL get_url = new URL(url);

        HttpURLConnection con = (HttpURLConnection) get_url.openConnection();
        con.setRequestProperty("Accept", "application/vnd.github.v3+json");

        con.setRequestMethod("GET");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        
        String input_line;
        String reps = new String();
         while ((input_line = in.readLine()) != null){
            reps = reps.concat(input_line);
            reps = reps.replace("[","").replace("]","");
         }

        in.close();
        con.disconnect();
   
        JSONObject json = new JSONObject(reps);
        return json;
    }
}