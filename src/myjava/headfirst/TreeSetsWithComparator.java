package headfirst;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetsWithComparator {
	class Book {
		String titleString;

		public Book(String titleString) {
			this.titleString = titleString;
		}
	}

	public static void main(String[] args) {
		new TreeSetsWithComparator().go();

	}

	private void go() {
		BookCompare bookCompare = new BookCompare();
		TreeSet<Book> treeSet = new TreeSet<TreeSetsWithComparator.Book>(bookCompare);
		treeSet.add(new Book("Ggkjhgjk"));
		treeSet.add(new Book("ASdfhgjk"));
		treeSet.add(new Book("Ytugvhbjhgjk"));
		System.out.println(treeSet);

	}

	public class BookCompare implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			return (o1.titleString.compareTo(o2.titleString));
		}

	}

}
