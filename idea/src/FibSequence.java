public class FibSequence {
    public int numberAtPosition(int sequenceNumber) {
        /*
TODO:
* Input: nth number given as an integer
* Create an array n long, the first two values should be 0,1
* Build the array by adding the two previous numbers to each other
* Print the last number in the array
*/
        int[] fibNums = new int[sequenceNumber];
        int len = fibNums.length;
        fibNums[0] = 0;
        fibNums[1] = 1;
        for(int x = 2; x < len; x++){
            fibNums[x] = fibNums[x-2] + fibNums[x-1];
        }
        return fibNums[sequenceNumber-1];
    }
}