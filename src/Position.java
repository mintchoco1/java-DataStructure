/**
 * An interface for a position which is an abstraction for the
 * location at which a single element is stored in a positional
 * container.
 *
 * @param <E> the element type stored at a position
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public interface Position<E> {
    /**
     * Returns the element stored at this position.
      *
     * @return the stored element
     * @throws IllegalStateException if position no longer valid
     */
    E getElement() throws IllegalStateException;

    /*static void printSignature() {
        System.out.println("Using Extended PositionalList v1.1");
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.println("User: " + System.getProperty("user.name"));
        System.out.println("Working dir: " + System.getProperty("user.dir"));
        System.out.println("Executed at: " + java.time.LocalDateTime.now());
    }*/
}
