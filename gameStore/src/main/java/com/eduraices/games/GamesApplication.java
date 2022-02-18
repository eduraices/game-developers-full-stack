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
import com.eduraices.games.Repository.UserProfileRepository;
import com.eduraices.games.Model.UserProfile;
import com.eduraices.games.Repository.RoomRepository;
import com.eduraices.games.Model.Room;

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
    
    @Autowired 
    public UserProfileRepository userProfileRepository;
    
    @Autowired
    public RoomRepository roomRepository;
    

	public static void main(String[] args) {
		SpringApplication.run(GamesApplication.class, args);
	}
        
        @Override
        public void run(String... args) throws Exception { 
            
            userRepository.deleteAll();
            
            userRepository.save(new User("u-001","edu@mail", "UP-001") );
            userRepository.save(new User("u-002", "pedro@mail", "UP-004") );
            userRepository.save(new User("u-003", "mari@mail", "UP-002") );
            userRepository.save(new User("u-004", "juan@mail", "UP-003") );
            
            userProfileRepository.deleteAll();
            
            String [] playersFK = { "p-001", "p-002"};
            String [] matchesFK = { "m-001", "m-002", "m-003", "m-004"};
            userProfileRepository.save(new UserProfile("up-001", "u-001", "edu", "i-001", playersFK, matchesFK, true, false) );
            
            String [] playersFK2 = { "p-003"};
            String [] matchesFK2 = { "m-002", "m-004"};
            userProfileRepository.save(new UserProfile("up-004", "u-002", "pedro", "i-003", playersFK2, matchesFK2, true, false) );
            
            String [] playersFK3 = { "p-004", "p-005"};
            String [] matchesFK3 = { "m-001", "m-002", "m-004"};
            userProfileRepository.save(new UserProfile( "up-002", "u-003", "mari", "i-002", playersFK3, matchesFK3, false, false) );
            
            String [] playersFK4 = { "p-006"};
            String [] matchesFK4 = new String[0];
            userProfileRepository.save(new UserProfile( "up-003", "u-004", "juan", "i-004", playersFK4, matchesFK4, false, true) );
        
            playerRepository.deleteAll();
            
            String [] goals = new String[0];
            String [] bag = { "bread", "liquor" };
            String [] weapons = { "sword", "bow", "knife" };
            playerRepository.save(new Player("p-001", "dark knight", "warrior", "a-001", "u-001", 14, 234, goals, bag, weapons, 0, true, false) );
            String [] bag2 = { "map", "anmo" };
            String [] weapons2 = { "gun", "grenade", "knife" };
            playerRepository.save(new Player("p-002", "white shark", "shark", "a-002", "u-001", 34, 445, goals, bag2, weapons2, 1, false, false) );
            String [] bag3 = new String[0];
            String [] weapons3 = new String[0];
            playerRepository.save(new Player("p-003", "mister chess", "novice", null, "u-002", 56, 785, goals, null, null, 0, true, false) );
            String [] goals4 = {"Medal of honor", "Eagles Label", "Shark Ops."};
            playerRepository.save(new Player("p-004", "messi", "shark", "a-002", "u-003", 5, 899, goals4, bag2, weapons2, 0, true, false) );
            String [] goals5 = {"Black castle", "White castle", "Wasted Castle"};
            playerRepository.save(new Player("p-005", "exterminator", "warrior", "a-001", "u-003", 23, 355, goals5, bag, weapons, 0, false, true) );
            String [] goals6 = { "Masters champion - 2022", "Man vs. Machine - 2021" };
            String [] bag6 = new String[0];
            String [] weapons6 = new String[0];
            playerRepository.save(new Player("p-006", "drugdealer", "masters", null, "u-004", 22, 984, goals, null, null, 0, true, false) );
            
            
            assetRepository.deleteAll();
              
            assetRepository.save(new Asset ( "a-001", "mountains", "background", "www" ) );
            assetRepository.save(new Asset ( "a-002", "grass", "tile", "www" ) );
            assetRepository.save(new Asset ( "a-003", "castle", "item", "www" ) );
            assetRepository.save(new Asset ( "a-004", "new-game", "text", "Don't forget to take care of your back. Good luck!" ) );
            assetRepository.save(new Asset ( "a-005", "river", "block", "www" ) );
            assetRepository.save(new Asset ( "a-006", "Dark Knight", "sprite", "www" ) );
            assetRepository.save(new Asset ( "a-007", "Soldier", "sprite", "www" ) );
            
            gameRepository.deleteAll();
            
            String [] matches = { "m-002" };
            String [] rooms = { "r-001", "r-002"};
            gameRepository.save(new Game ("g-001", "Chess misters", "0.0.7-beta", "table", true, "Better online matches", "www", true, matches, 2, 30, rooms ) );
            String [] matches2 = new String [0];
            String [] rooms2 = { "r-003", "r-005", "r-006"};
            gameRepository.save(new Game ("g-002", "Mistery of Zerda", "1.5.3", "adult", false, "Erotic puzzles", "www", false, matches2, 5, 50, rooms2 ) );
            String [] matches3 = { "m-003" };
            String [] rooms3 = { "r-004", "r-007"};
            gameRepository.save(new Game ("g-003", "Sharks assault", "3.3.0", "arcade", false, "War 2D plattforms arcade", "www", true, matches3, 100, 1000, rooms3 ) );
            String [] matches4 = { "m-001" };
            String [] rooms4 = { "r-008"};
            gameRepository.save(new Game ("g-004", "Castles of La Mancha", "1.0.0", "role", true, "Must find the sorcerer to get the rain", "www", true, matches4, 1, 100, rooms4 ) );
  
            
            gameAssetRepository.deleteAll();
            
            gameAssetRepository.save(new GameAsset("ga-001", "g-004", "a-002", "block", 0, 0, 14, 1.25, "brown", "Wild Mountains") );
            gameAssetRepository.save(new GameAsset("ga-001", "g-004", "a-001", "item", 134.7, 212.0, 14, 1, "brown", "text") );
            gameAssetRepository.save(new GameAsset("ga-001", "g-004", "a-004", "tile", 0, 120.2, 14, 0.5, "green", "this grass would be smokable?") );
            gameAssetRepository.save(new GameAsset("GA-004", "g-004", "a-003", "hero", 104.2, 245.2, 14, 0.75, "black", "You're here") );
            
            roomRepository.deleteAll();
            
            roomRepository.save(new Room("r-001", "g-001", "u-001", "hell room", true, 10, 200, 100, 40, "for all devil players", null));
            roomRepository.save(new Room("r-002", "g-001", "u-002", "top-100 players", false, 20, 100, 100, 10, "experts room", null));
            roomRepository.save(new Room("r-003", "g-002", "u-004", "friends to be friends", true, 0, 1000, 300, 70, "24h opened room, no limit", null));
            roomRepository.save(new Room("r-004", "g-003", "u-003", "Royal Hall", false, 1, 50, 50, 20, "site of Masters championship", null));
            roomRepository.save(new Room("r-005", "g-002", "u-003", "XXX night shooters", false, 1, 200, 50, 10, "site of vice", null));
            roomRepository.save(new Room("r-006", "g-002", "u-001", "I shot the sheriff", false, 1, 50, 50, 20, "who shot the sheriff?", null));
            roomRepository.save(new Room("r-007", "g-003", "u-002", "Royal Hall", false, 10, 20, 20, 10, "site of Masters championship", null));
            roomRepository.save(new Room("r-008", "g-004", "u-004", "Red House", false, 5, 100, 50, 30, "erotic chats and games", null));
            
            matchRepository.deleteAll();
            
            String [] players = { "p-001", "p-002", "p-005" };
            matchRepository.save(new Match("m-001", "The final battle", "multiplayer", 3, "p-005", "r-001", 3, players , "www", true, false, true, null ) );
            String [] players2 = { "p-002", "p-004", "p-001", "p-003" };
            matchRepository.save(new Match("m-002", "Masters championship", "multiplayer", 5, "p-001", "r-003", 4, players2 , "www", true, true, true, null ) );
            String [] players3 = { "p-001", "p-002" };
            matchRepository.save(new Match("m-003", "2 players duel", "offline", 0, "p-002", "r-002", 2, players3 , "www", false, false, true, "p-001" ) );
            String [][] players4 = new String [3][2];
            players4[0][0] = "p-001";
            players4[0][1] = "P-002" ;
            players4[1][0] = "P-003";
            players4[1][1] = "P-004" ;
            players4[2][0] = "P-005";
            String [] winners = {"p-003", "p-004"};
            matchRepository.save(new Match("m-004", "teams battle", "online", 0, "p-004", "r-004", 8, 3, players4 , "www", true, false, false, winners ) );
            
            
            
            
        }

}
