/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml.diagram;

import org.docx4j.dml.ArrayListDml;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_ColorTransformHeaderLst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ColorTransformHeaderLst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colorsDefHdr" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_ColorTransformHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ColorTransformHeaderLst", propOrder = {
    "colorsDefHdr"
})
public class CTColorTransformHeaderLst {

    protected List<CTColorTransformHeader> colorsDefHdr  = new ArrayListDml<CTColorTransformHeader>(this);

    /**
     * Gets the value of the colorsDefHdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorsDefHdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorsDefHdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTColorTransformHeader }
     * 
     * 
     */
    public List<CTColorTransformHeader> getColorsDefHdr() {
        if (colorsDefHdr == null) {
            colorsDefHdr = new ArrayListDml<CTColorTransformHeader>(this);
        }
        return this.colorsDefHdr;
    }

}
