package org.privates.extension.spring;

import org.privates.extension.spring.xmlparser.DAOTemplateBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class SpringExtensionHandler extends  NamespaceHandlerSupport {

    public void init() {
        // TODO Auto-generated method stub
        registerBeanDefinitionParser("daoTemplate", new DAOTemplateBeanDefinitionParser());
    }

}
