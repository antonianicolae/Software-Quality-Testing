package ro.ase.csie.cts.g1094.laboratory.models;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(Object amount);
	public abstract void withdraw(Object amount);
	public abstract void transfer(Account destination, Object amount);
}
