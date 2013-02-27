import list.*;
import tests.Test;

class hw4TestDList {
    public static void main(String[] args) {
        DList d;
        Test t;
        DListNode n;

        // Each test depends on the correctness of the methods tested before
        
        // insertFront
        t = new Test("insertFront");
        d = new DList();
        d.insertFront(2);
        t.expect("1");
        t.run("" + d.length());
        d.insertFront(1);
        t.expect("[  1  2  ]");
        t.run(d.toString());
        t.expect("2");
        t.run("" + d.length());

        // insertBack
        d = new DList();
        t = new Test("insertBack");
        d.insertBack(3);
        t.expect("1");
        t.run("" + d.length());
        d.insertBack(2);
        t.expect("[  3  2  ]");
        t.run(d.toString());
        t.expect("2");
        t.run("" + d.length());

        // front
        d = new DList();
        t = new Test("front");
        t.expect(null);
        t.run(d.front());
        d.insertFront(1);
        d.insertFront(2);
        t.expect("2");
        t.run("" + d.front().item);

        // back
        d = new DList();
        t = new Test("back");
        t.expect(null);
        t.run(d.back());
        d.insertFront(1);
        d.insertFront(2);
        t.expect("1");
        t.run("" + d.back().item);

        // next
        d = new DList();
        t = new Test("next");
        t.expect(null);
        t.run(d.next(null));
        d.insertFront(1);
        t.expect(null);
        t.run(d.next(d.front()));
        d.insertFront(2);
        t.expect(1);
        t.run(d.next(d.front()).item);

        // prev
        d = new DList();
        t = new Test("prev");
        t.expect(null);
        t.run(d.prev(null));
        d.insertFront(1);
        t.expect(null);
        t.run(d.prev(d.front()));
        d.insertFront(3);
        t.expect(3);
        t.run(d.prev(d.back()).item);

        // insertAfter
        d = new DList();
        t = new Test("insertAfter");
        d.insertAfter(1, null);
        d.insertFront(1);
        n = d.front();
        d.insertAfter(3, n);
        d.insertAfter(2, n);
        t.expect("[  1  2  3  ]");
        t.run(d.toString());
        t.expect(3);
        t.run(d.length());

        // insertBefore
        d = new DList();
        t = new Test("insertBefore");
        d.insertBefore(1, null);
        d.insertFront(3);
        n = d.front();
        d.insertBefore(1, n);
        d.insertBefore(2, n);
        t.expect("[  1  2  3  ]");
        t.run(d.toString());
        t.expect(3);
        t.run(d.length());

        // remove
        d = new DList();
        t = new Test("remove");
        d.remove(null);
        d.insertFront(3);
        n = d.front();
        d.remove(n);
        t.expect("[  ]");
        t.run(d.toString());
        d.insertFront(2);
        n = d.front();
        d.insertAfter(3, n);
        d.insertBefore(1, n);
        d.remove(n);
        t.expect("[  1  3  ]");
        t.run(d.toString());
        t.expect(2);
        t.run(d.length());        
    }
}
