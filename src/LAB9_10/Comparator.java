package LAB9_10;

public interface Comparator {
    void qsort(Student arr[],int start,int end);
    int partition(Student arr[], int start, int end);
}