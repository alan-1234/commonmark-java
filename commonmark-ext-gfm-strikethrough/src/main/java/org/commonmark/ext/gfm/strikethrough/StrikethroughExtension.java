package org.commonmark.ext.gfm.strikethrough;

import org.commonmark.Extension;
import org.commonmark.parser.Parser;
import org.commonmark.html.HtmlRenderer;

public class StrikethroughExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension {

    private StrikethroughExtension() {
    }

    public static Extension create() {
        return new StrikethroughExtension();
    }

    @Override
    public void extend(Parser.Builder parserBuilder) {
        parserBuilder.customDelimiterProcessor(new StrikethroughDelimiterProcessor());
    }

    @Override
    public void extend(HtmlRenderer.Builder rendererBuilder) {
        rendererBuilder.customHtmlRenderer(new StrikethroughHtmlRenderer());
    }

}
