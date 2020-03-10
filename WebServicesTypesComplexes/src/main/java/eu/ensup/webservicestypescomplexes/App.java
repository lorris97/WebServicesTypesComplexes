package eu.ensup.webservicestypescomplexes;

import java.util.ArrayList;
import java.util.List;
import teamsClient.Team;
import teamsClient.Teams;
import teamsClient.TeamsService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        ArrayList<Team> listeTeams = new ArrayList<>();
        TeamsService service = new TeamsService();

           
           // listeTeams = (ArrayList) service.();
            Teams port = service.getTeamsPort();
            List<Team> liste = port.getTeams();
            for(int i = 0; i < liste.size(); i ++)
            {
                System.out.println(liste.get(i).getName());
                System.out.println(liste.get(i).getRosterCount());
                for(int y = 0; y < liste.get(i).getPlayers().size(); y ++)
                {
                   System.out.println(liste.get(i).getPlayers().get(y).getName());
                   System.out.println(liste.get(i).getPlayers().get(y).getNickname());
 
                }
                System.out.println("-----------------------------");
            }
            
            
    
    }
}
