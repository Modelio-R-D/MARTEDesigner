/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << HwRAM_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMAssociationEnd extends HwMemoryAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwRAM_AssociationEnd";

    public static final String HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE = "HwRAM_AssociationEnd_isNonVolatile";

    public static final String HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE = "HwRAM_AssociationEnd_isStatic";

    public static final String HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE = "HwRAM_AssociationEnd_isSynchronous";

    public static final String HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE = "HwRAM_AssociationEnd_organization";

    public static final String HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE = "HwRAM_AssociationEnd_repl_Policy";

    public static final String HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE = "HwRAM_AssociationEnd_writePolicy";

    /**
     * Tells whether a {@link HwRAMAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >> then instantiate a {@link HwRAMAssociationEnd} proxy.
     * 
     * @return a {@link HwRAMAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwRAMAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociationEnd.STEREOTYPE_NAME);
        return HwRAMAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwRAMAssociationEnd} proxy or <i>null</i>.
     */
    public static HwRAMAssociationEnd instantiate(final AssociationEnd obj) {
        return HwRAMAssociationEnd.canInstantiate(obj) ? new HwRAMAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwRAMAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwRAMAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwRAMAssociationEnd.canInstantiate(obj))
        	return new HwRAMAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwRAMAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMAssociationEnd other = (HwRAMAssociationEnd) obj;
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
     * Getter for string property 'HwRAM_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_AssociationEnd_organization() {
        return this.elt.getTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_AssociationEnd_repl_Policy() {
        return this.elt.getTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_AssociationEnd_writePolicy() {
        return this.elt.getTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_AssociationEnd_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_AssociationEnd_isNonVolatile() {
        return this.elt.isTagged(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_AssociationEnd_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_AssociationEnd_isStatic() {
        return this.elt.isTagged(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_AssociationEnd_isSynchronous() {
        return this.elt.isTagged(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_AssociationEnd_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_AssociationEnd_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_AssociationEnd_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_AssociationEnd_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_AssociationEnd_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_AssociationEnd_organization(final String value) {
        this.elt.putTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_AssociationEnd_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_AssociationEnd_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01593e6e-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0c0-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0dc-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0e3-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ed528140-1bd9-11df-bc0b-0014222a9f79");
            HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ed528141-1bd9-11df-bc0b-0014222a9f79");
            HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ed528142-1bd9-11df-bc0b-0014222a9f79");
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
