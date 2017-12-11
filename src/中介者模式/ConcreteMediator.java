package 中介者模式;

public class ConcreteMediator implements Mediator {

	private ConcreteColleague1 concreteColleague1;
	private ConcreteColleague2 concreteColleague2;

	@Override
	public void createMediator() {
		concreteColleague1 = new ConcreteColleague1();
		concreteColleague2 = new ConcreteColleague2();
	}

	@Override
	public void work() {
		concreteColleague1.colleagueWork();
		concreteColleague2.colleagueWork();
	}

}
