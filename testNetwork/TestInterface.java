package testNetwork;

import player.*;

// This is an interface that MachinePlayer must implement for the tests to run
// successfully
public interface TestInterface {
    
    // Returns TRUE if PLAYER wins after making MOVE, FALSE otherwise. It looks
    // at the internal game board representation and checks if PLAYER wins after
    // making the move. The rules of winning are described in the README
    public boolean winMove(int player, Move move);
}
