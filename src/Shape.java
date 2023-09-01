public abstract class Shape {
    default void printName(Shape shape){
        System.out.println(shape.getName());
   }
}
