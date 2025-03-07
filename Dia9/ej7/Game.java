package ej7;

import java.util.ArrayList;
import java.util.List;

public class Game {
    
    private List<Enemy> enemies = new ArrayList<>();
    private boolean endGame = false;

    public void init() {
        enemies.add(new KnifeEnemy());
        enemies.add(new GunEnemy());
    }

    public void run() {
        while (!endGame) {
            for (Enemy enemy : enemies) {
                enemy.doAction();
            }
        }
    }
}
