package myclassproject.mystorygraph;

import static myclassproject.mystorygraph.MyStoryEntities.*;

import java.util.List;
import com.storygraph.*;
import com.actions.*;
import com.actions.Draw;
import com.actions.EnableInput;
import com.actions.Face;
import com.actions.HideMenu;
import com.actions.SetCameraFocus;
import com.actions.SetPosition;
import com.actions.ShowMenu;

import myclassproject.questexample.NodeLabels;
import com.sequences.*; 

public class MyNodeBuilder extends NodeBuilder {
	public MyNodeBuilder(List<Node> list) {
		super(list);
	}

	
		//Orel
	@BuilderMethod
	public void rootActions() {
		var root = get(MyNodeLabels.root.toString());
		root.add(new CreateAll(List.of(alley, circleChain, ale, honeyBun, village, waffleHouse))).add(new CreateCharacterSequence(player))
				.add(new CreateCharacterSequence(manMan)).add(new CreateCharacterSequence(babyGronk)).add(new CreateCharacterSequence(womp))
				.add(new CreateCharacterSequence(johnJohn)).add(new CreateCharacterSequence(gilbert)).add(new CreateCharacterSequence(cashier))
				.add(new SetPosition(player, village)).add(new SetPosition(babyGronk, village)).add(new SetPosition(manMan, village))
				.add(new SetPosition(johnJohn, village)).add(new SetPosition(womp, village)).add(new SetPosition(gilbert, alley)).add(new SetPosition(cashier, waffleHouse))
				.add(new Face(player, womp)).add(new SetCameraFocus(player)).add(new ShowMenu());
	}
	
	//Izzy
	@BuilderMethod
	public void atVillageActions() {
		var node = get(MyNodeLabels.atVillage.toString());
		node.add(new HideMenu()).add(new EnableInput())
		.add(new NarrationSequence("Once upon a time, there was a group of wizards that would go on to fight the shadow government, "
				+ "ruled by King Crash Out XI. This group of wizards would become the Shadow Money Wizard Gang, but for now they are chilling in an alley,"
				+ " a village they have just stumbled upon. You are Quandale, the group leader of the gang. Right now, you are consulting your group as to "
				+ "what the next move is.")).add(new Wait(3)).add(new HideNarration()).add(new DialogSequence(player, womp, List.of("Any ideas or suggestions?"),
						List.of("ManMan " + "JohnJohn" +" suggestions?", "Baby Gronk" + "Womp" + " any ideas?")));
	}
	
	//Justin
	@BuilderMethod
	public void ideasActions() {
		var node = get(MyNodeLabels.ideas.toString());
		node.add(new HideDialog()).add(new NarrationSequence("You are very desperate for bread so you turn to Baby Gronk who has an idea.")).add(new Face(player, babyGronk))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(babyGronk, player, List.of("We should go scam some old people who don't know anything about the internet."), 
				List.of("Let's do it.", "Room temperature IQ I swear.", "Womp any suggestions?")));
	}
	
	//Izzy
	@BuilderMethod
	public void suggestionsActions() {
		var node = get(MyNodeLabels.suggestions.toString());
		node.add(new HideDialog())
		.add(new NarrationSequence("No gang is successful if they have no motion. You as the group leader make every single decision for the gang and "
				+ "they reply to your every command. You are starving for clout so you consider faking like you actually care about your community and "
				+ "record a video of you guys helping people out or take out your bordem on some innocent person trying to make ends meet. "
				+ "You decide to let the group have a say in a decision for once.")).add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(manMan, player, List.of("ManMan says we should put this pent up energy towards something positive like feeding the homeless.", "john-john believes its best if we just target bully someone trying to work their food service shift"), 
				List.of("what a lovely idea Manman.", "There's nothing going on in those heads of yours", "I dont see why not" )));
	}
	

	//Izzy
	@BuilderMethod
	public void feedActions() {
		var node = get(MyNodeLabels.feed.toString());
		node.add(new HideDialog())
		.add(new NarrationSequence("ManMan takes you and your group to the convenience store and buy as many honey buns as possible "
				+ "he grabs a few honey buns and puts them into a microwave for some unspecified amount of time"))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(player, manMan, List.of("ManMan this is really nice of you."), List.of("Oh brother I already know where this is going.","yeak I know right....")));
	}
	
	//Orel
	@BuilderMethod
	public void yeahActions() {
		var node = get(MyNodeLabels.yeah.toString());
		node.add(new NarrationSequence("Some time goes by and some rancide smell provades the space, you investigate and see ManMan looking at the microwave with malicious intent. the stack of honeybuns didnt decrease insize yet, after all this time theres still honeybuns in the microwave."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(player, manMan, List.of("They been in there an awfully long time"), List.of("Don't you think you should take them out?")));
	}
	
	//Izzy
	@BuilderMethod
	public void nothingActions() {
		var node = get(MyNodeLabels.nothing.toString());
		node.add(new NarrationSequence("i just want them to have a warm snack.  you look at manman then back at the microwave, "
				+ "the honey buns are glowing white hot, and you feel the heat imminating from them."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(player, manMan, List.of("Yeah, I don't think ANYONE is going to be able to eat these!"), List.of("These look awfully hot.")));
	}
	
	//Izzy
	@BuilderMethod
	public void eatActions() {
		var node = get(MyNodeLabels.eat.toString());
		node.add(new DialogSequence(player, manMan, List.of("Who said anything about eating"), List.of("Eat?")))
		.add(new Draw(player, galaxyGas))
		.add(new NarrationSequence("You take a hit of your galaxy gas"));
	}
	
	//Orel
	@BuilderMethod
	public void bullyActions() {
		var node = get(MyNodeLabels.bully.toString());
		node.add(new NarrationSequence("JohnJohn takes you and your group to a waffle house (bad idea) and start trying to cause commotion"))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(player, johnJohn, List.of("Rev up those fryers!"), List.of("I'm starving!")));
	}
	
	//Justin
	@BuilderMethod
	public void consequencesActions() {
		var node = get(MyNodeLabels.consequences.toString());
		node.add(new NarrationSequence("The cashier at the waffle house is not having it and they immediately jump you, "
				+ "Baby Gronk, ManMan, and even womp who was dragged inside, they put a mask on you and your gang and yell at someone to bring out "
				+ "the galaxy gas."));
	}
	
	//Izzy
	@BuilderMethod
	public void overrideActions() {
		var node = get(MyNodeLabels.override.toString());
		node.add(new NarrationSequence("You realized that inhaling such copius amounts of galaxy gas has made your brain smooth, "
				+ "and once all of the pent up rot left you brain you realized just how stupid everyones idea was."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new NarrationSequence("With no backup plan you and the group decide to live in the alley for the rest of your lives as bums."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new NarrationSequence("While chilling in the alley on a random night, you suddenly hear footsteps charging towards your group hangout."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new SetPosition(gilbert, alley)).add(new SetPosition(player, alley)).add(new SetPosition(johnJohn, alley)).add(new SetPosition(manMan, alley))
		.add(new SetPosition(babyGronk, alley)).add(new SetPosition(womp, alley))
		.add(new NarrationSequence("You realize a random drunk is furiously charging towards you. He tries to break the bottle of ale he's carrying "
				+ "on his head, but fails as the bottle is too hard. He then knocks himself out."));
	}
	
	//Justin
	@BuilderMethod
	public void messActions() {
		var node = get(MyNodeLabels.mess.toString());
		node.add(new NarrationSequence("The group, startled at first, now looks purplexed."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(player, gilbert, List.of("Investigate the drunk man"), List.of("Ignore")));
	}
	
	//Justin
	@BuilderMethod
	public void findActions() {
		var node = get(MyNodeLabels.find.toString());
		node.add(new NarrationSequence("The group sends you over to investigate, but out of no where, "
				+ "the drunken man gets up and swings his bottle of ale at your shins."));
	}
	
	//Justin
	@BuilderMethod
	public void leaveActions() {
		var node = get(MyNodeLabels.leave.toString());
		node.add(new NarrationSequence("The group goes back to minding their own business, soon after, hearing a bottle crack, "
				+ "the druken man appears enraged, and makes a druken dash towards you and your group."));
	}
	
	//Izzy
	@BuilderMethod
	public void altercationActions() {
		var node = get(MyNodeLabels.altercation.toString());
		node.add(new NarrationSequence("You and your group immediately pounce on him surrounding him, each of you taking your stances getting ready to "
				+ "jump him, but mid way through your first attack you think you hear something, a plea for help."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new SetPosition(player, alley)).add(new SetPosition(johnJohn, alley)).add(new SetPosition(manMan, alley))
		.add(new SetPosition(babyGronk, alley)).add(new SetPosition(womp, alley)).add(new SetPosition(gilbert, alley));
	}
	
	//Orel
	@BuilderMethod
	public void hearActions() {
		var node = get(MyNodeLabels.hear.toString());
		node.add(new NarrationSequence("You hold off of your attack and the rest of your group follows the drunken man gets up"));
	}
	
	//Orel
	@BuilderMethod
	public void jumpActions() {
		var node = get(MyNodeLabels.jump.toString());
		node.add(new NarrationSequence("After dealing with the drunk man with maximum efficiency, one of the members in your party is getting ready "
				+ "to make him bite the curb but you notice something unmistakable..."));
	}
	
	//Orel
	@BuilderMethod
	public void realizationActions() {
		var node = get(MyNodeLabels.realization.toString());
		node.add(new NarrationSequence("You realized its the circle chain that belonged to a former member of the shadow money wizard gang"));
	}
	
	//Justin
	@BuilderMethod
	public void cleanActions() {
		var node = get(MyNodeLabels.clean.toString());
		node.add(new NarrationSequence("After realizing who this random drunk man might be, you clean him up, he then starts explaining himself, "
				+ "he says he needs help to get is get back on the king of this country because he ruined his life"))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(player, gilbert, List.of("How?"), List.of("We don't even know if it's truly you.")));
	}
	
	//Izzy
	@BuilderMethod
	public void backgroundActions() {
		var node = get(MyNodeLabels.background.toString());
		node.add(new NarrationSequence("I'm Gilbert, I was attending a party and it turned out to be a surprise 20 v 1. "
				+ "After everyone popped their balloons, King Crash Out XI vanquished everyone present to the gnawing abyss. "
				+ "In an attempt to win back my pride, he challenged me to go dabloon for dabloon with him."))
		.add(new Wait(3)).add(new HideNarration())
		.add(new DialogSequence(player, gilbert, List.of("What happened next?"), List.of("Did you win?")));
	}
	
	//Orel
	@BuilderMethod
	public void morebackgroundActions() {
		var node = get(MyNodeLabels.morebackground.toString());
		node.add(new NarrationSequence("I cleared King Crash Out XI but I made a fatal mistake of boasting about my win. "
				+ "Not only did the King drain my bank account, he also siphoned away all of my aura."))
			.add(new Wait(3)).add(new HideNarration())
			.add(new DialogSequence(player, gilbert, List.of("When?"), List.of("What you want us to do about that?")))
			.add(new DialogSequence(player, gilbert, List.of("Oh, nah muddy he violated you."), List.of("Damn, that's crazy.", "Say no more.")));
	}
	
	//Izzy
	@BuilderMethod
	public void whenActions() {
		var node = get(MyNodeLabels.when.toString());
		node.add(new DialogSequence(player, gilbert, List.of("Wait when?"), List.of("Last night."))) 
			.add(new DialogSequence(player, gilbert, List.of("No, when did I ask?"), List.of("Real.")));
	}
	
	//Justin
	@BuilderMethod
	public void badActions() {
		var node = get(MyNodeLabels.bad.toString());
		node.add(new NarrationSequence("You are forced to live the rest of your life with negative aura"));
	}
	
	//Justin
	@BuilderMethod
	public void neutralActions() {
		var node = get(MyNodeLabels.neutral.toString());
		node.add(new NarrationSequence("Gilbert agrees with you and looks down at his foams in shame."));
	}
	
	//Justin
	@BuilderMethod
	public void goodActions() {
		var node = get(MyNodeLabels.good.toString());
		node.add(new NarrationSequence("Gilbert thanks you for offering your help."));
	}
	
	//Justin
	@BuilderMethod 
	public void fallActions() {
		var node = get(MyNodeLabels.fall.toString());
		node.add(new NarrationSequence("Womp says nothing, or though it may seem. In actuality, he sent you back in time to the very beginning of your "
				+ "story, erasing your memory of the events that transpired."))
		.add(new Wait(3)).add(new HideNarration());
	}
	
	@BuilderMethod
	public void lickActions() {
		var node = get(MyNodeLabels.lick.toString());
		node.add(new HideDialog())
		.add(new NarrationSequence("after comenting a crime you go to the local shop to cash in, only to find out that every thing you stole was from shemu."))
		.add(new Wait(3)).add(new HideNarration()).add(new DialogSequence(player, johnJohn, List.of("Defeated you take a hit of your galaxy gas"), List.of("override their decision and dont hit the lick")));
	}
}