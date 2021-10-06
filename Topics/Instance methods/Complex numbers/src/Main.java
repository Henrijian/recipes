class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex num) {
        if (num == null) {
            return;
        }
        real += num.real;
        image += num.image;
    }

    public void subtract(Complex num) {
        if (num == null) {
            return;
        }
        real -= num.real;
        image -= num.image;
    }
}