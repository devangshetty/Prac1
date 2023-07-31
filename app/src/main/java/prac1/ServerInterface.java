package prac1;

interface SimpleImplementation {
    /** Adds two numbers together */
    int sum(int a, int b);

    /** Pushes a value onto the server's array */
    void push(int val);

    /** Returns the server's array */
    int[] get();
}
