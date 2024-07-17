public class App {
    public static void main(String[] args) throws Exception {
     
                int  arr[]  = {101,102,103,104,105};  // syntax -1

                System.out.println(arr);
                System.out.println("Length/Size "+arr.length);

                System.out.println("value at index 0 "+arr[0]);


                    for(int i=0; i < arr.length;i++){

                            System.out.println(arr[i]);
                    }

                        System.out.println("for each loop");


                        for(int x: arr){

                                System.out.println(x);

                        }


                    int  a1[] = new int[4];  // syntax-2

                            a1[0] = 10;
                            a1[1] = 20;

                        System.out.println("a1 array elements");

                            for(int i=0; i < a1.length;i++){

                                System.out.println(a1[i]);
                        }


    }
}
