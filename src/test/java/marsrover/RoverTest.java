package marsrover;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RoverTest {
    @Test
    public void GivenStartingPoint_1_1_N_ThenRoverAt_1_1_N() {
        // arrange
        Rover rover = new Rover(1,1,'N');
        int [] expected = new int[]{1,1};

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('N', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_1_1_N_WhenMoveForward_ThenRoverAt_1_2_N() {
        // arrange
        Rover rover = new Rover(1,1,'N');
        int [] expected = new int[]{1,2};
        char[] command = new char[]{'F'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('N', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_1_1_E_WhenMoveForward_ThenRoverAt_2_1_E() {
        // arrange
        Rover rover = new Rover(1,1,'E');
        int [] expected = new int[]{2,1};
        char[] command = new char[]{'F'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('E', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_1_2_S_WhenMoveForward_ThenRoverAt_1_1_S() {
        // arrange
        Rover rover = new Rover(1,2,'S');
        int [] expected = new int[]{1,1};
        char[] command = new char[]{'F'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('S', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_2_1_W_WhenMoveForward_ThenRoverAt_1_1_W() {
        // arrange
        Rover rover = new Rover(2,1,'W');
        int [] expected = new int[]{1,1};
        char[] command = new char[]{'F'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('W', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_1_2_N_WhenMoveBackward_ThenRoverAt_1_1_N() {
        // arrange
        Rover rover = new Rover(1,2,'N');
        int [] expected = new int[]{1,1};
        char[] command = new char[]{'B'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('N', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_2_1_E_WhenMoveBackward_ThenRoverAt_1_1_E() {
        // arrange
        Rover rover = new Rover(2,1,'E');
        int [] expected = new int[]{1,1};
        char[] command = new char[]{'B'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('E', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_1_1_S_WhenMoveBackward_ThenRoverAt_1_2_S() {
        // arrange
        Rover rover = new Rover(1,1,'S');
        int [] expected = new int[]{1,2};
        char[] command = new char[]{'B'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('S', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_1_1_W_WhenMoveBackward_ThenRoverAt_2_1_W() {
        // arrange
        Rover rover = new Rover(1,1,'W');
        int [] expected = new int[]{2,1};
        char[] command = new char[]{'B'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('W', rover.getCurrentDirection());
    }

    @Test
    public void GivenRoverAt_1_1_N_WhenTurnRight_ThenRoverAt_1_1_W() {
        // arrange
        Rover rover = new Rover(1,1,'N');
        int [] expected = new int[]{1,1};
        char[] command = new char[]{'L'};

        // act
        rover.move(command);

        // assert
        assertArrayEquals(expected, rover.getCurrentPosition());
        assertEquals('W', rover.getCurrentDirection());
    }
} 
