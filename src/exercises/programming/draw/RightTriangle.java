package exercises.programming.draw;

public class RightTriangle extends Line {

    RightTriangle() {
        n = 1;
    }

    RightTriangle(int new_n) {
        n = new_n;
    }

    public void Draw() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }

    }

}
