package test;

import java.util.Random;

public class dice_0215 {
    public static void main(String[] args) {
        Random rand = new Random();

        int dice1 = rand.nextInt(6) + 1; // 1부터 6까지의 무작위 정수 생성
        int dice2 = rand.nextInt(6) + 1; // 1부터 6까지의 무작위 정수 생성

        int sum = dice1 + dice2; // 주사위 두 개의 합

        System.out.println("주사위 1: " + dice1);
        System.out.println("주사위 2: " + dice2);
        System.out.println("주사위 두 개의 합: " + sum);
    }
}
