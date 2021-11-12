package marsrover;

public class Rover {
    int x;
    int y;
    char direction;

    Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int[] getCurrentPosition() {
        return new int[]{x,y};
    }

    public char getCurrentDirection() {
        return direction;
    }

    public void move(char[] command) {
        for (char cmd: command) {
            if (cmd == 'F') {
                if (direction == 'N') {
                    y++;
                } else if (direction == 'E') {
                    x++;
                } else if (direction == 'S') {
                    y--;
                } else if (direction == 'W') {
                    x--;
                }
            } else if (cmd == 'B') {
                if (direction == 'N') {
                    y--;
                } else if (direction == 'E') {
                    x--;
                } else if (direction == 'S') {
                    y++;
                } else if (direction == 'W') {
                    x++;
                }
            } else if (cmd == 'L') {
                if (direction == 'N') {
                    direction = 'W';
                }
            }
        }
    }
}
