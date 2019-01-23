package github.clyoudu.caseformat.action;

import com.intellij.openapi.editor.actionSystem.EditorAction;
import github.clyoudu.caseformat.handler.CaseFormatActionHandler;
import github.clyoudu.caseformat.transformer.LowerUnderscoreTransformer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 15:39
 * @description LowerUnderscoreAction
 */
public class LowerUnderscoreAction extends EditorAction {
    public LowerUnderscoreAction() {
        super(new CaseFormatActionHandler(new LowerUnderscoreTransformer()));
    }
}
