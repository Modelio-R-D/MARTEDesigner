/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwISA_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwISALifeline extends HwResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwISA_Lifeline";

    public static final String HWISA_LIFELINE_FAMILY_TAGTYPE = "HwISA_Lifeline_family";

    public static final String HWISA_LIFELINE_INST_WIDTH_TAGTYPE = "HwISA_Lifeline_inst_Width";

    public static final String HWISA_LIFELINE_TYPE_TAGTYPE = "HwISA_Lifeline_type";

    /**
     * Tells whether a {@link HwISALifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwISA_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISALifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwISA_Lifeline >> then instantiate a {@link HwISALifeline} proxy.
     * 
     * @return a {@link HwISALifeline} proxy on the created {@link Lifeline}.
     */
    public static HwISALifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISALifeline.STEREOTYPE_NAME);
        return HwISALifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwISALifeline} proxy from a {@link Lifeline} stereotyped << HwISA_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwISALifeline} proxy or <i>null</i>.
     */
    public static HwISALifeline instantiate(final Lifeline obj) {
        return HwISALifeline.canInstantiate(obj) ? new HwISALifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISALifeline} proxy from a {@link Lifeline} stereotyped << HwISA_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwISALifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwISALifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwISALifeline.canInstantiate(obj))
        	return new HwISALifeline(obj);
        else
        	throw new IllegalArgumentException("HwISALifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwISALifeline other = (HwISALifeline) obj;
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
     * Getter for string property 'HwISA_Lifeline_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Lifeline_family() {
        return this.elt.getTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Lifeline_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Lifeline_inst_Width() {
        return this.elt.getTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Lifeline_type() {
        return this.elt.getTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Lifeline_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Lifeline_family(final String value) {
        this.elt.putTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Lifeline_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Lifeline_inst_Width(final String value) {
        this.elt.putTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Lifeline_type(final String value) {
        this.elt.putTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_TYPE_TAGTYPE_ELT, value);
    }

    protected HwISALifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWISA_LIFELINE_FAMILY_TAGTYPE_ELT;

        public static TagType HWISA_LIFELINE_INST_WIDTH_TAGTYPE_ELT;

        public static TagType HWISA_LIFELINE_TYPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3a10f12f-10a7-11df-81d9-0014222a9f79");
            HWISA_LIFELINE_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3a10f130-10a7-11df-81d9-0014222a9f79");
            HWISA_LIFELINE_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3a10f131-10a7-11df-81d9-0014222a9f79");
            HWISA_LIFELINE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3a10f132-10a7-11df-81d9-0014222a9f79");
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
