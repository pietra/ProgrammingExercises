package exercises.programming.draw;

class HorizontalLine extends Line {

    HorizontalLine() {
        n = 1;
    }

    HorizontalLine(int new_n) {
        n = new_n;
    }

    public void Draw() {
        for (int i = 0; i < n; i++)
            System.out.print('*');
    }

}
