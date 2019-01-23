package github.clyoudu.caseformat.action;

import com.intellij.openapi.editor.actionSystem.EditorAction;
import github.clyoudu.caseformat.handler.CaseFormatActionHandler;
import github.clyoudu.caseformat.transformer.UpperCamelTransformer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 15:31
 * @description UpperCamelAction
 */
public class UpperCamelAction extends EditorAction {
    public UpperCamelAction() {
        super(new CaseFormatActionHandler(new UpperCamelTransformer()));
    }
}
