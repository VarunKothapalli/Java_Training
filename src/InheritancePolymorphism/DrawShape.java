package InheritancePolymorphism;

public class DrawShape {

    public static void  main (String [] args) {

        Shape myCircle = new Circle();
        Shape mySquare = new Square();

        myCircle.draw();
        mySquare.draw();
    }
}

class Shape {

    public void draw (){
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape {

    public void draw () {

        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {

    public void draw() {
        System.out.println("Drawing a Square");
    }
}