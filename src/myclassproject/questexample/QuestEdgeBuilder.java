package myclassproject.questexample;

import static myclassproject.questexample.QuestStoryEntities.*;

import java.util.List;

import com.playerInput.*;
import com.playerInput.PlayerInteraction.Icons;
import com.storygraph.BuilderMethod;
import com.storygraph.Edge;
import com.storygraph.NodeBuilder;
import com.storygraph.Node;

public class QuestEdgeBuilder extends NodeBuilder {
	public QuestEdgeBuilder(List<Node> list) {
		super(list);
	}

	@BuilderMethod
	public void rootEdges() {
		var root = get(NodeLabels.root.toString());
		var choice = new MenuChoice(MenuChoice.Options.Start);
		var nextNode = get(NodeLabels.atCottage.toString());
		root.add(new Edge(choice, nextNode));
	}

	@BuilderMethod
	public void atCottageEdges() {
		var node = get(NodeLabels.atCottage.toString());
		var choice = new PlayerInteraction(ChoiceLabels.TalkToBandit.toString(), bandit, Icons.talk,
				"Talk to the questgiver.");
		var nextNode = get(NodeLabels.banditTalk.toString());
		node.add(new Edge(choice, nextNode));
	}

	@BuilderMethod
	public void banditTalkEdges() {
		var node = get(NodeLabels.banditTalk.toString());
		var choice1 = new DialogChoice("I will!");
		var nextNode1 = get(NodeLabels.accept.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("I refuse!");
		var nextNode2 = get(NodeLabels.refuse.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	@BuilderMethod
	public void acceptEdges() {
		var node = get(NodeLabels.accept.toString());

		var choice1 = new KeyboardChoice(KeyboardChoice.Keys.Inventory);
		var nextNode1 = get(NodeLabels.inventory.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.Leave.toString(), cottageDoor, Icons.exit, "Go to the city");
		var nextNode2 = get(NodeLabels.atCity.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	@BuilderMethod
	public void refuseEdges() {
		var node = get(NodeLabels.refuse.toString());

		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(NodeLabels.reset.toString());
		node.add(new Edge(choice1, nextNode1));
	}

	@BuilderMethod
	public void resetEdges() {
		var node = get(NodeLabels.reset.toString());
		var choice = new MenuChoice(MenuChoice.Options.Resume);
		var nextNode = get(NodeLabels.atCottage.toString());
		node.add(new Edge(choice, nextNode));
	}

	@BuilderMethod
	public void inventoryEdges() {
		var node = get(NodeLabels.inventory.toString());

		var choice = new CloseListChoice();
		var nextNode = get(NodeLabels.accept2.toString());
		node.add(new Edge(choice, nextNode));
	}

	@BuilderMethod
	public void accept2Edges() {
		var node = get(NodeLabels.accept2.toString());

		var choice1 = new KeyboardChoice(KeyboardChoice.Keys.Inventory);
		var nextNode1 = get(NodeLabels.inventory.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.Leave.toString(), cottageDoor, Icons.exit, "Go to the city");
		var nextNode2 = get(NodeLabels.atCity.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	@BuilderMethod
	public void atCityEdges() {
		var node = get(NodeLabels.atCity.toString());
		var choice = new PlayerInteraction(player, ChoiceLabels.Leave.toString(), cityExit);
		var nextNode = get(NodeLabels.atCity2.toString());
		node.add(new Edge(choice, nextNode));
	}

	@BuilderMethod
	public void atCity2Edges() {
		var node = get(NodeLabels.atCity2.toString());
		var choice = new PlayerInteraction(player, ChoiceLabels.Leave.toString(), cityExit);
		var nextNode = get(NodeLabels.atCity2.toString());
		node.add(new Edge(choice, nextNode));
	}
}
