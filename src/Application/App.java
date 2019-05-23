package Application;

import Arquivos.AbstractFile;
import Arquivos.Directory;
import java.util.Scanner;
import Arquivos.File;

/**
 * Composite é o miojão dos estruturais
 * serve para poupar código (obviamente)
 * Pensando nas estruturas de arquivos, imagine criar os arquivos musica, video, jogo, arquivotxt, pdf,...
 * O numero de classes e herança crescerá exponencialmente com isso
 * Dessa forma, tratamos tudo como arquivo ou diretorio (O MIOJAO CPX)
 */

public class App {

    private static String coletaInfos(){
        Scanner in = new Scanner (System.in);
        String resposta = "";
        while (true){
            System.out.println("1 - Mostrar conteúdo do diretorio");
            System.out.println("2 - Mostrar conteúdo dos arquivos");
            System.out.println("3 - Encerrar programa");
            resposta = in.nextLine();
            if (resposta.equals("1") || resposta.equals("2") || resposta.equals("3")){
                return resposta;
            }
        }
    }

    private static void close(){
        System.out.println("==================FIM!==================");
    }

    private static void start(){
        System.out.println("================Bem vindo!================");
    }

    public static void main(String[] args) {
        Directory music = new Directory("Music");
        Directory videos = new Directory("Videos");
        Directory games = new Directory("Games");
        String resposta = "";

        File track1 = new File("StairwayToHeaven.mp3", 666);
        File track2 = new File("ELEMENT.mp3", 784);
        File track3 = new File("44BARS.mp3", 444);
        File track4 = new File("RodaGigante.mp3", 715);

        File video1 = new File("MoonEgg.mp4", 9935);
        File video2 = new File("2Fast2FuriousBriansArrival.mp4", 10145);
        File video3 = new File("DanteVSVergilDMC3.mp4", 3465);

        File game1 = new File ("Devil May Cry 3", 645078945);
        File game2 = new File ("FIFA 19", 645128945);
        File game3 = new File ("Call Of Duty Black Ops 1", 115935174);

        music.add(track1);
        music.add(track2);
        music.add(track3);
        music.add(track4);

        videos.add(video1);
        videos.add(video2);
        videos.add(video3);

        games.add(game1);
        games.add(game2);
        games.add(game3);
        App.start();

        while (true){
            resposta = App.coletaInfos();

            if (resposta.equals("1")){
                music.ll();
                videos.ll();
                games.ll();
            }

            if (resposta.equals("2")){
                track1.ll();
                track2.ll();
                track3.ll();
                track4.ll();

                video1.ll();
                video2.ll();
                video3.ll();

                game1.ll();
                game2.ll();
                game3.ll();
            }

            if (resposta.equals("3")){
                App.close();
                break;
            }
        }
    }
}
