/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << HwRAM_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMAttribute extends HwMemoryAttribute {
    public static final String STEREOTYPE_NAME = "HwRAM_Attribute";

    public static final String HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE = "HwRAM_Attribute_isNonVolatile";

    public static final String HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE = "HwRAM_Attribute_isStatic";

    public static final String HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Attribute_isSynchronous";

    public static final String HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE = "HwRAM_Attribute_organization";

    public static final String HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE = "HwRAM_Attribute_repl_Policy";

    public static final String HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE = "HwRAM_Attribute_writePolicy";

    /**
     * Tells whether a {@link HwRAMAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwRAM_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwRAM_Attribute >> then instantiate a {@link HwRAMAttribute} proxy.
     * 
     * @return a {@link HwRAMAttribute} proxy on the created {@link Attribute}.
     */
    public static HwRAMAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAttribute.STEREOTYPE_NAME);
        return HwRAMAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMAttribute} proxy from a {@link Attribute} stereotyped << HwRAM_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwRAMAttribute} proxy or <i>null</i>.
     */
    public static HwRAMAttribute instantiate(final Attribute obj) {
        return HwRAMAttribute.canInstantiate(obj) ? new HwRAMAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMAttribute} proxy from a {@link Attribute} stereotyped << HwRAM_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwRAMAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwRAMAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwRAMAttribute.canInstantiate(obj))
        	return new HwRAMAttribute(obj);
        else
        	throw new IllegalArgumentException("HwRAMAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMAttribute other = (HwRAMAttribute) obj;
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
     * Getter for string property 'HwRAM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Attribute_organization() {
        return this.elt.getTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Attribute_repl_Policy() {
        return this.elt.getTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Attribute_writePolicy() {
        return this.elt.getTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Attribute_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Attribute_isNonVolatile() {
        return this.elt.isTagged(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Attribute_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Attribute_isStatic() {
        return this.elt.isTagged(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Attribute_isSynchronous() {
        return this.elt.isTagged(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Attribute_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Attribute_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Attribute_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Attribute_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Attribute_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Attribute_organization(final String value) {
        this.elt.putTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Attribute_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Attribute_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01593e70-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0c2-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0de-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015e0313-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8c8f071-170f-11df-b92a-0014222a9f79");
            HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8c8f072-170f-11df-b92a-0014222a9f79");
            HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8c8f073-170f-11df-b92a-0014222a9f79");
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
