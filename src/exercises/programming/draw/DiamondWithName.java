package exercises.programming.draw;

public class DiamondWithName extends Diamond {

    private String name;

    DiamondWithName() {
        n = 1;
        name = "Pietra";
    }

    DiamondWithName(int new_n, String new_name) {
        n = new_n;
        name = new_name;
    }

    public void Draw() {
        Draw_Isosceles_Triangle(n, name);
        Draw_Inverted_Isosceles_Triangle(n - 1);
    }

}
