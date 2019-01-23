package github.clyoudu.caseformat.handler;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.actionSystem.EditorWriteActionHandler;
import github.clyoudu.caseformat.transformer.CaseTransformer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/22 17:59
 * @description CaseFormatActionHandler
 */
public class CaseFormatActionHandler extends EditorWriteActionHandler {

    CaseTransformer caseTransformer;

    public CaseFormatActionHandler(CaseTransformer caseTransformer){
        this.caseTransformer = caseTransformer;
    }

    @Override
    public void executeWriteAction(Editor editor, Caret caret, DataContext dataContext) {
        if (editor != null) {
            SelectionModel selectionModel = editor.getSelectionModel();
            if (selectionModel.hasSelection()) {
                this.handleSelection(editor, selectionModel);
            } else {
                this.handleNoSelection(editor);
            }
        }
    }

    private void handleSelection(Editor editor, SelectionModel selectionModel) {
        Document doc = editor.getDocument();
        int start = selectionModel.getSelectionStart();
        int end = selectionModel.getSelectionEnd();
        char[] allChars = doc.getChars();
        StringBuilder selection = new StringBuilder();
        selection.append(allChars, start, end - start);
        String text = this.caseTransformer.transform(selection.toString());
        doc.deleteString(start, end);
        doc.insertString(start, text);
        selectionModel.setSelection(start, start + text.length());
    }

    private void handleNoSelection(Editor editor) {
        CaretModel caretModel = editor.getCaretModel();
        Document doc = editor.getDocument();
        if (doc.getTextLength() != 0) {
            char[] allChars = doc.getChars();
            int maxOffset = allChars.length;

            int startOffset;
            for(startOffset = caretModel.getOffset(); startOffset < maxOffset && !Character.isLetterOrDigit(allChars[startOffset]); ++startOffset) {

            }

            StringBuffer word = new StringBuffer();

            int newOffset;
            for(newOffset = startOffset; newOffset < maxOffset && Character.isLetterOrDigit(allChars[newOffset]); ++newOffset) {
                word.append(allChars[newOffset]);
            }

            if (word.length() > 0) {
                String text = this.caseTransformer.transform(word.toString());
                newOffset = startOffset + word.length();
                doc.deleteString(startOffset, newOffset);
                doc.insertString(startOffset, text);
                caretModel.moveToOffset(newOffset);
            }

        }
    }
}
