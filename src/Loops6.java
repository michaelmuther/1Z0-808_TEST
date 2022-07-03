public class Loops6 {
    public static void main(String args[]) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

/*
outer / middle / inner
i   j   k   counter
0   0   0   1
0   0   1   1
1   0   0   2
1   0   1   2
2   0   0   3
2   0   1   3

 */

/*
To understand how this loop works let us put some extra print statements in the innermost loop:

System.out.println("i="+i+" j="+j+" k="+k);
if(k-j>0){
     System.out.println("breaking middle "+j);
     break middle;
}
counter++;

This is what it prints:

i=0 j=0 k=0
i=0 j=0 k=1
breaking middle 0
i=1 j=0 k=0
i=1 j=0 k=1
breaking middle 0
i=2 j=0 k=0
i=2 j=0 k=1
breaking middle 0
3

The key is that the middle loop is broken as soon as k-j becomes > 0. This happens on every second iteration of inner
loop when k is 1 and j is 0. Now, when middle is broken inner cannot continue. So the next iteration of outer starts.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/VHARNn8AgAw
 */