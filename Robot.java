public class Robot {
    private Position position;
    private Direction direction;
    private char command;

    public Robot(Position position,Direction direction){
        this.position = position;
        this.direction = direction;
    }
    private void turnLeft(){
        switch (direction){
            case NOTRH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.NOTRH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
        }
    }
    private void turnRight(){
        switch (direction){
            case NOTRH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NOTRH;
                break;
        }
    }
    public void move(char command){
        this.command = command;
        switch (command){
            case 'A':
                position.move(direction);
                break;
            case 'L':
                turnLeft();
                break;
            case 'R':
                turnRight();
                break;
        }
    }

    public void tampil(){
        System.out.println(command+" -> ("+position.getX()+","+position.getY()+")");
    }
}
