package com.company;

    import java.util.Scanner;

public class DiagnosisTool {

    public static void main(String[] args) {

        System.out.println("石田将太との相性診断");

        System.out.println("");


        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2,};

//        int sum = 0 ;
//
//        int answer_count = 0;
//
//        int input_num = 0;

        System.out.println("該当する番号の数字を入力してください");

        System.out.println("");
//質問１
        System.out.println("私は野球が好きだ");
        System.out.println("１あてはまらない　2あてはまる");

        int input = scanner.nextInt();
        for (int n : numbers) {
            if (input == 2) {
                System.out.println("相性良い！");
                break;
            } else if(input == 1) {
                System.out.println("ん〜、、、");
                break;

            }
        }

        System.out.println("");
//質問２
        System.out.println("中でも横浜ベイスターズが好きだ");
        System.out.println("１あてはまらない　2あてはまる");

        int input1 = scanner.nextInt();
        for (int n : numbers) {
            if (input1 == 2) {
                System.out.println("相性良い！");
                break;
            } else if(input1 == 1) {
                System.out.println("ん〜、、、");
                break;

            }
        }

        System.out.println("");
//質問３
        System.out.println("私はカメラが好きだ");
        System.out.println("１あてはまらない　2あてはまる");

        int input2 = scanner.nextInt();
        for (int n : numbers) {
            if (input2 == 2) {
                System.out.println("相性良い！");
                break;
            } else if(input2 == 1) {
                System.out.println("ん〜、、、");
                break;

            }
        }

        System.out.println("");
//質問４
        System.out.println("私は一眼レフカメラを持っている");
        System.out.println("１あてはまらない　2あてはまる");

        int input3 = scanner.nextInt();
        for (int n : numbers) {
            if (input3 == 2) {
                System.out.println("相性良い！");
                break;
            } else if(input3 == 1) {
                System.out.println("ん〜、、、");
                break;

            }
        }

        System.out.println("");
//質問５
        System.out.println("私はフィルムカメラも持っている");
        System.out.println("１あてはまらない　2あてはまる");

        int input4 = scanner.nextInt();
        for (int n : numbers) {
            if (input4 == 2) {
                System.out.println("相性良い！");
                break;
            } else if(input4 == 1) {
                System.out.println("ん〜、、、");
                break;

            }
        }

//        sum += input_num;
//        answer_count++;
//
//
//
//        System.out.println("");
//        System.out.println("診断結果");








    }
}
