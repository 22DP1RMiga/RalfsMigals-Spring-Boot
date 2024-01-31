package rvt;

public class Search {
    public static int binarySearch(int[] array, int valueToSearch) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        int middle = (startIndex + endIndex);
    }
}

// assuming the variable searched exits
// assuming the variable list exits
begin = 0 // the 0th index of the list (i.e, the first index of the list)
end = size(list) - 1 // the last index in the list

repeat until begin is larger than end:
    middle = (end + begin) / 2

    if the value at list[middle] is searched
        return the value of the variable middle

    if the value at list[middle] is smaller than searched
        begin = middle + 1

    if the value at list[middle] is larger than searched
        end = middle - 1

return value -1