package Java_Scripts.github_repos.src;

import java.util.Vector;
import py4j.GatewayServer;

public class gitrepo_main {

    public String html;

    public  gitrepo_main(){
        html = HtmlPrinter();
    }

    public String outGitrepo_main(){
        return html;
    }
    
    public String HtmlPrinter(){
        try {
            GitRepos git = new GitRepos();
            ProcessRepos pros = new ProcessRepos();
            html_maker http = new html_maker();
            Vector repos = pros.JVec(git.getJSON());
            return http.makeHTML(repos);
        } catch (Exception i) {
            String error = new String("<p>500 Error</p>");
            return error;

        }
    }

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new gitrepo_main());
        gatewayServer.start();
    }
    
}