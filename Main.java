public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Position(2,3),Direction.EAST);

        String commands = "AARRALA";
        for (int i = 0; i < commands.length();i++){
            robot.move(commands.charAt(i));
            robot.tampil();
        }
    }
}
