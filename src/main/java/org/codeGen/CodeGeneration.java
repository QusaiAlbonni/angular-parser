package org.codeGen;



import org.classes.Program;
import org.classes.Statement;

import java.util.ArrayList;
import java.util.List;

public class CodeGeneration {
    private List<Page> pages = new ArrayList<>();
    private Page currentPage;

    /** إنشاء صفحة JS */
    public void createJSPage(String name) {
        Page page = new Page(name + ".js");
        currentPage = page;
        pages.add(page);
    }

    /** إنشاء صفحة HTML */
    public void createHTMLPage(String name, String bodyContent, String scriptPath) {
        Page page = new Page(name + ".html");
        String html = buildHtmlTemplate(bodyContent, scriptPath);
        page.write(html);
        page.close();
        pages.add(page);
    }

    /** توليد الكود النهائي من برنامج Program */
    public void generateProgram(Program program) {
        if (program == null) return;

        createJSPage("global");
        StringBuilder jsCode = new StringBuilder();
        for (Statement stmt : program.getStatements()) {
            if (stmt != null) jsCode.append(stmt.generate()).append("\n");
        }
        currentPage.write(jsCode.toString());
        currentPage.close();
    }

    /** قالب HTML */
    private String buildHtmlTemplate(String bodyContent, String scriptPath) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "    <script src=\"" + scriptPath + "\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                bodyContent +
                "\n</body>\n" +
                "</html>\n";
    }

    /** الحصول على آخر صفحة */
    public Page getCurrentPage() {
        return currentPage;
    }

    /** الحصول على جميع الصفحات */
    public List<Page> getPages() {
        return pages;
    }
}

