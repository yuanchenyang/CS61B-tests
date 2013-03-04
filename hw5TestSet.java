import list.*;
import tests.Test;

class hw5TestSet {
    public static Set setFromArray(int[] l) {
        Set s = new Set();
        for (int i = 0; i < l.length; i++) {
            s.insert(l[i]);
        }
        return s;
    }
    
    public static void main(String[] args) {
        Test t;
        Set s, s1, s2;
        int[] l = {6, 2, 2, 4, 5, 8, 5, 9, 1, 2, 4, 6, 8, 10};
        int[] l1 = {1, 2, 4, 5, 7, 9, 11};
        int[] l2 = {0, 2, 3, 5, 6, 7, 10, 11, 20};
                        
        // Test inserting elements
        t = new Test("Test insertion");
        s = setFromArray(l);
        t.expect("{  1  2  4  5  6  8  9  10  }");
        t.run(s.toString());

        // Test intersection
        t = new Test("Test intersection");
        s1 = setFromArray(l1);
        s2 = setFromArray(l2);
        s1.intersect(s2);
        t.expect("{  2  5  7  11  }");
        t.run(s1.toString());
        s1 = setFromArray(l1);
        s2 = setFromArray(l2);
        s2.intersect(s1);
        t.expect("{  2  5  7  11  }");
        t.run(s2.toString());

        // Test union
        s1 = setFromArray(l1);
        s2 = setFromArray(l2);
        s1.union(s2);
        t.expect("{  0  1  2  3  4  5  6  7  9  10  11  20  }");
        t.run(s1.toString());
        s1 = setFromArray(l1);
        s2 = setFromArray(l2);
        s2.union(s1);
        t.expect("{  0  1  2  3  4  5  6  7  9  10  11  20  }");
        t.run(s2.toString());
    }
}
