package Robot;

public class Switch {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int X;
        int Y;
        Direction direction;

        public Robot(int X, int Y, Direction direction) {
            this.X = X;
            this.Y = Y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }
        public int getX() {
            return X;
        }
        public int getY() {
            return Y;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
            if (direction == Direction.UP) {
                direction = Direction.LEFT;
            } else if (direction == Direction.DOWN) {
                direction = Direction.RIGHT;
            } else if (direction == Direction.LEFT) {
                direction = Direction.DOWN;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.UP;
            }
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
            if (direction == Direction.UP) {
                direction = Direction.RIGHT;
            } else if (direction == Direction.DOWN) {
                direction = Direction.LEFT;
            } else if (direction == Direction.LEFT) {
                direction = Direction.UP;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.DOWN;
            }
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
            if (direction == Direction.UP) {
                Y++;
            }
            if (direction == Direction.DOWN) {
                Y--;
            }
            if (direction == Direction.LEFT) {
                X--;
            }
            if (direction == Direction.RIGHT) {
                X++;
            }
        }

        public static void moveRobot(Robot robot, int toX, int toY) {
            // реализация к главном классе
            int tX = robot.getX();
            int tY = robot.getY(); // координаты

            System.out.println("Начальная позиция " + robot.getX() + " " + robot.getY() +
                    ". Направление взгляда: " + robot.getDirection());

            if (tX >= toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                while (tX != toX) {
                    robot.stepForward();
                    tX--;
                }
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                while (tX != toX) {
                    robot.stepForward();
                    tX++;
                }
            }

            if (tY >= toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (tY != toY) {
                    robot.stepForward();
                    tY--;
                }

            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (tY != toY) {
                    robot.stepForward();
                    tY++;
                }
            }
            System.out.println("Конечная позиция " + robot.getX() + " " + robot.getY() +
                    ". Направление взгляда: " + robot.getDirection());

        }
    }

    public static void main(String[] args) {

        Robot robot = new Robot(0, 0, Direction.UP); // начальное положение
        Robot.moveRobot(robot, 10, 12);
        Robot.moveRobot(robot, -57, 22);



    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // реализация к главном классе
        int tX = robot.getX();
        int tY = robot.getY(); // координаты

        System.out.println("Начальная позиция " + robot.getX() + " " + robot.getY() +
                ". Направление взгляда: " + robot.getDirection());

        if (tX >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (tX != toX) {
                robot.stepForward();
                tX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (tX != toX) {
                robot.stepForward();
                tX++;
            }
        }

        if (tY >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (tY != toY) {
                robot.stepForward();
                tY--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (tY != toY) {
                robot.stepForward();
                tY++;
            }
        }
        System.out.println("Конечная позиция " + robot.getX() + " " + robot.getY() +
                ". Направление взгляда: " + robot.getDirection());
    }
}
