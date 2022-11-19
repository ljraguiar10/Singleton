package designpatterns;

//metódo lazy

public class Singleton_2 {

	public static void main(String[] args) {

		// new ProdutoFactory().novoProduto(1);
		// ProdutoFactory.INSTANCE.novoProduto(2);
		ProdutoFactory.getInstance().novoProduto(1);
	}

}

interface Produto4 {

}

class ProdutoPadrao4 implements Produto4 {

}

class ProdutoDigital4 extends ProdutoPadrao4 {

}

class ProdutoFisico4 extends ProdutoPadrao4 {

}

class ProdutoFactory {

	// public static final ProdutoFactory INSTANCE = new ProdutoFactory();
	private static ProdutoFactory instance;

	private ProdutoFactory() {

	}

	public static synchronized ProdutoFactory getInstance() {
		if (instance == null) {
			instance = new ProdutoFactory();
		}
		return instance;
	}

	public Produto4 novoProduto(int tipoProduto) {
		switch (tipoProduto) {
		case 1:
			return new ProdutoPadrao4();
		case 2:
			return new ProdutoDigital4();
		case 3:
			return new ProdutoFisico4();
		default:
			throw new IllegalArgumentException();
		}
	}
}