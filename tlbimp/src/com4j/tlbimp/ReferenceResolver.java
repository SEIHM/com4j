package com4j.tlbimp;

import com4j.tlbimp.def.IWTypeLib;

/**
 * Resolves a reference to another type library.
 *
 * @author Kohsuke Kawaguchi (kk@kohsuke.org)
 */
public interface ReferenceResolver {
    /**
     * @return
     *      the package name in which this given type library is
     *      generated. Return "" to suppress generation.
     */
    String resolve(IWTypeLib lib) throws BindingException;
}
