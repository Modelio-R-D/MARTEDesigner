/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwRAM_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMLifeline extends HwMemoryLifeline {
    public static final String STEREOTYPE_NAME = "HwRAM_Lifeline";

    public static final String HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE = "HwRAM_Lifeline_isNonVolatile";

    public static final String HWRAM_LIFELINE_ISSTATIC_TAGTYPE = "HwRAM_Lifeline_isStatic";

    public static final String HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Lifeline_isSynchronous";

    public static final String HWRAM_LIFELINE_ORGANIZATION_TAGTYPE = "HwRAM_Lifeline_organization";

    public static final String HWRAM_LIFELINE_REPL_POLICY_TAGTYPE = "HwRAM_Lifeline_repl_Policy";

    public static final String HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE = "HwRAM_Lifeline_writePolicy";

    /**
     * Tells whether a {@link HwRAMLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwRAM_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwRAM_Lifeline >> then instantiate a {@link HwRAMLifeline} proxy.
     * 
     * @return a {@link HwRAMLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwRAMLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLifeline.STEREOTYPE_NAME);
        return HwRAMLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMLifeline} proxy from a {@link Lifeline} stereotyped << HwRAM_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwRAMLifeline} proxy or <i>null</i>.
     */
    public static HwRAMLifeline instantiate(final Lifeline obj) {
        return HwRAMLifeline.canInstantiate(obj) ? new HwRAMLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMLifeline} proxy from a {@link Lifeline} stereotyped << HwRAM_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwRAMLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwRAMLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwRAMLifeline.canInstantiate(obj))
        	return new HwRAMLifeline(obj);
        else
        	throw new IllegalArgumentException("HwRAMLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMLifeline other = (HwRAMLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Lifeline_organization() {
        return this.elt.getTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Lifeline_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Lifeline_repl_Policy() {
        return this.elt.getTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Lifeline_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Lifeline_writePolicy() {
        return this.elt.getTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Lifeline_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Lifeline_isNonVolatile() {
        return this.elt.isTagged(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Lifeline_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Lifeline_isStatic() {
        return this.elt.isTagged(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Lifeline_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Lifeline_isSynchronous() {
        return this.elt.isTagged(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Lifeline_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Lifeline_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Lifeline_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Lifeline_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Lifeline_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Lifeline_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Lifeline_organization(final String value) {
        this.elt.putTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Lifeline_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Lifeline_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Lifeline_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Lifeline_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_LIFELINE_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_LIFELINE_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_LIFELINE_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1209920c-1007-11df-86fe-0014222a9f79");
            HWRAM_LIFELINE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "320040d4-1007-11df-86fe-0014222a9f79");
            HWRAM_LIFELINE_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "320040d8-1007-11df-86fe-0014222a9f79");
            HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "320040d9-1007-11df-86fe-0014222a9f79");
            HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c2a5bd9d-170f-11df-b92a-0014222a9f79");
            HWRAM_LIFELINE_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c2a5bd9e-170f-11df-b92a-0014222a9f79");
            HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c2a5bd9f-170f-11df-b92a-0014222a9f79");
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
