/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link AssociationEnd} with << HwBus_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwBusAssociationEnd extends HwMediaAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwBus_AssociationEnd";

    public static final String HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE = "HwBus_AssociationEnd_adressWidth";

    public static final String HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE = "HwBus_AssociationEnd_isSerial";

    public static final String HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE = "HwBus_AssociationEnd_isSynchronous";

    public static final String HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE = "HwBus_AssociationEnd_wordWidth";

    /**
     * Tells whether a {@link HwBusAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >> then instantiate a {@link HwBusAssociationEnd} proxy.
     * 
     * @return a {@link HwBusAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwBusAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociationEnd.STEREOTYPE_NAME);
        return HwBusAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBusAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBusAssociationEnd} proxy or <i>null</i>.
     */
    public static HwBusAssociationEnd instantiate(final AssociationEnd obj) {
        return HwBusAssociationEnd.canInstantiate(obj) ? new HwBusAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwBusAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwBusAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBusAssociationEnd.canInstantiate(obj))
        	return new HwBusAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBusAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBusAssociationEnd other = (HwBusAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_AssociationEnd_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_AssociationEnd_adressWidth() {
        return this.elt.getTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_AssociationEnd_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_AssociationEnd_wordWidth() {
        return this.elt.getTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_AssociationEnd_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_AssociationEnd_isSerial() {
        return this.elt.isTagged(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_AssociationEnd_isSynchronous() {
        return this.elt.isTagged(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_AssociationEnd_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_AssociationEnd_adressWidth(final String value) {
        this.elt.putTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_AssociationEnd_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_AssociationEnd_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_AssociationEnd_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_AssociationEnd_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_AssociationEnd_wordWidth(final String value) {
        this.elt.putTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwBusAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01167d78-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d7f-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d86-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d8d-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d94-0ccf-11df-8525-001302895b2b");
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
