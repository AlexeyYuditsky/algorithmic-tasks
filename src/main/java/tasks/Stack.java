package tasks;

class StackOfBoundException extends RuntimeException {
}

class StackEmptyException extends RuntimeException {
}

public class Stack {
    private final Object[] buf;
    private int position;

    public Stack(int size) {
        if (size <= 0)
            throw new StackEmptyException();

        buf = new Object[size];
    }

    public void push(Object o) {
        if (position > buf.length - 1)
            throw new StackOfBoundException();

        buf[position++] = o;
    }

    public Object pop() {
        if (position <= 0)
            return null;

        Object value = buf[--position];
        buf[position] = null;
        return value;
    }

    public boolean isEmpty() {
        return position == 0;
    }

    public boolean equals(Stack o) {
        if (this.buf.length != o.buf.length) return false;
        boolean res = false;
        for (int i = 0; i < this.buf.length; i++) {
            res = this.buf[i] == o.buf[i];
        }
        return res;
    }
}
/*
Задача на Java и стек:
+ самостоятельно нашел проблему с equals, сам без намеков предложил реализовать hashCode
+ не предлагал странных исправлений в коде
+- знает исключения в Java, хотя без подсказок не увидел проблемы в выбрасывании OutOfMemoryError
+- с подсказками, но смог занулить элемент в массиве, возвращаемый из метода
*/
