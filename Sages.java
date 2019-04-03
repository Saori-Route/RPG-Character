
class Sages extends Character{
	private String word;

	public Sages() {

	}


	public void introduce() {
		System.out.println("わしの名は"+this.name+"。賢者である");
	}


	public Sages(String name,String word) {
		super(name,150,80);
		this.word = word;

	}

	public void attack(Character target) {
		word();
		target.damage(clash);

	}

	public void word() {
		System.out.println(this.name+"の攻撃"+this.word+"。");
	}

}