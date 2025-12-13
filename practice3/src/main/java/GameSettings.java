public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String newGameName){
        this.gameName = newGameName;
    }

    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }

    void addPlayer(){
        if(this.currentPlayers < maxPlayers){
            this.currentPlayers++;
        }
        else{
            System.out.println("The max players limit is reached Game:" + this.gameName);
        }
    }

    void printGameStatus(){
        System.out.println("Game name: " + this.gameName + " Current players #: " + this.currentPlayers + " Max players #: " + maxPlayers);
    }



}
