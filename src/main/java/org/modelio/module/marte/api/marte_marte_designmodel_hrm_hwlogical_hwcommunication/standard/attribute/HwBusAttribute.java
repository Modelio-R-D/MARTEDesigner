/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwBus_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwBusAttribute extends HwMediaAttribute {
    public static final String STEREOTYPE_NAME = "HwBus_Attribute";

    public static final String HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE = "HwBus_Attribute_adressWidth";

    public static final String HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE = "HwBus_Attribute_isSerial";

    public static final String HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE = "HwBus_Attribute_isSynchronous";

    public static final String HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE = "HwBus_Attribute_wordWidth";

    /**
     * Tells whether a {@link HwBusAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwBus_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwBus_Attribute >> then instantiate a {@link HwBusAttribute} proxy.
     * 
     * @return a {@link HwBusAttribute} proxy on the created {@link Attribute}.
     */
    public static HwBusAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAttribute.STEREOTYPE_NAME);
        return HwBusAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwBusAttribute} proxy from a {@link Attribute} stereotyped << HwBus_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwBusAttribute} proxy or <i>null</i>.
     */
    public static HwBusAttribute instantiate(final Attribute obj) {
        return HwBusAttribute.canInstantiate(obj) ? new HwBusAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusAttribute} proxy from a {@link Attribute} stereotyped << HwBus_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwBusAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwBusAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwBusAttribute.canInstantiate(obj))
        	return new HwBusAttribute(obj);
        else
        	throw new IllegalArgumentException("HwBusAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBusAttribute other = (HwBusAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Attribute_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_Attribute_adressWidth() {
        return this.elt.getTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Attribute_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_Attribute_wordWidth() {
        return this.elt.getTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Attribute_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_Attribute_isSerial() {
        return this.elt.isTagged(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_Attribute_isSynchronous() {
        return this.elt.isTagged(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Attribute_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Attribute_adressWidth(final String value) {
        this.elt.putTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Attribute_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Attribute_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Attribute_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Attribute_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Attribute_wordWidth(final String value) {
        this.elt.putTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwBusAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01167d7a-0ccf-11df-8525-001302895b2b");
            HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d81-0ccf-11df-8525-001302895b2b");
            HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d88-0ccf-11df-8525-001302895b2b");
            HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a9a75921-1707-11df-b92a-0014222a9f79");
            HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a9a75922-1707-11df-b92a-0014222a9f79");
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
