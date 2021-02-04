/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << CommunicationMedia_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("20ea83bb-6059-4899-81e4-fab13b69cdd4")
public class CommunicationMediaAssociationEnd extends ProcessingResourceAssociationEnd {
    @objid ("449d41ba-7fc7-4860-b7fb-39a03fb9609c")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_AssociationEnd";

    @objid ("50baf225-0b39-486c-8c41-5e3cda01b566")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE = "CommunicationMedia_AssociationEnd_blockT";

    @objid ("49705bd8-eeab-4228-a53c-ea464676df19")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE = "CommunicationMedia_AssociationEnd_capacity";

    @objid ("532d174b-7e65-42f7-b33a-3642fe9fab3d")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_AssociationEnd_elementSize";

    @objid ("14952deb-df70-449a-a0a4-508642f780d6")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE = "CommunicationMedia_AssociationEnd_packetT";

    @objid ("e9fb9008-a64a-4cd7-a649-05c75fb050eb")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE = "CommunicationMedia_AssociationEnd_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("580bb034-27d6-49eb-8072-35dab5fe27ed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >> then instantiate a {@link CommunicationMediaAssociationEnd} proxy.
     * 
     * @return a {@link CommunicationMediaAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("44ac6301-e165-4b4a-990c-ecd5cd11b7e1")
    public static CommunicationMediaAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociationEnd.STEREOTYPE_NAME);
        return CommunicationMediaAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link CommunicationMediaAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("2121bdba-e415-4ab7-b18b-850e6eb5ab08")
    public static CommunicationMediaAssociationEnd instantiate(final AssociationEnd obj) {
        return CommunicationMediaAssociationEnd.canInstantiate(obj) ? new CommunicationMediaAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link CommunicationMediaAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4cb93c70-958b-44fc-8e1d-e6cc6ce2c0d4")
    public static CommunicationMediaAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (CommunicationMediaAssociationEnd.canInstantiate(obj))
        	return new CommunicationMediaAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ea07f148-7e09-414e-88dc-1e6e0f093fa6")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CommunicationMediaAssociationEnd other = (CommunicationMediaAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7e7dd2c6-2025-4183-a439-84295766e5ce")
    public List<String> getCommunicationMedia_AssociationEnd_blockT() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4e863d87-327d-4440-973b-6eef21c24518")
    public List<String> getCommunicationMedia_AssociationEnd_capacity() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a056621-50db-4448-aed4-e2e634648d7a")
    public String getCommunicationMedia_AssociationEnd_elementSize() {
        return this.elt.getTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("84ec2d5c-21c1-4372-b42b-f90623c94671")
    public List<String> getCommunicationMedia_AssociationEnd_packetT() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03f9f048-88ab-4914-af76-ad08a0202e34")
    public String getCommunicationMedia_AssociationEnd_transmMode() {
        return this.elt.getTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("580327e7-e133-4ee8-83cc-1486dc576bef")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("9e1a291c-14f8-4d1c-acb5-d2ff85cf5cc3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2fe1b5f-cab0-4653-b0e4-29822278e593")
    public void setCommunicationMedia_AssociationEnd_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e15d45b-be4b-4408-be52-bf954075a3bf")
    public void setCommunicationMedia_AssociationEnd_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12c1a0ac-9d3b-4796-bf63-864592e38a5c")
    public void setCommunicationMedia_AssociationEnd_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("febffc14-3276-4217-9373-3f10586c0a6d")
    public void setCommunicationMedia_AssociationEnd_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6dd31648-2f5c-4ece-8078-9c1e09c52b41")
    public void setCommunicationMedia_AssociationEnd_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("901bbf1b-f102-44ab-8283-c88dc8ad3805")
    protected CommunicationMediaAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("a3567f59-c06a-42a3-9d4c-3492d39ba613")
    public static final class MdaTypes {
        @objid ("8e889915-1fdc-4576-81da-a42af45d6118")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aad9bec0-b482-40e0-abed-5859095865cb")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("1dac18ac-062d-446e-8286-95a00814736e")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT;

        @objid ("dcb5e272-ee0b-4e81-b79d-d49fcfbd0fe4")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT;

        @objid ("8be630c4-02c7-4a88-a93d-aac48190ab75")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT;

        @objid ("aa3e5aab-af09-4ce3-b9d6-73cff271cd4b")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("f6ffe87a-2c65-4ad9-a9a4-2850a52c0d76")
        private static Stereotype MDAASSOCDEP;

        @objid ("950716d9-096e-4bcd-9397-3a6507cc72fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("057e234a-4ba3-4bb9-9eee-ab4310d9c7eb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0095c02c-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c033-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c03a-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982281-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982288-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098228f-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
