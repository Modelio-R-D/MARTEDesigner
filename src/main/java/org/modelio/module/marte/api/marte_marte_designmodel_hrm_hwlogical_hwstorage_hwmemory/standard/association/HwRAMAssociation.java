/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwRAM_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMAssociation extends HwMemoryAssociation {
    public static final String STEREOTYPE_NAME = "HwRAM_Association";

    public static final String HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE = "HwRAM_Association_isNonVolatile";

    public static final String HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE = "HwRAM_Association_isStatic";

    public static final String HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Association_isSynchronous";

    public static final String HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE = "HwRAM_Association_organization";

    public static final String HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE = "HwRAM_Association_repl_Policy";

    public static final String HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE = "HwRAM_Association_writePolicy";

    /**
     * Tells whether a {@link HwRAMAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwRAM_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwRAM_Association >> then instantiate a {@link HwRAMAssociation} proxy.
     * 
     * @return a {@link HwRAMAssociation} proxy on the created {@link Association}.
     */
    public static HwRAMAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociation.STEREOTYPE_NAME);
        return HwRAMAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociation} proxy from a {@link Association} stereotyped << HwRAM_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwRAMAssociation} proxy or <i>null</i>.
     */
    public static HwRAMAssociation instantiate(final Association obj) {
        return HwRAMAssociation.canInstantiate(obj) ? new HwRAMAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociation} proxy from a {@link Association} stereotyped << HwRAM_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwRAMAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwRAMAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwRAMAssociation.canInstantiate(obj))
        	return new HwRAMAssociation(obj);
        else
        	throw new IllegalArgumentException("HwRAMAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMAssociation other = (HwRAMAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Association_organization() {
        return this.elt.getTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Association_repl_Policy() {
        return this.elt.getTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Association_writePolicy() {
        return this.elt.getTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Association_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Association_isNonVolatile() {
        return this.elt.isTagged(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Association_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Association_isStatic() {
        return this.elt.isTagged(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Association_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Association_isSynchronous() {
        return this.elt.isTagged(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Association_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Association_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Association_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Association_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Association_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Association_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Association_organization(final String value) {
        this.elt.putTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Association_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Association_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "071f4048-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "307b9f9d-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "307b9fa1-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "307b9fa2-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c4ca1c45-170f-11df-b92a-0014222a9f79");
            HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c4ca1c46-170f-11df-b92a-0014222a9f79");
            HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c4ca1c47-170f-11df-b92a-0014222a9f79");
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
