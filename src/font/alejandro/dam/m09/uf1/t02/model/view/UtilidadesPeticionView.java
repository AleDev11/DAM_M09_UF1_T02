package font.alejandro.dam.m09.uf1.t02.model.view;

import java.util.Scanner;

public class UtilidadesPeticionView {
    float getFloat(String _text) {
        System.out.println(_text);
        Scanner scanner = new Scanner(System.in);
        float value = scanner.nextInt();
        return value;
    }

    String getString(String _text) {
        System.out.println(_text);
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        return value;
    }

    byte getByte(String _text) {
        System.out.println(_text);
        Scanner scanner = new Scanner(System.in);
        byte value = scanner.nextByte();
        return value;
    }
}
