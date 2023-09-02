public class BinarySearch1 implements Comparator {
    public static void main(String[] args) {

        public static int binarySearch(Object[] array, Object key, Comparator comparator){
            // array[100];
            return binarySearch(array, key, 0, array.length - 1, comparator);
        }
    
        private static int binarySearch(Object[] array, Object key, int low, int high, Comparator comparator){
    
            if (low > high){
                return -1;
            } else {
                int middle = (low + high) / 2;
                int result = comparator.compare(key, array[middle]);
    
                if (result == 0){
                    return middle;
                } else if (result < 0){
                    return binarySearch(array, key, low, middle - 1, comparator);
                } else {
                    return binarySearch(array, key, middle + 1, high, comparator);
                }
            }
        }
    }
}


// public interface Comparator {
//     public abstract int comparator(Object object1, Object object2);
//     public abstract boolean equals(Object object);
// }