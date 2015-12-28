package com.ham.pattern.factory;

	public class FruitFactory {
	
		public Fruit getFruit(String nomFruit){
			if(nomFruit == null){
		         return null;
		      }	
			if(nomFruit.equalsIgnoreCase("POMME")){
		         return new Pomme();
		         
		      } else if(nomFruit.equalsIgnoreCase("BANANE")){
		         return new Banane();
		         
		      } else if(nomFruit.equalsIgnoreCase("ORANGE")){
		         return new Orange();
		      }
			return null;
		}
	}

	
	