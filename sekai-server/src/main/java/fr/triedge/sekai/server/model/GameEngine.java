package fr.triedge.sekai.server.model;

public class GameEngine {

    private static GameEngine instance;

    private GameEngine(){}

    public static GameEngine getInstance(){
        if (instance == null){
            instance = new GameEngine();
        }
        return instance;
    }
}
