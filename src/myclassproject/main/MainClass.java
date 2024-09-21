package myclassproject.main;

import com.storygraph.Story;

import myclassproject.questexample.QuestGraph;
import myclassproject.testgraph.TestGraph;
public class MainClass {

	//This is the start of your program
	public static void main(String[] args) {
		//Create an object of your story class.
		var story = new Story();
		//Simply call run.
		story.Run(new QuestGraph());
	}

}
