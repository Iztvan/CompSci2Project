package myclassproject.questexample;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.storygraph.Graph;
import com.storygraph.NodeBuilder;

public class QuestGraph extends Graph {
	public QuestGraph() {
		super(Stream.of(NodeLabels.values()).map(z->z.toString()).collect(Collectors.toList()));
	}
	
	public NodeBuilder getNodeBuilder() {
		return new QuestNodeBuilder(nodes);
	}
	
	public NodeBuilder getEdgeBuilder() {
		return new QuestEdgeBuilder(nodes);
	}

}
