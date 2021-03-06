package test;

import automates.Automate;
import expression.Tree;
import tree.ThompsonVisitor;
import tree.TreeBuilder;

public class TestThompson {
	public static void main(String[] args) {
		TreeBuilder builder = new TreeBuilder("src/test/input.txt");
		Tree tree = builder.buildTree();
		ThompsonVisitor algo_thompson=new ThompsonVisitor();
		
		Automate result_automate=tree.accept(algo_thompson);;
		System.out.println(result_automate.transitionTableString());
		result_automate.synchronization();
		
		if(!result_automate.testDeterminist())
			result_automate.determinize();
		
		result_automate.minimisation();
		
		System.out.println(result_automate.transitionTableString());
		
		System.out.println("this automate are "+result_automate.isDeterminist());

		//String word="if|a|then|bc";
		String word="aaaaaaaaab";
		System.out.println("the word :("+word+")-> has been "+result_automate.wordRecognition(word));
	}
}