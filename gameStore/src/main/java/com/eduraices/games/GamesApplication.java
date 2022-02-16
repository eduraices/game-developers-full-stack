package com.eduraices.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eduraices.games.Repository.GameRepository;
import com.eduraices.games.Model.Game;
import com.eduraices.games.Repository.MatchRepository;
import com.eduraices.games.Model.Match;
import com.eduraices.games.Repository.PlayerRepository;
import com.eduraices.games.Model.Player;
import com.eduraices.games.Repository.AssetRepository;
import com.eduraices.games.Model.Asset;
import com.eduraices.games.Repository.GameAssetRepository;
import com.eduraices.games.Model.GameAsset;
import com.eduraices.games.Repository.MatchAssetRepository;
import com.eduraices.games.Model.MatchAsset;
import com.eduraices.games.Repository.UserRepository;
import com.eduraices.games.Model.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class GamesApplication implements CommandLineRunner {
    
    @Autowired
    public AssetRepository assetRepository;
    
    @Autowired
    public GameRepository gameRepository;
    
    @Autowired
    public GameAssetRepository gameAssetRepository;
    
    @Autowired
    public MatchAssetRepository matchAssetRepository;
    
    @Autowired
    public MatchRepository matchRepository;
    
    @Autowired
    public PlayerRepository playerRepository;
    
    @Autowired 
    public UserRepository userRepository;
    

	public static void main(String[] args) {
		SpringApplication.run(GamesApplication.class, args);
	}
        
        @Override
        public void run(String... args) throws Exception { 
        
            assetRepository.deleteAll();
              
            assetRepository.save(new Asset ( "A-bg-001", "mountains", "background", "www" ) );
            assetRepository.save(new Asset ( "A-tl-001", "grass", "tile", "www" ) );
            assetRepository.save(new Asset ( "A-it-001", "castle", "item", "www" ) );
            assetRepository.save(new Asset ( "A-tx-001", "new-game", "text", "Don't forget to take care of your back. Good luck!" ) );
            assetRepository.save(new Asset ( "A-bl-001", "river", "block", "www" ) );
            assetRepository.save(new Asset ( "A-sp-001", "Dark Knight", "sprite", "www" ) );
            assetRepository.save(new Asset ( "A-sp-002", "Soldier", "sprite", "www" ) );
            
            gameRepository.deleteAll();
            
            String [] matches = { "M-002" };
            gameRepository.save(new Game ("G-001", "Chess misters", "0.0.7-beta", "table", true, "Better online matches", "www", true, matches ) );
            String [] matches2 = new String [0];
            gameRepository.save(new Game ("G-002", "Mistery of Zerda", "1.5.3", "adult", false, "Erotic puzzles", "www", false, matches2 ) );
            String [] matches3 = { "M-003" };
            gameRepository.save(new Game ("G-003", "Sharks assault", "3.3.0", "arcade", false, "War 2D plattforms arcade", "www", true, matches3 ) );
            String [] matches4 = { "M-001" };
            gameRepository.save(new Game ("G-004", "Castles of La Mancha", "1.0.0", "role", true, "Must find the sorcerer to get the rain", "www", true, matches4 ) );
  
            
            gameAssetRepository.deleteAll();
            
            gameAssetRepository.save(new GameAsset("GA-001", "G-004", "A-bg-001", "block", 0, 0, 14, 1.25, "brown", "Wild Mountains") );
            gameAssetRepository.save(new GameAsset("GA-001", "G-004", "A-it-001", "item", 134.7, 212.0, 14, 1, "brown", "text") );
            gameAssetRepository.save(new GameAsset("GA-001", "G-004", "A-tl-001", "tile", 0, 120.2, 14, 0.5, "green", "this grass would be smokable?") );
            gameAssetRepository.save(new GameAsset("GA-004", "G-004", "A-sp-001", "hero", 104.2, 245.2, 14, 0.75, "black", "You're here") );
            
            matchRepository.deleteAll();
            
            String [] players = { "P-001", "P-002", "P-005" };
            matchRepository.save(new Match("M-001", "The final battle", "multiplayer", 3, players , "www", true, false, true ) );
            String [] players2 = { "P-002", "P-004", "P-001", "P-003" };
            matchRepository.save(new Match("M-002", "Masters championship", "multiplayer", 5, players2 , "www", true, true, true ) );
            String [] players3 = { "P-001", "P-002" };
            matchRepository.save(new Match("M-003", "2 players duel", "offline", 0, players3 , "www", false, false, true ) );
            String [][] players4 = new String [3][2];
            players4[0][0] = "P-001";
            players4[0][1] = "P-002" ;
            players4[1][0] = "P-003";
            players4[1][1] = "P-004" ;
            players4[2][0] = "P-005";
            matchRepository.save(new Match("M-004", "teams battle", "online", 0, players4 , "www", true, false, false ) );
            
            playerRepository.deleteAll();
            
            String [] goals = new String[0];
            String [] bag = { "bread", "liquor" };
            String [] weapons = { "sword", "bow", "knife" };
            playerRepository.save(new Player("P-001", "dark knight", "warrior", "A-001", "U-001", 14, 234, goals, bag, weapons, 0, true, false) );
            String [] bag2 = { "map", "anmo" };
            String [] weapons2 = { "gun", "grenade", "knife" };
            playerRepository.save(new Player("P-002", "white shark", "shark", "A-002", "U-001", 34, 445, goals, bag2, weapons2, 1, false, false) );
            String [] bag3 = new String[0];
            String [] weapons3 = new String[0];
            playerRepository.save(new Player("P-003", "mister chess", "novice", null, "U-002", 56, 785, goals, null, null, 0, true, false) );
            String [] goals4 = {"Medal of honor", "Eagles Label", "Shark Ops."};
            playerRepository.save(new Player("P-004", "messi", "shark", "A-002", "U-003", 5, 899, goals4, bag2, weapons2, 0, true, false) );
            String [] goals5 = {"Black castle", "White castle", "Wasted Castle"};
            playerRepository.save(new Player("P-005", "exterminator", "warrior", "A-001", "U-003", 23, 355, goals5, bag, weapons, 0, false, true) );
            String [] goals6 = { "Masters champion - 2022", "Man vs. Machine - 2021" };
            String [] bag6 = new String[0];
            String [] weapons6 = new String[0];
            playerRepository.save(new Player("P-006", "drugdealer", "masters", null, "U-004", 22, 984, goals, null, null, 0, true, false) );
            
            
            userRepository.deleteAll();
            
            String [] playersFK = { "P-001", "P-002"};
            String [] matchesFK = { "M-001", "M-002", "M-003", "M-004"};
            userRepository.save(new User("U-001", "edu", "edu@mail", playersFK, matchesFK, true, false) );
            
            String [] playersFK2 = { "P-003"};
            String [] matchesFK2 = { "M-002", "M-004"};
            userRepository.save(new User("U-002", "pedro", "pedro@mail", playersFK2, matchesFK2, true, false) );
            
            String [] playersFK3 = { "P-004", "P-005"};
            String [] matchesFK3 = { "M-001", "M-002", "M-004"};
            userRepository.save(new User("U-003", "mari", "mari@mail", playersFK3, matchesFK3, false, false) );
            
            String [] playersFK4 = { "P-006"};
            String [] matchesFK4 = new String[0];
            userRepository.save(new User("U-004", "juan", "juan@mail", playersFK4, matchesFK4, false, true) );
        }

}
