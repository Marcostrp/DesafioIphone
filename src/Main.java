import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int subOption = -1;
        int option = -1;

        Iphone iphone = new Iphone();

        System.out.println("--------Escolha a função--------");
        System.out.println(" ");
        System.out.println("  1 - Player de Música");
        System.out.println("  2 - Telefone");
        System.out.println("  3 - Navegador");
        option = scanner.nextInt();

        if (option == 1){
            System.out.println("Player de Música");
            System.out.println("Escolha a função");
            System.out.println("1 - Seleção de Música");
            System.out.println("2 - Tocar música");
            System.out.println("3 - Pausar música");
            subOption = scanner.nextInt();

            if (subOption == 1){
                iphone.selectionMusic();
            } else if (subOption == 2) {
                iphone.playMusic();
            } else if (subOption == 3) {
                iphone.pauseMusic();
            }

        } else if (option == 2) {
            System.out.println("Telefone");
            System.out.println("Escolha a função");
            System.out.println("1 - Aceitar chamada");
            System.out.println("2 - Fazer chamada");
            System.out.println("3 - Correio de Voz");
            subOption = scanner.nextInt();

            if (subOption == 1){
                iphone.acceptCall();
            } else if (subOption == 2) {
                iphone.startCall();
            } else if (subOption == 3) {
                iphone.voiceMail();
            }

        } else if (option == 3) {
            System.out.println("Navegador Web");
            System.out.println("Escolha a função");
            System.out.println("1 - Abrir uma página");
            System.out.println("2 - Adicionar uma nova aba");
            System.out.println("3 - Atualizar página");
            subOption = scanner.nextInt();

            if (subOption == 1) {
                iphone.openPage();
            } else if (subOption == 2) {
                iphone.newTab();
            } else if (subOption == 3) {
                iphone.refreshPage();
            }
        }
    }

}