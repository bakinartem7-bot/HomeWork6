public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int firstFriday = 5;
        int week = 7;
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
                firstFriday = firstFriday + week;
            }
        }
        System.out.println("Задание №2");
        int distance = 0;
        int segment = 500;
        do { System.out.println("Держитесь! Осталось " + distance + " метров");
            distance = distance + segment;
        } while (distance <=42195);
        System.out.println("Задча №2. Вариант 2");
        int distance1 = 0;
        int segment1 = 500;
        for (int i = distance1; i <= 42195; i = i + segment1) {
            System.out.println("Держитесь! Осталось " + i + " метров");
        }

        System.out.println("Задание №3");
        int amount = 1000;
        int day = 0;
        while (amount >0) {
            day = day + 1;
            if (day % 5 ==0)
                continue;
            amount = amount - 100;
        }
        System.out.println("Вы можете оставить свою машину на " +  day + " дней");
        System.out.println(" задача №3 вариант 2");
        int amount1 = 1000;
        int day1 = 0;
        for ( int i = amount1; i > 0; ) {
            day1 = day1 + 1;
            if (day1 % 5 == 0)
                continue;
            i = i - 100;
        }
        System.out.println("Вы можете оставить свою машину на " + day1 + " дней");

        System.out.println("Задача №4");
        int mount = 0;
        int total = 0;
        do {
            mount++;
            total = total + 15000;
            if (total >= 12_000_000) {
                break;}
            if (mount % 6 == 0) {
                total = (int) (total * 1.07);
            }
        } while ( total > 0);
        System.out.println("за " + mount + " месяцев. вы накопите " + total + " рублей");


        System.out.println("Задание №5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            minute++;
            if (minute % 10 == 0){
                overheats++;
                if (overheats % 3 ==0) {
                    System.out.println("зарядка прекращена. Текущий заряд " + charge + "%");
                    break;
                }
                minute = minute + 2;
            }
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");


    }
}