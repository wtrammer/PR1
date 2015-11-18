package Konto;

public class Konto {

private String owner;
private double balance;
public void setOwner(String m_owner)
{
	owner = m_owner;
	balance = 0;
}
public void payin(double sum)
{
	balance+=sum;
}
public void payOut(double sum)
{
	if (balance-sum>  0)
	{
		balance-=sum;
	}
	else
	{
		System.out.println("geht nicht");
	}
}
}