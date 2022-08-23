package kimmunsik;//6609
/*
왜 습한 환경에 모기가 그렇게 많은지 궁금해한 적이 있는가?
그건 성체 암컷 모기가 가능한 많은 알을 낳을 수 있기 때문이다.
그중 대부분이 (다행스럽게도) 살아남지 못하지만, 모기 한 쌍이 단 몇주만에 수천마리의 모기가 될 수 있다고 한다. 이 숫자에 대해 좀 더 자세히 알아보자.
모기의 일생은 4가지 단계로 이루어져 있다.
알, 유충, 번데기, 성충이다. 문제를 간단하게 하기 위해서 우리는 실제로는 아닐 수 있는 몇 가지 가정을 세울 것이다.
알 기간은 1일도 안 된다고 하고, 나머지 단계는 일주일이 걸린다고 하자.
각 모기는 유충으로 일주일을 살고, 번데기가 되어 일주일간 동면하고, 3째 주 성충 모기가 된다.
이 3주 생애의 끝에 각 모기는 알을 낳고 죽는다.
좀 더 간단히 만들기 위해 한 단계에서 다음 단계로 가는 것은 항상 일요일이라고 하자.
매 일요일 다음과 같은 일들이 일어난다.
성충 모기가 E개의 알을 낳고 죽는다. 하루만에 각 알당 1마리의 유충이 부화한다.
저번 주 부화한 일부 유충은 죽거나 잡아먹힌다. R번째 유충들만 일요일에 번데기가 된다.
S번째의 번데기들만 성충이 되고, 나머지는 말라죽는다.
예를 들어, 5개의 번데기가 있고 3번째가 살아남는다면, 1마리의 모기가 남게 된다.
6개의 번데기 중에서는 두마리의 성충 모기가 나올 것이다.
첫째주 M마리의 모기, P개의 번데기, L마리의 유충이 있다.
N번의 일요일을 거치면 얼마나 많은 모기가 될지 계산하라. 물론 '살아있는' '성충' 모기만 세어야 한다.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있으며 각 테스트 케이스당 한 줄로 주어진다.
각 줄은 7개의 변수인 M, P, L, E, R, S, N이 포함되어 있으며 공백문자로 나누어져 있다.
M,P,L은 각각 첫째 주에 있는 모기, 번데기, 유충의 숫자이다.
E는 한 모기가 낳는 알의 수이며, R과 S는 살아남는 유충과 번데기의 비율, N은 우리가 모기 수를 구하려는 시점(N주 후)이다.
입력값의 제한은 다음과 같다.
0 ≤ M, P,L ≤ 100 000, 0 ≤ E ≤ 100, 1 ≤ R, S ≤ 10, and 1 ≤ N ≤ 1000
출력
각 테스트 케이스마다, 한 줄로 C를 출력한다. C는 N번째 일요일 후의 모기의 숫자이다.
첫 N주 안의 모기 수는 1 000 000을 넘지 않을 것이다.

예제 입력 1
10 20 40 4 2 2 10
144 55 8 0 1 9 4
10 10 10 2 3 2 6
10 20 40 86 9 9 999
예제 출력 1
10
0
1
10
출처
ICPC > Regionals > Europe > Central European Regional Contest > CTU Open Contest > CTU Open Contest, 2012 F번
 */

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MosquitoMultiplication_me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";


        while((s=sc.nextLine()) != null) {
//            StringTokenizer st = new StringTokenizer((s));

            int M = sc.nextInt(); //모기 수         144         M >= 0
            int P = sc.nextInt(); //번데기 수         55       P <= 100 000
            int L = sc.nextInt(); //유충 수            8      L <= 100 000
            int E = sc.nextInt(); //한마리 모기가 낳는 알의 수  0 0 =< E <= 100
            int R = sc.nextInt(); //살아남은 유충 수    1       R >= 1
            int S = sc.nextInt(); //살아남은 번데기 수  9       S <= 10
            int N = sc.nextInt(); //구하려는 시점       4        1 =< N <= 1000


            for(int i=0; i<N; i++) {
                int ML = M;
                M = P / S; //P 마리 수의 번데기는 S 비율로 모기
                P = L / R; //L 마리 수의 유충은 R 비율로 모기
                L = ML * E;
            }
            System.out.println(M);
        }
    }
}
