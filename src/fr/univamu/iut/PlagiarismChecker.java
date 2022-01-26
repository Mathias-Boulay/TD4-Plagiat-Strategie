package fr.univamu.iut;
import java.util.*;

/**
 * 
 */
public class PlagiarismChecker {

    /**
     * Default constructor
     */
    public PlagiarismChecker() {
    	checkerStrategy = new ArrayList<>(2);
    	checkerStrategy.add(new LevenshteinStrategy());
    	checkerStrategy.add(new HammingStrategy());
    	
    	corpus = new CorpusText();
    	threshold = 3;
    }

    /** */
    private ArrayList<ITextDistance> checkerStrategy;

    /** The minimum distance before getting accepted as non-plagiarism*/
    private int threshold;

    /* Delivers text until there is no more. */
    public CorpusText corpus;



    /**
     * @param text The text to compare it too.
     * @return Whether or not plagiarism is detected
     */
    public boolean checkPlagiarism(String text) {
    	// TODO do better code I guess but right now I couldn't care less
    	double distance = 0d;
    	
    	for(ITextDistance checkerStrategy : checkerStrategy) {
    		distance = checkerStrategy.computeDistance(text, corpus.get());
    		if(distance < threshold) return true;
    	}
    	
    	
        return false;
    }

}