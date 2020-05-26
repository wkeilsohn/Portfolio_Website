package Java_Scripts.github_repos.src;


public class main {
    
    public static void main(String[] args) {
        try {
            GitRepos git = new GitRepos();
            ProcessRepos pros = new ProcessRepos();
            System.out.println(git.getJSON());
            pros.JArray(git.getJSON());
        } catch (Exception i) {
            System.err.println(i);
        }
    }
    
}