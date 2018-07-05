package exercises.programming.draw;

public class Diamond extends IsoscelesTriangle {

    Diamond() {
        n = 1;
    }

    Diamond(int new_n) {
        n = new_n;
    }

    public void Draw() {
        Draw_Isosceles_Triangle(n);
        Draw_Inverted_Isosceles_Triangle(n - 1);
    }

    public void Draw_Inverted_Isosceles_Triangle(int height) {
        int triangle_top = OddInThatIndex(height + 1);

        for (int i = height; i > 0; i--) {
            int asterisks_in_that_line = OddInThatIndex(i);
            int blank_spaces = triangle_top - asterisks_in_that_line;

            Draw_Asterisks_In_A_Line(blank_spaces, asterisks_in_that_line);
        }
    }

}
