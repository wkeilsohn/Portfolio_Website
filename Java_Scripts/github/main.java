package Java_Scripts.github;

import java.io.IOException;


public class main {
    
    public static void main(String[] args) {
        try {
            GitRepos git = new GitRepos();
            git.getJSON();
        } catch (IOException i) {
            System.out.println("Could not reach Github");
        }
    }
    
}