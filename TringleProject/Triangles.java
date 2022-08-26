import java.util.Scanner;

public class Triangles {
    private static char lineChar = '*';
    private static int size;
    public Triangles(){
        size =51;
    }
    public static int length() {
        return size;
    } 
    public static void drawLine(int x0, int y0, int x1, int y1, boolean[][] matrix) {
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int tempx;
        if(x0 < x1)
            tempx = 1;
        else
            tempx = -1;
        int tempy = (y0 < y1) ? 1 : -1;
        int err = dx - dy;

        while(true) {
            mark(matrix, x0,y0);
            if ((x0 == x1) && (y0 == y1)) break;
            int  e2 = 2*err;
            if (e2 > -dy) { err -= dy; x0  += tempx; }
            if (e2 < dx) { err += dx; y0  += tempy; }
        }
    }
    static void mark(boolean[][] matrix, int x, int y){
        matrix[x][y]=true;
    }
    public static void clearMatrix(boolean[][] matrix){
        for (int i = 0; i < length(); i++) {
            for (int j = 0; j < length(); j++){
                matrix[i][j] = false;
            }
        }
    }
    public static void printMatrix(boolean[][] matrix){
        for (int i = 0; i < length(); i++) {
            for (int j = 0; j < length(); j++){
                if( !matrix[i][j] ){
                    System.out.print(" ");
                }
                else {
                    if (!matrix[i][j]) {
                        continue;
                    }
                    System.out.print(lineChar);
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        boolean[][] Matrix = new boolean[51][51];
        new Triangles();
        clearMatrix(Matrix);
        int x1, x2, y1, y2, x3 , y3 ;
        while (true) {
            System.out.println("Give 3 points for triangle (x,y)");
            Scanner scn = new Scanner(System.in);  
            x1 = scn.nextInt();
            y1 = scn.nextInt();
            x2 = scn.nextInt();
            y2 = scn.nextInt();
            x3 = scn.nextInt();
            y3 = scn.nextInt();
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0 && x3 == 0 && y3 == 0)
                break;
            drawLine(x1, y1, x2, y2, Matrix);
            drawLine(x2, y2, x3, y3, Matrix);
            drawLine(x3, y3, x1, y1, Matrix);
            printMatrix(Matrix);
            clearMatrix(Matrix);
        }
    }
}

