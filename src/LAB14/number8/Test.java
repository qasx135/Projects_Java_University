package LAB14.number8;

import java.util.Arrays;


public class Test implements Filter{
    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }
    public static void main(String[] args) {
        String[] array =
                new String[]{"1rewf ", "feefewf", "a", null, "1"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });
        int len = newArray.length;
        for (String s : newArray) {
            System.out.println(s);
        }
    }
    @Override
    public boolean apply(Object o) {
        return o != null;
    }
}
