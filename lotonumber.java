package com.example.loto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lotonumber {
    static int number1;
    static int number2;
    static String LottoFinal;

    public static String num() {
        if ((number2 == 0) && (number1 == 0)) {
            LottoFinal = "エラーが発生しました";
        } else {
            ArrayList<Integer> lottoNum = new ArrayList<Integer>();
            for (int i = 1; i <= number1; i++) {
                lottoNum.add(i);
            }
            Collections.shuffle(lottoNum);
            int[] Lotto = new int[number2];
            for (int i = 0; i < number2; i++) {
                Lotto[i] = lottoNum.get(i);
            }
            LottoFinal = Arrays.toString(Lotto);
        }
        return LottoFinal;
    }
}
