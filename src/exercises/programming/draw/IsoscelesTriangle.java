package exercises.programming.draw;

public class IsoscelesTriangle extends Line {

    IsoscelesTriangle() {
        n = 1;
    }

    IsoscelesTriangle(int new_n) {
        n = new_n;
    }

    public void Draw() {
        Draw_Isosceles_Triangle(n);
    }

    public void Draw_Isosceles_Triangle(int height) {
        int triangle_base = OddInThatIndex(height);

        for (int i = 0; i < height; i++) {
            int asterisks_in_that_line = OddInThatIndex(i + 1);
            int blank_spaces = triangle_base - asterisks_in_that_line;

            Draw_Asterisks_In_A_Line(blank_spaces, asterisks_in_that_line);
        }

    }

    public void Draw_Isosceles_Triangle(int height, String name) {
        int triangle_base = OddInThatIndex(height);

        for (int i = 0; i < height - 1; i++) {
            int asterisks_in_that_line = OddInThatIndex(i + 1);
            int blank_spaces = triangle_base - asterisks_in_that_line;

            Draw_Asterisks_In_A_Line(blank_spaces, asterisks_in_that_line);
        }

        System.out.println(name);
    }

    public void Draw_Asterisks_In_A_Line(int blank_spaces, int asterisks_in_that_line) {
        for (int j = 0; j < blank_spaces / 2; j++)
            System.out.print(" ");

        for (int j = 0; j < asterisks_in_that_line; j++)
            System.out.print("*");

        for (int j = 0; j < blank_spaces / 2; j++)
            System.out.print(" ");

        System.out.println();
    }

    // Given a number and supposing a list of all possible Odds, returns Odd[number]
    protected int OddInThatIndex(int number) {
        int odd = 1;
        int index = 1;

        while (index < number) {
            odd += 2;
            index += 1;
        }

        return odd;
    }

}
