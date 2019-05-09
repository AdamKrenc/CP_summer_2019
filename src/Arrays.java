public class Arrays {

    public static void main(String[] args) {
        int[] intArr = new int[5];
        //Integer[] intArr = new Integer[5];
        intArr[0] = 567;
        intArr[1] = 968;
        intArr[2] = 675;
        intArr[3] = 232;
        intArr[4] = 321;

        String[] strArr = new String[] {
                "ABC",
                "DEF",
                "EFG",
                "HIJ"
        };

        for (int i=0;i<intArr.length;i++) {
            //if (intArr[i]!=null)
            System.out.println(i + "th element: " + intArr[i]*10);
        }

        for (int myEl : intArr) {
            System.out.println(myEl);
        }

        // For Each loop
        for (String el : strArr) {
            System.out.println("My strArr element: " + el);
        }




    }
}
