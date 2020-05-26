package Java_Scripts.github_repos.src;

import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Vector;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

public class ProcessRepos {

    public String partString(String st){
        String st_p1 = st.substring(0, 10);
        String st_p2 = st.substring(11, 20);
        String st_pf = st_p1.concat(":");
        st_pf = st_pf.concat(st_p2);
        return st_pf;
    }

    public Date stringDate(String st){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        try{
            Date date = format.parse(st);
            return date;
        } catch (Exception e){
            Date now = new Date();
            return now; // Not ideal, but you should at least see it.
        }
    }
    
    public Vector JArray(JSONArray j) { //Vector

        Vector j_out_vector = new Vector();

        for (var i = 0; i < j.length(); i++){
            JSONObject obj = j.getJSONObject(i);

            Vector obv = new Vector();
            
            String prod_name = obj.getString("name");
            String prod_url = obj.getString("url");
            String prod_create = obj.getString("created_at");
            String prod_update = obj.getString("updated_at");

            Date prod_cd = stringDate(partString(prod_create));
            Date prod_ud = stringDate(partString(prod_update));
            
            obv.add(prod_name);
            obv.add(prod_url);
            obv.add(prod_cd);
            obv.add(prod_ud);

            j_out_vector.add(obv);
        }
        return j_out_vector;
    }

}