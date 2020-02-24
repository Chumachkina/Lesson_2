import java.util.Arrays;

 public class ArrayFun {

    static void arrExamplA (){                          //Задание 1
        int[] myArray = new int[10];
        myArray = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(myArray));
        for (int i=0; i < myArray.length; i++ ){
            if (myArray[i] == 1){
                myArray[i] = 0;
            } else {
                myArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }

     static void arrExamplB (){                          //Задание 2
         int[] myArray = new int[8];
         for (int i=0; i < 8; i++ ){
             myArray[i] = 3*i;
         }
         System.out.println(Arrays.toString(myArray));
     }

        static void arrExamplC (){                          //Задание 3
            int[] myArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(myArray));
            for (int i=0; i < myArray.length; i++ ){
                if (myArray[i] < 6){
                    myArray[i] = myArray[i] * 2;
                }
            }
            System.out.println(Arrays.toString(myArray));
        }

     static void arrExamplD (int n){                          //Задание 4
         int[][] myArray = new int[n] [n];
         for (int i=0; i < n; i++ ){
             myArray[i][i] = 1;
         }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j <n; j++) {
                 System.out.print(myArray[i][j] + "  ");
             }
             System.out.println();
         }
      }
     static void arrExamplE (int n){                          //Задание 5
         int[] myArray = new int[n];
         for (int i=0; i < n; i++ ){
             myArray[i] = (int)(Math.random() * 100);
         }
         int maxN = myArray[0];
         int minN= myArray[0];;
         System.out.println(Arrays.toString(myArray));
         for (int i=0; i < n; i++ ){
             if (myArray[i] > maxN){
                 maxN = myArray[i];
             }
             if (myArray[i] < minN){
                 minN = myArray[i];
             }
         }
         System.out.println("Max = "+ maxN + "  System.out.println(Arrays.toString(myArray)Min = " + minN);
     }

     static boolean checkBalance (int[] myArray, int n){        //Задание 6
         int aLen = myArray.length;
         int leftSum = myArray[0];          // сумма правой части
         int rightSum = myArray[aLen-1];    //сумма левой части
         int countStep = 0;                 //общий подсчет переборов
         int iL = 1;                        //счетчик слева
         int iR = aLen-2;                   // счетчик справа
         for (int i=0; i < aLen; i++ ){
             if (countStep == aLen-2){
                 break;
             } else if (leftSum < rightSum){
                 countStep = countStep + 1;
                 leftSum = leftSum + myArray[iL];
                 iL =iL + 1;
                }else if (leftSum >= rightSum){
                 countStep = countStep + 1;
                 rightSum = rightSum + myArray[iR];
                 iR = iR - 1;
                }
         }
         boolean k;
         if (leftSum == rightSum) {
             k = true;
         } else {
             k = false;
         }
         System.out.println("LeftSum = "+ leftSum +"  RightSum = " + rightSum);
         System.out.println(k);
         return k;
     }

     static void shiftArray (int[] myArray, int shiftArr) {    //Задание 7
        System.out.println(Arrays.toString(myArray));           // Смещенные ячейки не заполнял 0
        if (myArray.length < Math.abs(shiftArr)){
             System.out.println("Смещение превышает длину массива");
         } else if (shiftArr > 0){                              // смещение вправо
             for(int i = myArray.length - 1; i >= shiftArr; i--) {
                 myArray[i] = myArray[i - shiftArr];
             }

         } else if (shiftArr < 0){                              // смещение влево
             for(int i = 0; i < myArray.length + shiftArr; i++) {
                 myArray[i] = myArray[i - shiftArr];
             }

         } else {
             System.out.println("Смещение не требуется");
         }
         System.out.println(Arrays.toString(myArray)); // итоговый массив

         }
    public static void main(String[] args) {
        arrExamplA();                             //Задание 1
        arrExamplB();                             //Задание 2
        arrExamplC();                             //Задание 3
        arrExamplD(5);                         //Задание 4
        arrExamplE(20);                        //Задание 5
        int[] newArray = new int[] {2, 1, 2, 2, 1, 2, 2, 10, 1, 1};
        boolean arrSwitch;
        arrSwitch = checkBalance(newArray, 20); //Задание 6
        shiftArray(newArray, 0);           //Задание 7
    }
}
