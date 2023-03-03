package com.example.player.model;




public class Player{
    private int playerId;
    private int jerseyNumber;
    private String playerName;
    private String role;


    public Player(int playerId,String playerName,int jerseyNumber,String role){
        this.playerId =playerId;
        this.jerseyNumber = jerseyNumber;
        this.playerName =playerName;
        this.role = role;
    }
    public int getPlayerId(){
        return playerId;
    }

    public void setPlayerId(int id){
         this.playerId = id;
    }



    public int getJerseyNumber(){
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber){
         this.jerseyNumber = jerseyNumber;
    }


    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }


    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }


    









}