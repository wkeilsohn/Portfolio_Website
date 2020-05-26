package Java_Scripts.github_repos.src;


public class main {
    
    public static void main(String[] args) {
        try {
            GitRepos git = new GitRepos();
            ProcessRepos pros = new ProcessRepos();
            pros.JVec(git.getJSON());
        } catch (Exception i) {
            System.err.println(i);
        }
    }
    
}