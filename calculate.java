public class calculate{
	private int rezult;

	public void add(int ... params){
		for(Integer param : params){
			this.rezult += param;
		}
	}

	public int getRezult(){
		return this.rezult;
	}

	public void cleanRezult(){
		this.rezult = 0;
	}
	public static void main(String[] arg){

		System.out.println("calculate");
	}
}