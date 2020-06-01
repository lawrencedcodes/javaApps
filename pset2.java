public class pset2 {
    public static void main {
        int dogs = 1;
        int cats = 0;

        if (docs>0 && cats == 0) {
            if (docs>1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
        } else if (cats > 0 && dogs > 00) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");
            } else if (dogs == cats) {
                System.out.println("I guess you like both");
            } else {
                System.out.println("I guess you like cats");
            }
        } else {
            System.out.println("Woah, you don't like pets?")
        }
        if (canSeePlayer) { 
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Just wander for now");
        }


;
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        if (isSnowing || isRaining || temperature<50) {
            System.out.println("Stay home");
        } else {
            System.out.println("Go play!");
        }

        int time = 18;
        String timeOfDay;
        if (time>= 5 && <12) {
            timeofDay = "morning"; 
        } else if (time>=12 && < 20) {
            timeofDay = "daytime";
        } else {
            timeofDay = "night";
        }

        int weekday = 5;
        boolean holiday = true;
        if (weekday>=1 && weekday<=5 && !holiday) {
            System.out.println("Get up!");
        } else {
            System.out.println("Sleep in!");
        }

        int dayOfWeek = 1;
        String schedule;
        switch(dayOfWeek):
            case 1: schedule = "Yoga Day";
                break;
            case 2: schedule = "Weight Training";
                break;
            case 3: schedule = "Cardio";
                break;
            case 4: schedule = "Weight training";
                break;
            case 5: case 6: case 7: default:
                schedule = "Free day";
                break;

        public void activityByWeather(int temperature) {
            String userMessage;
            if (temperature>60) {
                userMessage = "Great day to play outside";
            } else if (temperature <45 && temperature <=60) {
                userMessage = "kinda cool, buckle up";
            } else {
                userMessage = "Cold day - enjoy inside fun!"
            }
        }   System.out.println(userMessage);
        activityByWeather(65);

        //photolikes
        public void likePhoto(int currentLikes, String comment, boolean like) {
            System.out.println("The feedback is: "+comment);
            if(like) {
                currentLikes+=1;
            }
            System.out.println("The total likes is: "+currentLikes);
        }
        likePhoto(5,"Youre the best!",true);

        public double calculateTip(int cost) {
            double tip = cost*.15;
            return tip;
        }

        public void alarm() {
            boolean on = checkalarm();
            while(on) {
                beep();
                on = checkalarm();
            }
        }
        public boolean checkalarm();

        public int keepRolling() {
            int dice1 = rolldice();
            int dice2 = rolldice();
            int dice3 = rolldice();
            int dice4 = rolldice();
            int dice5 = rolldice();
            int count = 1;
            while(!(dice1 == dice2 && dice1 = dice3 )) {
                dice1 = rolldice();
                dice2 = rolldice();
                dice3 = rolldice();
                dice4 = rolldice();
                dice5 = rolldice();
                count +=1;
            }
            return count;
        }

        public void numberWarnings {
            int i = 1;       //loop counter
            while (i<numberWarnings) {    //loop condition
                System.out.println("Warning");
                i++;     //loop increment
            }
        }
        public void numberWarnings {
            for (i=1;i<numberwarnings; i++) {
                System.out.println("Warning"+str(i));
            }
            for (j=1;j<=5;j++) {
                x = i-1;
                System.out.println(x);
            }
        }
        //count the blocks program
        public int countBlocks(int levels){
            int total = 0;
            for(int i=0; i<=levels;i++) {
                total = total + (i*i);
            }
            return total;
        }
        countBlocks(5);
        
        //countdown
        for (i=5;i>0;i--) {
            System.out.println("Countdown from "+str(i));
        }

        //print evens from 2 to 20
        for (i=2; i<=20; i+=2) {
            System.out.println("The next even number is "+i);
        }

        //Wifi locator
        public void searchWifi() {
            for (int i=0;i<=10; i++) {
                boolean wifi = wificheck();
                if (wifi) {
                    System.out.println("Wifi Connected");
                    break;
                } else {
                    System.out.println("No wifi in range");
                }
            }
        }

        //Martingale strategy
        public int martingale() {
            int money = 1000;
            int target = 1200;
            int bet = 10;
            while (money > bet) {
             boolean win = play();
             if (win) {
              money += bet;
              bet = 10;
             } else {
              money -= bet;
              bet *= 2;
             }
             // Add the break here:
             if(money >= target)
                break;
            }
            return money;
           }


           //basic array declaration
           int myArray [] = {52, 46, 37, 39, 38, 33, 44};
           double myDoubles [] = {99.7, 98.5, 100.0, 78.4};
           String myStations [] = {"cnn", "nbc","cbs","abc"};
           double lucky = Math.random();
           lucky = lucky * 4;
           int luckyPick = int(lucky);
           System.out.println(myStations[luckyPick]);

           //find smallest number
           public double findFastest(double [] timeList) {
               int quantity = timeList.length;
               double min = timeList[0];
               for (int i=1;i<size; i++) {
                   if speed[i]<min {
                       min = speed[i];
                   }
               }
               return min;
           }

           //find longest string in array
           public String findLongestName(String [] names) {
            int nameSize = names.length;
            String longestName = names[0];
            for (int i=1;i<nameSize; i++) {
                if (names[i].length() > longestName.length()) {
                    longestName = names[i];
                }
            }
            return longestName;
       }

       //2-D array is like an array of arrays
       int [] [] grades;
       public static double studentAverage (int [] [] grades, int [] student) {
        int subjects = grades.length;   
        int total = 0;
           for(int i=0; i<subjects; i++) {
               total += grades [i][student];
           }
           double average = total/(double)subjects;
           return average;
       }

       //Nested Loops
       for (int i=0; i<5; i++) {
           for (int j=0; j<4; j++) {
               System.out.println(i,j);
           }
       }
       for (int i=0;i<10;i++) {     
        for (int j=0; j<5; j++) {
            System.out.println(""+i+j);
          }
        }
        int [] [] grades;
        int total = 0;
        for (int i=0;i<4;i++) {
            for (int j=0; j<5; j) {
                total += grades [i][j];
            }
        }
    }       
} 