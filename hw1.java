import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        guessNumber();
//        absolutenValue();
//        evenOrOddSum();
//        printInOrder();
//        quadraticEquation();
//          workerPaymant(1,4,2);


        ////// EX 5 //////////////////
//        Scanner se=new Scanner(System.in);
//        System.out.println("which worker are you 0 for beginner 1 for senior");
//        int type= se.nextInt(); // type input
//        System.out.println("how many hours you been working");
//        int hours=se.nextInt();//hours input
//        System.out.println("how many day you reach you goal");
//        int days=se.nextInt();//days input
//        workerPaymant(type,hours,days);
        ////// EX 5 //////////////////

        ///////// EX 6 /////////////
//        Scanner se=new Scanner(System.in);
//        System.out.println("enter first number");
//        int firstNum= se.nextInt(); // first number input
//        System.out.println("please enter the gpe");
//        int d=se.nextInt();//gpe input
//        System.out.println("amunt of number in series");
//        int n=se.nextInt();//input nums
//        prog(firstNum,d,n);
        ///////// EX 6 /////////////


        //////// EX8 //////////
        //printTringle(choseNumber());
        ///////ex8//////////

        ////// EX9////////
//        int x=ifpostive();
//        for (int i = 2; i<x ; i++) {
//            if (isprime(x)){
//                System.out.println(x);
//            }
//        }
        ///////ex9//////////
        //////ex10/////////
//        guessNumber();
        /////ex10/////////
    }

    public static void guessNumber() {//ex10
        Scanner se = new Scanner(System.in);
        int counter = 1;
        int cout = 1;
        double number = (Math.random() * 1000);//the compter chose a random number
        int casted = (int) number;//convert the compter number into int
        System.out.println("enter the first user guess");
        int user1 = se.nextInt();//collect first
        System.out.println("enter the second user guess");
        int user2 = se.nextInt();//collect second value
        while (user1 != casted && user2 != casted) {//if first user guess  and second user guess are not true then enter the loop if one is true then  exit
            counter = counter + 1;//add to the amount of guess for the first user
            cout = cout + 1;//add to the amount of guess for the second user
            if (casted < user1) {//if the first user guess is smaller then the compter number
                System.out.println("the first user number is smaller then the compter number try another number");
                counter =counter+1;//add to the amount of guess for the first user
                user1 = se.nextInt();//ask the first user for another number
                if (user1==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
            if (casted > user1) {//if the first user guess is higher then the compter number
                System.out.println("the first user number is higher then the compter number try another number");
                counter = counter+1;//add to the amount of guess for the first user
                user1 = se.nextInt();//ask the first user for another number
                if (user1==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
            if (casted < user2) {//if the second user guess is smaller then the compter number
                System.out.println("the second user number is smaller then the compter number try another number");
                cout = cout+1;//add to the amount of guess for the second user
                user2 = se.nextInt();//ask the second user for another number
                if (user2==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
            if (casted > user2) {//if the second user guess is higher then the compter number
                System.out.println("the second user number is higher  then the compter number try another number");
                cout = cout + 1;//add to the amount of guess for the second user
                user2 = se.nextInt();//ask the second user for another number
                if (user2==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
        }
        if (user1 == casted){//print the total of tries of the first user until he guess the right answer
            System.out.println("the first user win after" + counter + "times");
        }
        if (user2 == casted){//print the total of tries of the second user until he guess the right answer
            System.out.println("the second user win after" + cout + "times");
        }
    }


    public static int ifpostive(){//ex9
        Scanner se=new Scanner(System.in);
        int postive=se.nextInt();//collect value
        while (postive<0){
            System.out.println("Please enter postive number");
            postive=se.nextInt();
        }
        return postive;
    }
    public static boolean isprime(int input){
        for (int i = 2; i <=input/2 ; i++) {
            if (isDivied(input,i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isDivied(int input,int input1){
        if (input%input1==0){
            return true;
        }
        return false;
    }
    public static void printTringle(int num){//ex8
        for (int i = 0; i <num ; i++) {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int choseNumber(){
        Scanner se=new Scanner(System.in);
        int num=se.nextInt();
        while (num<5 || num>20){
           num=se.nextInt();
        }
        return num;
    }
    public static void createAppointment(){//ex7
        System.out.println("in which day you like to come");
        Scanner se=new Scanner(System.in);
        int day=se.nextInt();
        if (day>7 ||day<1){
            System.out.println("invalid day");
            return;
        }
        if (day>5){
            System.out.println("we are close");
            return;
        }
        System.out.println("which hour is the earliest you can come");
        int early=se.nextInt();
        System.out.println("which hour is the latest you can come");
        int late=se.nextInt();
        if (early>late || early<0 || late>23 ||early>23 || late<0){
            System.out.println("invalid hours");
            return;
        }
        if (day!=3 && early>17 || late<9){
            System.out.println("we work from 9:00 until 17:00");
            return;
        }
        if (day==3 && early>12 || late<8){
            System.out.println("we work from 8:00 until 12:00");
            return;
        }
        System.out.println("appointmet approved");
    }
    public static void prog(int a1,int d,int n){//ex6
        int counter=0;
        while (n>counter){
            counter=counter+1;
            System.out.print(a1+",");
            a1=a1+d;
        }
    }
    public static void workerPaymant (int type,int hour,int days){//ex5
        int sum=0;
        if (type==0){//case1
                sum=hour*50;
                    sum=sum+days*250;//caluting wage
                System.out.println(sum);
        }
        if (type==1){//case2
                sum=hour*200;//caluting wage
            sum=sum+days*250;//caluting bonuse
            }
            System.out.println(sum);
        }
    public static void quadraticEquation(){//ex4
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a value");
        int a= sc.nextInt();//collect the first value
        System.out.println("please enter b value");
        int b= sc.nextInt();//collect second
        System.out.println("please enter c value");
        int c= sc.nextInt();//collect third
        if (b*b-4*a*c<0){ // no sol
            System.out.println("no solution");
        }
        if (b*b-4*a*c==0){ //one sol
            System.out.println("there is a single solution");
            System.out.println(-b/2*a);
        }
        if (b*b-4*a*c>0){ //two sol
            System.out.println("there are two solution");
            double sqrt=Math.sqrt(b*b-4*a*c);
            System.out.println("first solution is..");
            System.out.println(-b+sqrt/2*a);
            System.out.println("second solution is..");
            System.out.println(-b-sqrt/2*a);
        }
    }
    public static void printInOrder(){ //ex3
        Scanner sc=new Scanner(System.in);
        int firstNum= sc.nextInt();//collect the first value
        int secondNum= sc.nextInt();//collect second
        int thirdNum= sc.nextInt();//collect third
        if (firstNum>secondNum && secondNum>thirdNum){//op1
            System.out.println(firstNum+", "+secondNum+", "+thirdNum);
        }
        if (secondNum>firstNum && firstNum>thirdNum){//op2
            System.out.println(secondNum+", "+firstNum+", "+thirdNum);
        }
        if (thirdNum>firstNum && firstNum>secondNum){//op3
            System.out.println(thirdNum+", "+firstNum+", "+secondNum);
        }
        if (firstNum>thirdNum && thirdNum>secondNum){//op4
            System.out.println(firstNum+", "+thirdNum+", "+secondNum);
        }
        if (secondNum>thirdNum && thirdNum>firstNum){//op5
            System.out.println(secondNum+", "+thirdNum+", "+firstNum);
        }
        if (thirdNum>secondNum && secondNum>firstNum){//op6
            System.out.println(thirdNum+", "+secondNum+", "+firstNum);
        }




    }
    public static void evenOrOddSum(){ //ex2
        Scanner sc=new Scanner(System.in);
        int firstNum= sc.nextInt();//collect first number
        int secondNum=sc.nextInt();//collect second number
        int sum=firstNum+secondNum;//calculate sum
        if (sum%2==0){//if even
            System.out.println("even");
        }
        else {//if odd
            System.out.println("odd");
        }
    }

    public static void absolutenValue (){ //ex1
        Scanner sc=new Scanner(System.in);
//        Math.abs()
        int input= sc.nextInt(); //collect number
        if (input>=0){//case 1 : greater than zero
            System.out.println(input);
        }
        else { // case 2: smaller then zero
            input =input*-1;
            System.out.println(input);
        }
    }
}
