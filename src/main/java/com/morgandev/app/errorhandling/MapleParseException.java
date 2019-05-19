package com.morgandev.app.errorhandling;

import com.morgandev.app.utils.bundles.ResourceBundleHandler;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * We use MapleParseException for errors during parsing.
 */
public class MapleParseException extends RuntimeException {

    private int errorCode;
    private Object[] args;
    private ParserRuleContext parseContext;

    /**
     * Initialises a {@link MapleParseException} using the given error code and then loads the corresponding error
     * message from the {@link ResourceBundleHandler}
     *
     * @param errorCode a Maple error code
     */
    public MapleParseException(int errorCode) {
        this.errorCode = errorCode;
    }

    public MapleParseException(int errorCode, ParserRuleContext ctx) {
        this(errorCode, ctx, (Object[]) null);
    }

    /**
     * Initialises a {@link MapleParseException} using the given error code and arguments and then loads the corresponding error
     * message from the {@link ResourceBundleHandler}
     * The arguments will be sent to the <code>ResourceBundleHandler</code> and used to populate parts of the error message.
     * Use this constructor for error codes with messages that require variables, for example, a syntax error.
     *
     * @param errorCode a Maple error code
     * @param args      the optional variable arguments used by <code>ResourceBundleHandler</code>
     */
    public MapleParseException(int errorCode, ParserRuleContext ctx, Object... args) {
        this.errorCode = errorCode;
        this.parseContext = ctx;
        this.args = args;
    }

    @Override
    public String getMessage() {
        ResourceBundleHandler errorHandler = new ResourceBundleHandler("com.morgandev.ErrorMessages");
        String nearLine = "";
        if (parseContext != null) {
            int line = parseContext.getStart().getLine() + 1;
            int col = parseContext.getStart().getCharPositionInLine();
            nearLine = "(" + line + ":" + col + ")";
        }
        return errorHandler.getMessage(errorCode, args) + nearLine;
    }

    public int getErrorCode() {
        return errorCode;
    }
}