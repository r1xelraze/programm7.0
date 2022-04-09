package com.company;


import java.util.Scanner;

public class Main {
    static class formula {
        float x;
        float y;
        float z;

        public formula(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void dispalayFormula() throws VectorException {
            if (x < 0) throw new VectorException("X отрицательно");
            if (y < 0) throw new VectorException("Y отрицательно");
            if (z < 0) throw new VectorException("Z отрицательно");

            double len = Math.sqrt((Math.pow(x, 2) + (Math.pow(y, 2)) + (Math.pow(z, 2))));
            System.out.println("Длина вектора: " + len);

        }

        static class VectorException extends Exception {
            public VectorException(String message) {

                super(message);

            }
        }

    }

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите x:");
            int x = in.nextInt();

            System.out.println("Введите y:");
            int y = in.nextInt();

            System.out.println("Введите z:");
            int z = in.nextInt();

            formula form = new formula(x, y, z);
            form.dispalayFormula();
        }catch (formula.VectorException ex){
            System.out.println(ex.getMessage());
        }
    }
}
