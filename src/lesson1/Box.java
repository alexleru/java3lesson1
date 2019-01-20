package lesson1;

public class Box<T extends Fruit> implements Weight{
    private int count = 0;
    private final int MAX_COUNT = 50;
    private T fruit;
    Box(T fruit){
        this.fruit = fruit;
        System.out.println("Есть коробка для типа " + this.fruit.NAME);
    }
    void putInBox(int count){
        if (count + this.count <= MAX_COUNT ) {
            this.count += count;
            System.out.println("В коробку пложили " + count + " шт. фрукта " + this.fruit.NAME);
        } else {
            System.out.println("В коробкe окажется " + (count + this.count)
                    + "Максимум можно положить в коробку" + MAX_COUNT + "шт.");
        }
    }

    @Override
    public float getWeightBox() {
        float weightOfBox = this.fruit.WEIGHT * count;
        System.out.println("Вес коробки (" + this.fruit.NAME + ") " + weightOfBox);
          return weightOfBox;
    }

    public boolean compare(Box<?> anotherBox){
        return this.getWeightBox() == anotherBox.getWeightBox();
    }


}
