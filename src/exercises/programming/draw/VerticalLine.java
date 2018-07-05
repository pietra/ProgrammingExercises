package exercises.programming.draw;

public class VerticalLine extends Line{

    VerticalLine() {
        n = 1;
    }

    VerticalLine(int new_n) {
        n = new_n;
    }

    public void Draw() {
        for (int i = 0; i < n; i++)
            System.out.println('*');
    }

}
