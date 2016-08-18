//Milind Pathiyal

public class AckamarackusDriver
{
	public static void start()
	{
		Fadoodle claptrap = new Fadoodle();
		Fadoodle hooey = new Fadoodle(2);
		Baboonery mullock = new Baboonery(hooey);
		
		int codswallop = claptrap.ballyhoo();
		Fadoodle rannygazoo = mullock.getFlummery(hooey);
		String haver = hooey.flummadiddle(codswallop);
		claptrap.flummadiddle("jabberwock", 7.0);
		mullock.flummadiddle(haver);
		haver = claptrap.flummadiddle(42);
		int jabberwock = Baboonery.FLIMFLAM;
		hooey.haver('0');
		hooey = claptrap.nugament(codswallop == jabberwock);
		Baboonery flummery = Baboonery.tarradoodle(hooey, haver, rannygazoo, Math.sqrt(codswallop)); 
		
	}
}