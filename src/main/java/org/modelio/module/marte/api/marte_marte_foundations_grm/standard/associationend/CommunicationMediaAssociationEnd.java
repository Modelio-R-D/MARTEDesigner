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
public class CommunicationMediaAssociationEnd extends ProcessingResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "CommunicationMedia_AssociationEnd";

    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE = "CommunicationMedia_AssociationEnd_blockT";

    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE = "CommunicationMedia_AssociationEnd_capacity";

    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_AssociationEnd_elementSize";

    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE = "CommunicationMedia_AssociationEnd_packetT";

    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE = "CommunicationMedia_AssociationEnd_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >> then instantiate a {@link CommunicationMediaAssociationEnd} proxy.
     * 
     * @return a {@link CommunicationMediaAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
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
    public static CommunicationMediaAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (CommunicationMediaAssociationEnd.canInstantiate(obj))
        	return new CommunicationMediaAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public List<String> getCommunicationMedia_AssociationEnd_blockT() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_AssociationEnd_capacity() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_AssociationEnd_elementSize() {
        return this.elt.getTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_AssociationEnd_packetT() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_AssociationEnd_transmMode() {
        return this.elt.getTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_AssociationEnd_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_AssociationEnd_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_AssociationEnd_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_AssociationEnd_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_AssociationEnd_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected CommunicationMediaAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
