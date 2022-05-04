package day15;

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		// Box<Grape> grapeBox = new Box<Apple>(); //  ����. Ÿ�� ����ġ
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK.  void add(Fruit item)
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		// appleBox.add(new Toy()); // ����. Box<Apple>���� Apple �� ���� �� ����.
		
		toyBox.add(new Toy());
		// toyBox.add(new Apple() // ����, Box<Toy>���� Apple�� ���� �� ����.
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}
}