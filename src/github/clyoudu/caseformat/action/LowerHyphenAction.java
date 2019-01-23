package github.clyoudu.caseformat.action;

import com.intellij.openapi.editor.actionSystem.EditorAction;
import github.clyoudu.caseformat.handler.CaseFormatActionHandler;
import github.clyoudu.caseformat.transformer.LowerHyphenTransformer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/22 17:56
 * @description LowerHyphenAction
 */
public class LowerHyphenAction extends EditorAction {
    public LowerHyphenAction() {
        super(new CaseFormatActionHandler(new LowerHyphenTransformer()));
    }
}
