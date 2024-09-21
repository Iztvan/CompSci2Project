package myclassproject.mystorygraph;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.storygraph.Graph;
import com.storygraph.NodeBuilder;

import myclassproject.questexample.NodeLabels;

public class MyGraph extends Graph {
	/**
	 * The constructor creates a new object for each of the values in NodeLabels enum.
	 */
	public MyGraph(NodeLabels rootLabel) {
		super(Stream.of(MyNodeLabels.values()).map(z->z.toString()).collect(Collectors.toList()));    
	}
	
	/**
	 * @return A new object of MyNodeBuilder
	 */
	public NodeBuilder getNodeBuilder() {
		return new MyNodeBuilder(nodes);
	}
	
	/**
	 * @return A new object of MyEdgeBuilder
	 */
	public NodeBuilder getEdgeBuilder() {
		return new MyEdgeBuilder(nodes);
	}

}
