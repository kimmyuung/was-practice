package org.example.counter;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
        // 싱글톤으로 객체를 관리하기 때문에 원치 않는 결과가 출력될 수 있음
        // 상태를 유지하게 설계하면 스레드가 안전하지 않음 -> 동기화로 처리
    }
}
