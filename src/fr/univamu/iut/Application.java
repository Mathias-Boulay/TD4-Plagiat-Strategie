package fr.univamu.iut;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textToCompare = "hey hey hey hey hey hey hey hey ";
		
		PlagiarismChecker checker = new PlagiarismChecker();
		
		boolean isTherePlagiarism = checker.checkPlagiarism(textToCompare);
		System.out.println(isTherePlagiarism);
	}

}
