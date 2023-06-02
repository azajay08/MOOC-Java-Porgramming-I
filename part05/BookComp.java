
public class BookComp {

	private String name;
	private int publicationYear;

	public BookComp(String name, int publicationYear) {
		this.name = name;
		this.publicationYear = publicationYear;
	}

	public String getName() {
		return name;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public boolean equals(Object compared) {
		if (this == compared) {
			return true;
		}

		if (!(compared instanceof BookComp)) {
			return false;
		}

		BookComp comparedBookComp = (BookComp) compared;

		if (this.name.equals(comparedBookComp.name)
				&& this.publicationYear == comparedBookComp.publicationYear) {
			return true;
		}

		return false;
	}

}
