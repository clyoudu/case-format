package github.clyoudu.caseformat.action;

import com.intellij.openapi.editor.actionSystem.EditorAction;
import github.clyoudu.caseformat.handler.CaseFormatActionHandler;
import github.clyoudu.caseformat.transformer.UpperHyphenTransformer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 14:16
 * @description UpperHyphenAction
 */
public class UpperHyphenAction extends EditorAction {
    public UpperHyphenAction() {
        super(new CaseFormatActionHandler(new UpperHyphenTransformer()));
    }
}
