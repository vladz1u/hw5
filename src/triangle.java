public class triangle {
    public static void main(String[] args) {
        triangleTop();
        triangleRight();
        triangleLeft();
        triangleBot();

    }

    public static void triangleTop() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j && i < 5 || i + j == 9 && i < 5 || i == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void triangleRight() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j && i >= 5 || i + j == 9 && i < 5 || j == 9) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void triangleLeft() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j && i < 5 || i + j == 9 && i >= 5 || j == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void triangleBot() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j && i >= 5 || i + j == 9 && i >= 5 || i == 9) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


}
