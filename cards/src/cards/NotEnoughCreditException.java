package cards;

public class NotEnoughCreditException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2566702057339982460L;

	@Override
    public String getMessage() {
        return "Nincs el�g p�nz a sz�ml�n!";
    }
}
