
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scanner.nextInt();

        if (num == 0) {
            System.out.println("zero");
        } else {
            if (num == 1) {
                System.out.println("um");
            } else {
                if (num == 2) {
                    System.out.println("dois");
                } else {
                    if (num == 3) {
                        System.out.println("três");
                    } else {
                        if (num == 4) {
                            System.out.println("quatro");
                        } else {
                            if (num == 5) {
                                System.out.println("cinco");
                            } else {
                                if (num == 6) {
                                    System.out.println("seis");
                                } else {
                                    if (num == 7) {
                                        System.out.println("sete");
                                    } else {
                                        if (num == 8) {
                                            System.out.println("oito");
                                        } else {
                                            if (num == 9) {
                                                System.out.println("nove");
                                            } else {
                                                System.out.println("Número inválido");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
