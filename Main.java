public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Position(2,3),Direction.EAST);

        String commands = "AARAAAA";
        for (int i = 0; i < commands.length();i++){
            robot.move(commands.charAt(i));
            robot.tampil();
        }
    }
}
