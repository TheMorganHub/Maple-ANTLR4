package com.morgandev.app.visitors;

import com.morgandev.app.gen.MapleBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * All visitor classes except MapleMainVisitor should inherit from this class, as this guarantees that every time they
 * call on {@link MapleBaseVisitor#visit(ParseTree)} they use the main visitor, {@link MapleMainVisitor}, and not their
 * own, as this could potentially cause null values to be returned.
 */
public abstract class AbstractMapleVisitor extends MapleBaseVisitor<String> {

    @Override
    public String visit(ParseTree tree) {
        return MapleMainVisitor.getInstance().visit(tree);
    }
}
