
class Sages extends Character implements Letter {
	private String word;

	public Sages() {
		this.word = "神の御言葉";

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

	@Override
	public void attack() {
		word();
	}

	@Override
	public void letter(Character[]target) {
		System.out.println(this.name+"は書簡を送った");
	}
}