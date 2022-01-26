package fr.univamu.iut;
import java.util.*;

/**
 * 
 */
public class HammingStrategy implements ITextDistance {

    /**
     * Default constructor
     */
    public HammingStrategy() {
    	
    }

    /**
     * @param String 
     * @return
     */
    public double computeDistance(String textToCompute, String corpusText) {
    	return Math.abs(textToCompute.compareToIgnoreCase(corpusText));
    }
}