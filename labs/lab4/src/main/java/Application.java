/**
 * @author Birsan Ioana (cas. Amariei B5)
 * @author Gensthaler octavian B5
 */

import catalog.Catalog;

public class Application {
    public static void main(String[] args) throws Exception {
        Catalog catalog = new Catalog();
        catalog.add(new Book("The Art of Computer Programming", "C:\\facultate\\an2\\sem2\\java\\java\\labs\\catalog\\tacp.ps", 1967, "Donald E. Knuth"));

        catalog.add(new Article("Mastering the Game of Go without Human Knowledge", "C:\\facultate\\an2\\sem2\\java\\java\\labs\\catalog\\AlphaGo.pdf", 2017, "David Silver", "Julian Schrittwieser", "Karen Simonyan"));
        catalog.add(new Manual("Cookbook","C:\\facultate\\an2\\sem2\\java\\java\\labs\\catalog\\cookbook.doc", 2001));
        catalog.save("C:\\facultate\\an2\\sem2\\java\\java\\labs\\catalog\\catalog.dat");

        catalog = Catalog.load("C:\\facultate\\an2\\sem2\\java\\java\\labs\\catalog\\catalog.dat");
        catalog.list();
    }
}
