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
        Method method = new Method();
        method.setName("selectByMap");
        method.setVisibility(JavaVisibility.PUBLIC);
        FullyQualifiedJavaType fullyQualifiedJavaType = FullyQualifiedJavaType.getNewListInstance();
        fullyQualifiedJavaType.addTypeArgument(new FullyQualifiedJavaType(introspectedTable.getBaseRecordType()));
        method.setReturnType(fullyQualifiedJavaType);
        Parameter parameter = new Parameter(FullyQualifiedJavaType.getNewMapInstance(),"map");
        method.addParameter(parameter);
        interfaze.addMethod(method);

        context.getCommentGenerator()
                .addGeneralMethodComment(method,introspectedTable);

        return true;
    }
}
