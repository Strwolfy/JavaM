package Дженерикс.Start;

import java.awt.*;
// простой Mutable object

class Tuple {
    private final Object left;
    private final Object right;

    Tuple(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public Object getLeft() { return left; }
    public Object getRight() { return right; }

}
