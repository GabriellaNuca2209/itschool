package session10.practice.inheritance;

public class HierarchicalInheritance {
}

class Lioness {
    void roar() {
        System.out.println("The lioness roars loudly");
    }
}

class Cub1 extends Lioness {
    @Override
    void roar() {
        System.out.println("Small roar");
    }
}

class Cub2 extends Lioness {
    @Override
    void roar() {
        System.out.println("Smaller roar");
    }
}
