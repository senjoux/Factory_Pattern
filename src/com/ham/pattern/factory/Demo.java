package com.ham.pattern.factory;

	public class Demo {
		public static void main(String args[]) {
	
			FruitFactory fruitFactory = new FruitFactory();
	
			Fruit f1 = fruitFactory.getFruit("pomme");
			f1.manger();
	
			Fruit f2 = fruitFactory.getFruit("orange");
			f2.manger();
	
			Fruit f3 = fruitFactory.getFruit("banane");
			f3.manger();
	
		}
	}


