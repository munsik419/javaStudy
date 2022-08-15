//package kimmunsik;/* 3092
//창영마을에서 정인이의 반란은 실패로 끝났다. (3028번)
//테러리스트로 변신한 정인이는 창영마을에 경고를 하려고 한다.
//사실 정인이는 창영마을에서 제일 착한사람이다. 따라서, 사람들을 다치지 않게하려고 한다.
//유튜브에서 폭발에 대한 동영상을 찾아보다가, 그는 나트륨을 물에 던지면 폭발한다는 사실을 알게 되었다.
//정인이는 창영마을의 중심을 지나는 "강산강" 근처에 숨어있다가, 나트륨을 위의 동영상처럼 물에 던질 것이다.
//현재 시간과 정인이가 나트륨을 던질 시간이 주어졌을 때, 정인이가 얼마나 숨어있어야 하는지 구하는 프로그램을 작성하시오.
//(정인이는 적어도 1초를 기다리며, 많아야 24시간을 기다린다.)
//
//입력
//첫째 줄에 현재 시간이 hh:mm:ss 형식으로 주어진다.
//(시, 분, 초) hh는 0보다 크거나 같고, 23보다 작거나 같으며, 분과 초는 0보다 크거나 같고, 59보다 작거나 같다.
//둘째 줄에는 나트륨을 던질 시간이 위와 같은 형식으로 주어진다.
//
//출력
//첫째 줄에 정인이가 기다려야 하는 시간을 입력과 같은 형식으로 출력한다.
//
//예제 입력 1
//20:00:00
//04:00:00
//예제 출력 1
//08:00:00
//예제 입력 2
//12:34:56
//14:36:22
//예제 출력 2
//02:01:26
//출처
//Contest > Croatian Open Competition in Informatics > COCI 2006/2007 > Contest #5 2번
//*/
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//public class Warning {
//    public static void main(String[] args) {
//        //현재 시간 출력 hh:mm:ss
//        LocalTime time = LocalTime.now();
//        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        String formatTime = time.format(timeFormat);
//        System.out.println("현재 시간 : " + formatTime);
//
//        /*3개의 숫자 입력
//        첫번째 0<a<=23, 두번째 세번째 0<b,c<=59*/
//        Scanner sc = new Scanner(System.in);
//        int hh = sc.Int();
//        int mm = sc.nextInt();
//        int ss = sc.nextInt();
//
//        //0 < hh <= 23 ; 0 < mm,ss <=59
//        if(hh>=0 && hh <=23 && mm>=0 && mm<=59 && ss>=0 && ss<=59){
//
//            //투척 시간 출력 hh:mm:ss
//            System.out.println("투척 시간 : " + hh + ":" + mm + ":" + ss);
//        }
//        return;
//        //투척시간 - 현재시간 출력 hh:mm:ss
//
//
//    }

//}
