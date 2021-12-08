package work13;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    static class GenericClass<T> {
        private T[] array;

        public GenericClass(T[] array) {
            this.array = array;
        }

        public GenericClass() {
        }

        public T[] getArray() {
            return array;
        }

        public void setArray(T[] array) {
            this.array = array;
        }
    }

    public static <T> T getElement(T[] arr, int index) {
        return arr[index];
    }


    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    static class CatalogReader {

        public static void printFileNamesByUrl(String url) {
            File directory = new File(url);
            System.out.println(Arrays.stream(Objects.requireNonNull(directory.list())).limit(5).collect(Collectors.toList()));
        }
    }

    public static void main(String[] args) {
        CatalogReader.printFileNamesByUrl("..");
    }

}
