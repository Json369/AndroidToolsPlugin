package org.sssta.androidtools.posfix;

import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.sssta.androidtools.posfix.template.ClickListenerPostfixTemplate;
import org.sssta.androidtools.posfix.template.ToastPostfixTemplate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cauchywei on 15/8/15.
 */
public class AndroidPostfixTemplateProvider extends JavaPostfixTemplateProvider {
    private final HashSet<PostfixTemplate> templates;

    public AndroidPostfixTemplateProvider() {
        templates = ContainerUtil.<PostfixTemplate>newHashSet(
                new ToastPostfixTemplate(),
                new ClickListenerPostfixTemplate()
        );
    }

    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }
}
