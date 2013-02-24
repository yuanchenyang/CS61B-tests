import list.DList;
import tests.Test;

class hw4TestDList {
    public static void main(String[] args) {
        DList d;
        Test t;

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
        
    }
}
