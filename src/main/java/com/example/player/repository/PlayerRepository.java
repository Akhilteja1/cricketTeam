// Write your code here

package com.example.player.repository;

import com.example.player.model.Player;
import java.util.*;

public interface PlayerRepository{
    ArrayList<Player> getPlayers();
    void deletePlayer(int playerId);
    Player addPlayer(Player player); 
    Player updatePlayer(int playerId, Player player);
    Player getPlayerById(int playerId);

    

     
     
     
    
}
