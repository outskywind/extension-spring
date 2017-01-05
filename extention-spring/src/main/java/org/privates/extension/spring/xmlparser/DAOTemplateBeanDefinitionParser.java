package org.privates.extension.spring.xmlparser;

import org.privates.extension.factory.bean.MyBatisDAOTemplate;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class DAOTemplateBeanDefinitionParser extends AbstractSingleBeanDefinitionParser{
    
    protected Class<?> getBeanClass(Element element) {
        return MyBatisDAOTemplate.class;
    }
    
    /**
     * 定义如何解析遇到的顶级element，解析成BeanDefinition
     */
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        //1.获取attribute
        
    }

}
