package exercises.programming.draw;

import java.util.Scanner;

class ExerciseProgramming {

    public static void main(String args[]) {
        int drawing_type, number;
        boolean running = true;
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose a drawing:");
        System.out.println("One Asterisk        - 1 ");
        System.out.println("Horizontal Line     - 2 (Number Needed)");
        System.out.println("Vertical Line       - 3 (Number Needed)");
        System.out.println("Right Triangle      - 4 (Number Needed)");
        System.out.println("Isosceles Triangle  - 5 (Number Needed)");
        System.out.println("Diamond             - 6 (Number Needed)");
        System.out.println("Diamond With Name   - 7 (Number and Name Needed)");
        System.out.println("Exit                - 13");

        while (running) {
            drawing_type = reader.nextInt();
            Drawing drawing;

            switch (drawing_type) {
                /* One Asterisk */
                case 1: {
                    drawing = new OneAsterisk();
                    drawing.Draw();
                }
                break;
                /* Horizontal Line */
                case 2: {
                    number = reader.nextInt();
                    drawing = new HorizontalLine(number);
                    drawing.Draw();
                }
                break;
                /* Vertical Line */
                case 3: {
                    number = reader.nextInt();
                    drawing = new VerticalLine(number);
                    drawing.Draw();
                }
                break;
                /* Right Triangle */
                case 4: {
                    number = reader.nextInt();
                    drawing = new RightTriangle(number);
                    drawing.Draw();
                }
                break;
                /* Isosceles Triangle */
                case 5: {
                    number = reader.nextInt();
                    drawing = new IsoscelesTriangle(number);
                    drawing.Draw();
                }
                break;
                /* Diamond */
                case 6: {
                    number = reader.nextInt();
                    drawing = new Diamond(number);
                    drawing.Draw();
                }
                break;
                /* Diamond With Name */
                case 7: {
                    number = reader.nextInt();
                    String name = reader.next();
                    drawing = new DiamondWithName(number, name);
                    drawing.Draw();
                }
                break;
                /* Exit */
                case 13: {
                    running = false;
                    break;
                }
                default: {
                    System.out.println("Ops, we didn't find this type of drawing.");
                }
            }
        }
    }

}
