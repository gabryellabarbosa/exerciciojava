package exercicio;

import java.util.Scanner;

public class exifelsehomensmulheres {
    public static void main(String[] args) {
        float altura, somaHomens=0, mediaHomens=0, maiorAltura=0, menorAltura=0;
        int sexo, qtFeminino=0, qtMasculino=0;

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Digite o sexo da pessoa, sendo\n0 para FEMININO ou 1 para MASCULINO: ");
            sexo = entrada.nextInt();
            System.out.print("Digite a altura: ");
            altura = entrada.nextFloat();
            if (sexo == 0) {
                System.out.print("Você escolheu: Sexo Feminino, com tamanho de " + altura + "m\n");
                qtFeminino++;
            } else if (sexo == 1) {
                System.out.print("Você escolheu: Sexo Masculino, com tamanho de " + altura + "m\n");
                qtMasculino++;
                somaHomens = somaHomens + altura;
            } else {
                System.out.println("Opção Escolhida foi Inválida!");
            }

            if (i == 0) {
                maiorAltura = altura;
                menorAltura = altura;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura){
                menorAltura = altura;
            }
        }
        mediaHomens = somaHomens / qtMasculino;

        System.out.println("\nA maior altura foi de " + maiorAltura + "m, e a menor foi de " + menorAltura + "m");
        System.out.println("A média de altura de pessoas do sexo Masculino é de " + mediaHomens + "m");
        System.out.println("O número de pessoas do sexo Feminino é de " + qtFeminino + " pessoas.");


    }
}
