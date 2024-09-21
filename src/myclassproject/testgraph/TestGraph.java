package myclassproject.testgraph;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.storygraph.Graph;
import com.storygraph.NodeBuilder;

import myclassproject.questexample.NodeLabels;

public class TestGraph extends Graph {
	public TestGraph() {
		super(Stream.of(NodeLabels.values()).map(z->z.toString()).collect(Collectors.toList()));
	}
	
	public NodeBuilder getNodeBuilder() {
		return new TestNodeBuilder(nodes);
	}
	
	public NodeBuilder getEdgeBuilder() {
		return new TestEdgeBuilder(nodes);
	}

}
