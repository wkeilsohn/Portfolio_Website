package Java_Scripts.github_repos.src;

import py4j.GatewayServer;
//import py4j.*;

public class pyout {

    private gitrepo_main html;

    public  gitrepo_main GitEntryPoint(){
        html = new gitrepo_main();
        return html;
    }

    public gitrepo_main outGitrepo_main(){
        return html;
    }

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new pyout());
        gatewayServer.start();
    }
    
}