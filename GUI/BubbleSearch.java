package GUI;

public class BubbleSearch {
    public static void main (String[] args){
        public static int bubbleSearch(Object[] array, Comparator comparator){
            int pass = 1;
            boolean sorted;
            Object temp;

            do {
                sorted = true;
                for(int m = 0, m < array.length - pass, m++) {
                    if(comparator.compare(array[m - 1], array[m]) > 0){
                        temp = array[m - 1];
                        array[m - 1] = array[m];
                        array[m] = temp;
                        sorted = false;
                    }
                }
                pass ++;
            }   while (! sorted)
        }
    }
}