package fr.univamu.iut;
import java.util.*;

/**
 * 
 */
public class LevenshteinStrategy implements ITextDistance {

    /**
     * Default constructor
     */
    public LevenshteinStrategy() {
    }

    /**
     * @param String 
     * @return
     */
    public double computeDistance(String textToCompute, String corpusText) {
    	return Math.abs(textToCompute.compareTo(corpusText));
    }
}