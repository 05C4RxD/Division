class Division{
    private int a,b;

    public int mosrtarResultado(){
        return this.a / this.b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Division [a=" + a + ", b=" + b + "]";
    }
}