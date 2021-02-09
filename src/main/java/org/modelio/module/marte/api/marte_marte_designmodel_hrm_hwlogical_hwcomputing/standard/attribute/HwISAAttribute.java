/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwISA_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwISAAttribute extends HwResourceAttribute {
    public static final String STEREOTYPE_NAME = "HwISA_Attribute";

    public static final String HWISA_ATTRIBUTE_FAMILY_TAGTYPE = "HwISA_Attribute_family";

    public static final String HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE = "HwISA_Attribute_inst_Width";

    public static final String HWISA_ATTRIBUTE_TYPE_TAGTYPE = "HwISA_Attribute_type";

    /**
     * Tells whether a {@link HwISAAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwISA_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwISA_Attribute >> then instantiate a {@link HwISAAttribute} proxy.
     * 
     * @return a {@link HwISAAttribute} proxy on the created {@link Attribute}.
     */
    public static HwISAAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAttribute.STEREOTYPE_NAME);
        return HwISAAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwISAAttribute} proxy from a {@link Attribute} stereotyped << HwISA_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwISAAttribute} proxy or <i>null</i>.
     */
    public static HwISAAttribute instantiate(final Attribute obj) {
        return HwISAAttribute.canInstantiate(obj) ? new HwISAAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAAttribute} proxy from a {@link Attribute} stereotyped << HwISA_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwISAAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwISAAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwISAAttribute.canInstantiate(obj))
        	return new HwISAAttribute(obj);
        else
        	throw new IllegalArgumentException("HwISAAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwISAAttribute other = (HwISAAttribute) obj;
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
     * Getter for string property 'HwISA_Attribute_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Attribute_family() {
        return this.elt.getTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Attribute_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Attribute_inst_Width() {
        return this.elt.getTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Attribute_type() {
        return this.elt.getTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Attribute_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Attribute_family(final String value) {
        this.elt.putTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Attribute_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Attribute_inst_Width(final String value) {
        this.elt.putTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Attribute_type(final String value) {
        this.elt.putTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    protected HwISAAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT;

        public static TagType HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT;

        public static TagType HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f77f4f-0ccf-11df-8525-001302895b2b");
            HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f56-0ccf-11df-8525-001302895b2b");
            HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f5d-0ccf-11df-8525-001302895b2b");
            HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f64-0ccf-11df-8525-001302895b2b");
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
