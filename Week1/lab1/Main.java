class Main {
    public static void main(String[] args) {

        Rectangle s1 = new Rectangle(2,4);
        Circle c1 = new Circle(4);
        Ellipse e1 = new Ellipse(8,18);

        int R = s1.getArea();
        String wordR = s1.toString();
        System.out.println(R);
        System.out.println(wordR);

        int C = c1.getArea();
        String wordC = c1.toString();
        System.out.println(C);
        System.out.println(wordC);

        int E = e1.getArea();
        String wordE = e1.toString();
        System.out.println(E);
        System.out.println(wordE);


    }
}