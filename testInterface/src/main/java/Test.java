interface Movable {
    void move();
}
class Person implements Movable {
    public void move() {   System.out.println("Person move");   }
}
class Vehicle implements Movable {
    public void move() {   System.out.println("Vehicle move");   }
}
class Test {
        void walk(Movable movable) {
        movable.move();
}
}