package headfirst;

import java.util.TreeSet;

public class TreeSets {

	class Book implements Comparable {
		String titleString;

		public Book(String titleString) {
			super();
			this.titleString = titleString;
		}

		@Override
		public int compareTo(Object o) {
			Book book = (Book) o;
			return titleString.compareTo(book.titleString);
		}

	}

	public static void main(String[] args) {
		new TreeSets().go();

	}

	private void go() {
		TreeSet<TreeSets.Book> treeSet = new TreeSet<TreeSets.Book>();

		treeSet.add(new Book("Fhfgfhj"));
		treeSet.add(new Book("Trrrhfgfhj"));
		treeSet.add(new Book("Ojjhj"));

		System.out.println(treeSet);

	}

}
