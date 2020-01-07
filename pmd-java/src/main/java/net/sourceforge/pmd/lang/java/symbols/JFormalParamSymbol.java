/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */


package net.sourceforge.pmd.lang.java.symbols;

/**
 * Represents a formal parameter of a {@link JExecutableSymbol}.
 *
 * @author Clément Fournier
 * @since 7.0.0
 */
public interface JFormalParamSymbol extends JValueSymbol {

    /** Returns the symbol declaring this parameter. */
    JExecutableSymbol getDeclaringSymbol();

}
