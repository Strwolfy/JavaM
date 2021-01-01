package Robot;

public class module2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 10, 12);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() { return dir; }
        public int getX() { return x; }
        public int getY() { return y; }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }
        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }
        public void stepForward() {
            if (dir == Direction.UP) { y++; }
            if (dir == Direction.DOWN) { y--; }
            if (dir == Direction.LEFT) { x--; }
            if (dir == Direction.RIGHT) { x++; }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Координаты: x "
                + robot.getX() + ", y " + robot.getY());

        int x = robot.getX();
        int y = robot.getY();

        System.out.println("Начальная позиция " + robot.getX() + " "
                + robot.getY() + ". Направление взгляда: " + robot.getDirection());

        if (x >= toX) {
            while (robot.getDirection() != Direction.LEFT) { robot.turnLeft(); }
            while (x != toX) {
                robot.stepForward();
                x--; }
        } else {
            while (robot.getDirection() != Direction.RIGHT) { robot.turnRight(); }
            while (x != toX) {
                robot.stepForward();
                x++;
            }
        }

        if (y >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (y != toY) {
                robot.stepForward();
                y--;
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (y != toY) {
                robot.stepForward();
                y++;
            }
        }
    }
}