package com.ll.exam;

import java.util.Scanner;

public class App {
    private Scanner sc;
    private String cmd;

    public App() {

        sc = new Scanner(System.in);
    }

    public void run() {
        System.out.println("===명언 SSG===");

        int lastIndex = 0;


        outer:
        while (true) {
            System.out.printf("명령) ");
            cmd = sc.nextLine().trim();
            int id = ++lastIndex;

            switch (cmd) {
                case "등록" :
                    System.out.printf("명언: ");
                    String content = sc.nextLine().trim();
                    System.out.printf("작가: ");
                    String author = sc.nextLine().trim();
                    System.out.printf("%d번 명언이 등록되었습니다.\n",id);

                    WiseSaying wiseSaying = new WiseSaying(id, content, author);

                    break;
                case "목록" :
                    System.out.println("번호 / 명언 / 작가");



                case "종료" :
                    System.out.println("===종료===");
                    break outer;


            }

        }


    }
}
