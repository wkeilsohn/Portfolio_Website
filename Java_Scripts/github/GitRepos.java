package Java_Scripts.github;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class GitRepos {
    
    public void getJSON() throws IOException{ //Change later

        String url = "https://api.github.com/users/wkeilsohn/repos";
        URL get_url = new URL(url);

        HttpURLConnection con = (HttpURLConnection) get_url.openConnection();
        con.setRequestProperty("Accept", "application/vnd.github.v3+json");

        con.setRequestMethod("GET");

         BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
         String input_line;
         while ((input_line = in.readLine()) != null){
             System.out.println(input_line);
         }

         in.close();
    }
}