/*
 * You can use the following import statements
 * 
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * import org.springframework.jdbc.core.RowMapper;
 * 
 */

// Write your code here


package com.example.player.model;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRowMapper implements RowMapper<Player>{
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException{
        return new Player(rs.getInt("playerId"),rs.getString("playerNamee"),rs.getInt("jerseyNumber"),rs.getString("role"));

        
    }
}