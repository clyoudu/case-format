package github.clyoudu.caseformat.action;

import com.intellij.openapi.editor.actionSystem.EditorAction;
import github.clyoudu.caseformat.handler.CaseFormatActionHandler;
import github.clyoudu.caseformat.transformer.LowerCamelTransformer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 15:30
 * @description LowerCamelAction
 */
public class LowerCamelAction extends EditorAction {
    public LowerCamelAction() {
        super(new CaseFormatActionHandler(new LowerCamelTransformer()));
    }
}
