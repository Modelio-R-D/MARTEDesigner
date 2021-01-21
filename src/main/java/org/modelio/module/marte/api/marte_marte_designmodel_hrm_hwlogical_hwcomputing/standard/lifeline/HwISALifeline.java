/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwISA_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6d81a816-193f-4b3e-b6f2-292e65ca995f")
public class HwISALifeline extends HwResourceLifeline {
    @objid ("fc61bccc-d1dd-4207-ba0c-9ec7e6ea62b0")
    public static final String STEREOTYPE_NAME = "HwISA_Lifeline";

    @objid ("e1fa016a-08fc-4064-9698-68b6af7caff8")
    public static final String HWISA_LIFELINE_FAMILY_TAGTYPE = "HwISA_Lifeline_family";

    @objid ("a1f9910d-3c3a-4d22-a5ca-c2eec2972660")
    public static final String HWISA_LIFELINE_INST_WIDTH_TAGTYPE = "HwISA_Lifeline_inst_Width";

    @objid ("079e4216-e64e-468b-bd3c-8f6660c43182")
    public static final String HWISA_LIFELINE_TYPE_TAGTYPE = "HwISA_Lifeline_type";

    /**
     * Tells whether a {@link HwISALifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwISA_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6b8cbc29-1ac1-4ca6-bb57-b0fa98e182fe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISALifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwISA_Lifeline >> then instantiate a {@link HwISALifeline} proxy.
     * 
     * @return a {@link HwISALifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("c38ff6da-d15e-49ef-90b1-23717930eb8b")
    public static HwISALifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISALifeline.STEREOTYPE_NAME);
        return HwISALifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwISALifeline} proxy from a {@link Lifeline} stereotyped << HwISA_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwISALifeline} proxy or <i>null</i>.
     */
    @objid ("d6398362-d3b5-4758-b6a7-f2658a68e3ae")
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
    @objid ("1b578c9b-6ccf-4940-9457-d80557af8233")
    public static HwISALifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwISALifeline.canInstantiate(obj))
        	return new HwISALifeline(obj);
        else
        	throw new IllegalArgumentException("HwISALifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f0f8331f-be1f-4944-9a25-da8fc9c017db")
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
    @objid ("10d6f914-eb90-4c6b-927e-0f3b359e3b00")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Lifeline_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0ed974f-0fd2-4811-8a5a-fbfc717612e9")
    public String getHwISA_Lifeline_family() {
        return this.elt.getTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Lifeline_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9020b8e2-2106-4f5c-9e2e-b2b62aee7cba")
    public String getHwISA_Lifeline_inst_Width() {
        return this.elt.getTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2d03cd7-515b-487d-b920-4d86c53095f2")
    public String getHwISA_Lifeline_type() {
        return this.elt.getTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_TYPE_TAGTYPE_ELT);
    }

    @objid ("811c5ae5-71d5-4b44-851e-a080d55cba71")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Lifeline_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2299288a-e709-48a8-a7fa-250011c8eaeb")
    public void setHwISA_Lifeline_family(final String value) {
        this.elt.putTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Lifeline_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("378d58d7-562f-491a-b310-2846ee86eeca")
    public void setHwISA_Lifeline_inst_Width(final String value) {
        this.elt.putTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c25d229f-0062-495d-91b3-96848f06d634")
    public void setHwISA_Lifeline_type(final String value) {
        this.elt.putTagValue(HwISALifeline.MdaTypes.HWISA_LIFELINE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("1a83f00b-4b9b-48ce-a68a-8c31fa4989ca")
    protected HwISALifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("c6b8c41b-ab2b-429b-9928-d7bdff9d1594")
    public static final class MdaTypes {
        @objid ("0dcd96a1-11d7-48ee-b0d7-12d5dcfc04bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0973c1cc-2567-483e-af44-6ab0ac94937d")
        public static TagType HWISA_LIFELINE_FAMILY_TAGTYPE_ELT;

        @objid ("68589d15-4748-4eaf-9ad1-a9100e8ad9c4")
        public static TagType HWISA_LIFELINE_INST_WIDTH_TAGTYPE_ELT;

        @objid ("a1d5dcc3-c9e4-4be1-833d-8e9dcc738e5a")
        public static TagType HWISA_LIFELINE_TYPE_TAGTYPE_ELT;

        @objid ("f42d118e-aaaf-4d0a-bc12-8f88c1487095")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d8a0379-ad92-46d9-8952-c45ef32e7a68")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b22c6436-ded4-4460-850f-9482796acde2")
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
