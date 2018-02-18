package lambdas;

@FunctionalInterface
public interface Filtro<E, R> {

	public R filtrar(E entrada);
	
}
