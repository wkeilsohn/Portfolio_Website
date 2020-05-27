package Java_Scripts.github_repos.src;

import java.util.Vector;

public class main {
    
    public static void main(String[] args) {
        try {
            GitRepos git = new GitRepos();
            ProcessRepos pros = new ProcessRepos();
            html_maker html = new html_maker();
            Vector repos = pros.JVec(git.getJSON());
            html.makeHTML(repos);
        } catch (Exception i) {
            System.err.println(i);
        }
    }
    
}