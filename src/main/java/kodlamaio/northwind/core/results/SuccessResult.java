package kodlamaio.northwind.core.results;

public class SuccessResult extends Result{
	public SuccessResult(boolean success,String messsage) {
		super(true,messsage);
	}
	public SuccessResult(boolean success) {
		super(true);
	}
}
