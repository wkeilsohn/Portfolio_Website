package Java_Scripts.github_repos.src;

import java.io.IOException;


public class main {
    
    public static void main(String[] args) {
        try {
            GitRepos git = new GitRepos();
            System.out.println(git.getJSON());
        } catch (IOException i) {
            System.out.println("Could not reach Github");
        }
    }
    
}