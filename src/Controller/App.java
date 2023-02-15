package src.Controller;

import src.Model.Direction;
import src.Model.Position;
import src.Model.Robot;

public class App {
    public void run(){
        Robot robot = new Robot(new Position(2,3), Direction.EAST);

        String commands = "AARAAAA";
        for (int i = 0; i < commands.length();i++){
            robot.move(commands.charAt(i));
            robot.tampil();
        }
    }
}
