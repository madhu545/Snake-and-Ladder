public class PlayerCheckOption {

  public static void main(String[] args) {


    int PLAYER_NO_PLAY = 1;
    int PLAYER_LADDER = 2;
    int PLAYER_SNAKE = 3;
    
    double dieCheck = (Math.floor(Math.random() * 10) % 6) + 1;

    if (dieCheck == PLAYER_NO_PLAY)
         System.out.println("player is in same place");
    else
         System.out.println("player moves forward");

    if (dieCheck == PLAYER_LADDER)
         System.out.println("player moves ahead by ladder");

    else
   
    if (dieCheck == PLAYER_SNAKE) 
        System.out.println("player moves behind by snake");
}
}
