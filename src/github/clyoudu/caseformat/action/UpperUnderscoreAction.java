package github.clyoudu.caseformat.action;

import com.intellij.openapi.editor.actionSystem.EditorAction;
import github.clyoudu.caseformat.handler.CaseFormatActionHandler;
import github.clyoudu.caseformat.transformer.UpperUnderscoreTransformer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 15:40
 * @description UpperUnderscoreAction
 */
public class UpperUnderscoreAction extends EditorAction {
    public UpperUnderscoreAction() {
        super(new CaseFormatActionHandler(new UpperUnderscoreTransformer()));
    }
}
