package com.github.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;

/**
 * Created by zachary on 2017/4/13.
 */
public class TestPlugin extends PluginAdapter {

    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        super.clientGenerated(interfaze, topLevelClass, introspectedTable);
        interfaze.addFileCommentLine("注释测试");
        Method method = new Method();
        method.setName("selectByMap");
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getNewListInstance());
        interfaze.addMethod(method);
        return true;
    }
}
