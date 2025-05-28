import java.awt.Color; // Assuming you're using AWT/Swing for colors

public enum TetrominoType {
    I(new int[][][] {
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
    }, Color.CYAN, 3, 0),
    
    O(new int[][][] {
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
        {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}},
    }, Color.YELLOW, 4, 0);
    // J, 
    // T, 
    // Z, 
    // L, 
    // S;

     // Fields for the enum constants
     private final int[][][] shapes; // Stores all rotation patterns for this type
     private final Color color;
     private final int initialSpawnX;
     private final int initialSpawnY;
 
     // THIS IS THE CRUCIAL PART: The enum constructor
     // It MUST match the types and order of arguments you pass to I(...), J(...), etc.
     TetrominoType(int[][][] shapes, Color color, int initialSpawnX, int initialSpawnY) {
         this.shapes = shapes;
         this.color = color;
         this.initialSpawnX = initialSpawnX;
         this.initialSpawnY = initialSpawnY;
     }
}
