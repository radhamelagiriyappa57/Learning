package abstractconcepts;

public class testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
hdfcbank hd=new hdfcbank();
hd.credit();
hd.debit();
hd.loan();
hd.funds();

bank b = new hdfcbank();
b.credit();
b.debit();
b.loan();

	}

}
