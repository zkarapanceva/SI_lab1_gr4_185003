class Point {
	String id
	double x,y;

	//TODO add new variable

	String boja;

	//TODO constructor

	public Point(String id, double x, double y, String boja) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.boja = boja;
	}

	//TODO setters and getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		switch(xDirection){
			case 'L' : x--;
			case 'R' : x++;
		}

		switch(yDirection){
			case 'U' : y++;
			case 'D' : y--;
		}
	}

	public void draw () {
		//TODO
		System.out.println("Tochkata " + id + " se naogja " + x + " edinici na x - oskata i " + y + " edinici na y - oskata!");
	}



}
class Canvas{
	List<Points> list = new ArrayList<>();

	public Canvas(List<Points> list) {
		this.list = list;
	}

	public void dodavanje(Point novaTocka){
		list.add(novaTocka);
	}

	public void brisenje(Point tocka){
		list.remove(tocka);
	}

	public void pomestuvanje(char kade)
	{
		for(Point tocka : list)
		{
			switch(kade){
				case 'L' : tocka.x--;
				case 'R' : tocka.x++;
				case 'D' : tocka.y--;
				case 'U' : tocka.y++;
			}
		}
	}
}