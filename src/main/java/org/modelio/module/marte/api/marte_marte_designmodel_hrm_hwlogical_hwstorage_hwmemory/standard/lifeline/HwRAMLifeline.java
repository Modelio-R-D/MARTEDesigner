/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("0f929628-bc2c-4c30-9bbe-b6e90935fe0a")
public class HwRAMLifeline extends HwMemoryLifeline {
    @objid ("4aef0e8c-64b4-4ee4-bbc7-f3a6fd4d4f33")
    public static final String STEREOTYPE_NAME = "HwRAM_Lifeline";

    @objid ("fe29135d-db7d-4ea7-82f3-300b7d16c34b")
    public static final String HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE = "HwRAM_Lifeline_isNonVolatile";

    @objid ("fd02b28e-e129-44df-9b7e-bfad004ecdfb")
    public static final String HWRAM_LIFELINE_ISSTATIC_TAGTYPE = "HwRAM_Lifeline_isStatic";

    @objid ("59801d62-04a2-4d74-9f2b-9f850c996dd6")
    public static final String HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Lifeline_isSynchronous";

    @objid ("6147516f-dfa6-4997-834e-39044c14455b")
    public static final String HWRAM_LIFELINE_ORGANIZATION_TAGTYPE = "HwRAM_Lifeline_organization";

    @objid ("258a43e4-2d73-4aa6-93a6-2574c5b64103")
    public static final String HWRAM_LIFELINE_REPL_POLICY_TAGTYPE = "HwRAM_Lifeline_repl_Policy";

    @objid ("de4b712a-2b08-4dc7-82aa-d7a853c588a8")
    public static final String HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE = "HwRAM_Lifeline_writePolicy";

    /**
     * Tells whether a {@link HwRAMLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwRAM_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b1e0864d-5ead-4f33-b4d9-5696dc976c36")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwRAM_Lifeline >> then instantiate a {@link HwRAMLifeline} proxy.
     * 
     * @return a {@link HwRAMLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("ec21dcae-2eb6-45c8-add0-895da4b5b970")
    public static HwRAMLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLifeline.STEREOTYPE_NAME);
        return HwRAMLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMLifeline} proxy from a {@link Lifeline} stereotyped << HwRAM_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwRAMLifeline} proxy or <i>null</i>.
     */
    @objid ("88424bdd-945a-4823-a1b2-817b7731e898")
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
    @objid ("9941fa24-8de3-4dcc-bef9-97f6055f3521")
    public static HwRAMLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwRAMLifeline.canInstantiate(obj))
        	return new HwRAMLifeline(obj);
        else
        	throw new IllegalArgumentException("HwRAMLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5354c588-9d96-4c19-95ba-9a9e85ce5373")
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
    @objid ("063d94a4-240c-4754-8230-cf01a0f3386e")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("309ea3e3-bf5c-4b08-8f48-afb6812b4390")
    public String getHwRAM_Lifeline_organization() {
        return this.elt.getTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Lifeline_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("697c7e59-f2e7-4577-9222-83dd889a1cc8")
    public String getHwRAM_Lifeline_repl_Policy() {
        return this.elt.getTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Lifeline_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64e5603c-aa50-40f1-8d84-14cce5f82489")
    public String getHwRAM_Lifeline_writePolicy() {
        return this.elt.getTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("1cfae98b-8d28-4302-b68d-70aa040493a5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Lifeline_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d50c438-ee7e-4343-ba3f-10ea3b94ec52")
    public boolean isHwRAM_Lifeline_isNonVolatile() {
        return this.elt.isTagged(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Lifeline_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("976d396c-013a-4bd7-8a27-760800c0a882")
    public boolean isHwRAM_Lifeline_isStatic() {
        return this.elt.isTagged(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Lifeline_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("25c4dd55-803f-44fb-8957-3208f14fc376")
    public boolean isHwRAM_Lifeline_isSynchronous() {
        return this.elt.isTagged(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Lifeline_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("573c8006-295b-4dab-8b00-19a557dcc6a0")
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
    @objid ("6f8b130b-d57b-4ddf-9fa5-30cb2dcc1bc2")
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
    @objid ("0090ea29-9d24-48e8-884a-25803cb7f8bb")
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
    @objid ("50a30891-2341-43eb-9233-a30e51e829d6")
    public void setHwRAM_Lifeline_organization(final String value) {
        this.elt.putTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Lifeline_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("899a1ded-cc4c-4210-979e-5d65255ea47d")
    public void setHwRAM_Lifeline_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Lifeline_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb567bfd-4fa8-4d12-90ed-62cbe3d700e1")
    public void setHwRAM_Lifeline_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMLifeline.MdaTypes.HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("ef9b85de-a773-4b7d-a318-3754c2d2fa44")
    protected HwRAMLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("54391742-09cf-42c8-9ef5-002bff9ad323")
    public static final class MdaTypes {
        @objid ("d79fc01e-e27c-43aa-9985-be615282dd8a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e58c9b5c-a238-4e2a-8f96-3c0d60ef643a")
        public static TagType HWRAM_LIFELINE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("2640f05f-5593-41c3-bd70-f3c08081b13f")
        public static TagType HWRAM_LIFELINE_REPL_POLICY_TAGTYPE_ELT;

        @objid ("c92db467-d5df-4973-bf28-3e993a782ec5")
        public static TagType HWRAM_LIFELINE_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("13278af1-da0a-427d-9ae3-835ac3e04db3")
        public static TagType HWRAM_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("dc18d7ac-94b4-4b6d-87e0-b877fac3fd68")
        public static TagType HWRAM_LIFELINE_ISSTATIC_TAGTYPE_ELT;

        @objid ("9c7dc521-778c-488d-828c-d952f9842176")
        public static TagType HWRAM_LIFELINE_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("50fcd13b-0fa0-4a69-a8ed-c59dd264aa60")
        private static Stereotype MDAASSOCDEP;

        @objid ("19e1ee15-cea5-43f9-986c-9717eae2b144")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("20ed164a-e666-471e-9bc4-9d33c1b2025c")
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
