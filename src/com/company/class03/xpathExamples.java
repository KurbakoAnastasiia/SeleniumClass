package com.company.class03;

public class xpathExamples {
    /*Syntax for relative xpath:
//tagname[@attribute = 'attribute value']

Example: //input[@id = 'twotabsearchtextbox']

Identifying element by xpath and using text:
//tagname[text() = 'text value']

Contains: will identify an element with a partial attribute value
//tagname[contains(@attribute, 'attribute value')]

Example: //input[contains(@placeholder, 'Phone')]
         //a[contains(text(), 'Forgot')]


Starts with: will identify the element with starting partial value
            //tagname[starts-with(@attribute, 'attribute value')]

Example: //h2[starts-with(text(), 'Connect')]
            //button[starts-with(@name, 'log')]

Ends-with was used in xpath 1.0, we are using xpath 2.0 and this method is disabled

<li> -- list
<ul> -- unordered list
<ol> -- ordered list
<div> -- division
<img> -- image
<p> -- paragraph
<h> -- header

Advanced xpath:
is based on parent and child, sibling relationships

identifying elements by following sibling
//tagName[@attribute='attribute value']/following-sibling::tagName
//input[@id = 'calFromDate']/following-sibling::img

identifying elements by preceding sibling
//tagName[@attribute='attribute value']/preceding-sibling::tagName
//span[text() = '& Orders']/preceding-sibling::span

identifying elements by its parent
//tagname[@attribute='attribute value']/parent::ParentTagName
//span[text() = '& Orders']/parent::a

identifying elements by its ancestor
//input[@id = 'email']/ancestor::form

identifying elements by its index
(//img[@class = 'ui-datepicker-trigger'])[2]*/
}
