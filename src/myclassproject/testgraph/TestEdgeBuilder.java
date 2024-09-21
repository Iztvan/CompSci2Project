package myclassproject.testgraph;

import static myclassproject.questexample.QuestStoryEntities.cityExit;
import static myclassproject.questexample.QuestStoryEntities.player;

import java.util.List;

import com.playerInput.PlayerInteraction;
import com.storygraph.BuilderMethod;
import com.storygraph.Edge;
import com.storygraph.Node;

import myclassproject.questexample.ChoiceLabels;
import myclassproject.questexample.NodeLabels;
import myclassproject.questexample.QuestEdgeBuilder;

public class TestEdgeBuilder extends QuestEdgeBuilder {
	public TestEdgeBuilder(List<Node> list) {
		super(list);
	}

	@Override
	@BuilderMethod
	public void rootEdges() {
		var root = get(NodeLabels.root.toString());
		root.clearEdges();
		var choice = new PlayerInteraction(player, ChoiceLabels.Leave.toString(), cityExit);
		var nextNode = get(NodeLabels.atCity2.toString());
		root.add(new Edge(choice, nextNode));
	}

	
}
