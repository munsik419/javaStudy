//1247
/*
N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.

입력
총 3개의 테스트 셋이 주어진다. 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고, 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다.
주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.
출력
총 3개의 줄에 걸쳐 각 테스트 셋에 대해 N개의 정수들의 합 S의 부호를 출력한다. S=0이면 "0"을, S>0이면 "+"를, S<0이면 "-"를 출력하면 된다.

예제 입력 1
3
0
0
0
10
1
2
4
8
16
32
64
128
256
-512
6
9223372036854775807
9223372036854775806
9223372036854775805
-9223372036854775807
-9223372036854775806
-9223372036854775804
예제 출력 1
0
-
+
출처
문제를 만든 사람: author5
 */
package kimmunsik;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Sign_me {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //3개의 테스트 셋 제공, 첫째줄에 N 값, 둘째줄부터 N개의 정수, 정수의 합 S
        for (int i = 0; i < 3; i++) {
            int N = sc.nextInt();
            BigInteger sum = BigInteger.valueOf(0);

            for (int j = 0; j < N; j++) {
                BigInteger N2 = sc.nextBigInteger();

                sum = sum.add(N2);

            }

            //비교 sum>0 "+", sum<0 "-", sum == 0 "0"
            //기준값.compareTo(비교값)
            //작으면 -1
            //크  면  1
            //같으면  0
            if (sum.compareTo(BigInteger.ZERO) < 0) {
//                System.out.println(sum);
                System.out.println("-");
            } else if (sum.compareTo(BigInteger.ZERO) > 0) {
//                System.out.println(sum);
                System.out.println("+");
            } else {
                System.out.println("0");
            }
        }
    }
}

