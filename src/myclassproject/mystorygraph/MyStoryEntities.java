package myclassproject.mystorygraph;
import com.entities.*;
import com.enums.*;


public final class MyStoryEntities {
	//Create an instance of Character, Place, Furniture, and Item classes 

	//for each of the characters, places, furniture, and items in your story
	//Make that instance public static final
	//e.g. public static final Characters player = new Characters("Player", BodyTypes.D, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);
	//You can access these instances in your EdgeBuilder and NodeBuilder classes by importing:
	//import static myclassproject.mystorygraph.MyStoryEntities.*;
	
	//Our characters
		public static final Characters player = new Characters("Quandale", BodyTypes.F, Clothing.Warlock, HairStyle.Bald, Colors.Red, 6);
		public static final Characters manMan = new Characters("ManMan", BodyTypes.D, Clothing.Priest, HairStyle.Short_Full, Colors.Black, 6);
		public static final Characters gilbert = new Characters("Gilbert", BodyTypes.H, Clothing.Beggar, HairStyle.Mage_Full, Colors.Black, 6);
		public static final Characters johnJohn = new Characters("JohnJohn", BodyTypes.B, Clothing.Bandit, HairStyle.Bald, Colors.Black, 6);
		public static final Characters womp = new Characters("Womp", BodyTypes.A, Clothing.Witch, HairStyle.Bald, Colors.Red, 6);
		public static final Characters babyGronk = new Characters("Baby Gronk", BodyTypes.D, Clothing.LightArmour, HairStyle.Spiky, Colors.Black, 6);
		public static final Characters cashier = new Characters("Cashier", BodyTypes.C, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);

		//Our items
		public static final Item circleChain = new Item("CircleChain", ItemTypes.MagnifyingGlass);
		public static final Item honeyBun = new Item("HoneyBun", ItemTypes.Coin);
		public static final Item ale = new Item("Ale", ItemTypes.Bottle);
		public static final Item galaxyGas = new Item("GalaxyGas", ItemTypes.PurplePotion);
		
		//Our places
		public static final Place village = new Place("Village", PlaceTypes.City);
		public static final Place alley = new Place("Alley", PlaceTypes.City);
		public static final Place waffleHouse = new Place("Waffle House", PlaceTypes.Tavern);
}
