package myclassproject.questexample;

import com.entities.*;
import com.enums.*;

public final class QuestStoryEntities {
	public static final Characters player = new Characters("Player", BodyTypes.D, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);
	public static final Characters bandit = new Characters("Bandit", BodyTypes.F, Clothing.Bandit, HairStyle.Bald, Colors.Black, 4);
	public static final Place cottage = new Place("Home", PlaceTypes.Cottage);
	public static final Place town = new Place("Town", PlaceTypes.City);
	public static final Item sword = new Item("Sword", ItemTypes.Sword);
	public static final Furniture cottageDoor = new Furniture(cottage, FurnitureTypes.Door);
	public static final Furniture table = new Furniture(cottage, FurnitureTypes.Table);
	public static final Furniture chair = new Furniture(cottage, FurnitureTypes.Chair);
	public static final Furniture cityDoor = new Furniture(town, FurnitureTypes.RedHouseDoor);
	public static final Furniture cityExit = new Furniture(town, FurnitureTypes.NorthEnd);
}
