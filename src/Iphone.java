import java.util.Scanner;

public class Iphone implements PlayerMusica, Telefone, Navegador {


    public void selectionMusic() {
        System.out.println("Selecionando música");
    }


    public void playMusic() {
        System.out.println("Tocando música");
    }


    public void pauseMusic() {
        System.out.println("Pausando música");
    }


    public void acceptCall() {
        System.out.println("Alô, quem está me ligando?");
    }


    public void startCall() {
        System.out.println("Alô! Gostaria de falar com o Marcos!");

    }


    public void voiceMail() {
        System.out.println("Você tem 10 mensagens. Gostaria de ouvi-las?");
    }


    public void openPage() {
        System.out.println("Você está acessando www.novosprojetos.com.br");
    }


    public void newTab() {
        System.out.println("Digite uma URL nesta nova aba");
    }


    public void refreshPage() {
        System.out.println("Novas notícias!");
    }
}
