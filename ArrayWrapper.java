public class ArrayWrapper {

    private int[] array;

    public ArrayWrapper(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    // Returns the number at 'index'.
    public int access(int index) {
        return array[index];
    }

    // Returns the index of 'number' if it's in the array, otherwise -1;
    public int search(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // Inserts 'number' at 'index' into the array shifting elements if necessary.
    //
    // e.g. the result of inserting 42 at index 3 into [0, 1, 2, 3, 4] is [0, 1, 2, 42, 3, 4]
    public void insert(int index, int number) {
        int[] newArray = new int[this.array.length + 1];
        int oldIndex = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[index] = number;
            } else {
                newArray[i] = array[oldIndex];
                oldIndex++;
            }
        }
        this.array = newArray;
    }

    // Deletes the element at 'index' from the array.
    //
    //  e.g. the result of deleting index 2 from [0, 1, 2, 3, 4] is [0, 1, 3, 4]
    public void delete(int index) {
        int[] newArray = new int[this.array.length - 1];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                newArray[newIndex] = array[i];
                newIndex++;
                
            }
        }
        this.array = newArray;


    }
}
