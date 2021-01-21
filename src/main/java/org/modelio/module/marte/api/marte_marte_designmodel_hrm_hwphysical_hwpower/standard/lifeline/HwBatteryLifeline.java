/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwBattery_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("947b6554-06be-49b1-bd91-d32636c2b255")
public class HwBatteryLifeline extends HwPowerSupplyLifeline {
    @objid ("e0216e60-78c0-46d6-90ff-3b665d05612a")
    public static final String STEREOTYPE_NAME = "HwBattery_Lifeline";

    @objid ("3233c3cf-3470-4eac-b3be-0950a65aa680")
    public static final String HWBATTERY_LIFELINE_CAPACITY_TAGTYPE = "HwBattery_Lifeline_capacity";

    /**
     * Tells whether a {@link HwBatteryLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwBattery_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7cb9a622-0a6e-4369-abcb-04271125e64a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwBattery_Lifeline >> then instantiate a {@link HwBatteryLifeline} proxy.
     * 
     * @return a {@link HwBatteryLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("46434867-f75e-41fa-80be-96022a6a9f3d")
    public static HwBatteryLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryLifeline.STEREOTYPE_NAME);
        return HwBatteryLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryLifeline} proxy from a {@link Lifeline} stereotyped << HwBattery_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwBatteryLifeline} proxy or <i>null</i>.
     */
    @objid ("94dc33c6-3cf6-438f-bb2b-a0446960ae42")
    public static HwBatteryLifeline instantiate(final Lifeline obj) {
        return HwBatteryLifeline.canInstantiate(obj) ? new HwBatteryLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryLifeline} proxy from a {@link Lifeline} stereotyped << HwBattery_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwBatteryLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2e0cdf70-4bd8-4aa8-9dcd-308dd2a52362")
    public static HwBatteryLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwBatteryLifeline.canInstantiate(obj))
        	return new HwBatteryLifeline(obj);
        else
        	throw new IllegalArgumentException("HwBatteryLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("866fd3f4-78ff-43bf-a89f-276e3f1bbe77")
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
        HwBatteryLifeline other = (HwBatteryLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("76a96ffa-541d-45c0-9565-9b824bf1aa59")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37d39ea7-4846-4e31-860b-a48a7e277e1e")
    public String getHwBattery_Lifeline_capacity() {
        return this.elt.getTagValue(HwBatteryLifeline.MdaTypes.HWBATTERY_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("b80db726-a8a3-43a5-a853-01e57795a6b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5198b18-6f33-4ba3-ba04-9ba1aff01348")
    public void setHwBattery_Lifeline_capacity(final String value) {
        this.elt.putTagValue(HwBatteryLifeline.MdaTypes.HWBATTERY_LIFELINE_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("ef5520fe-ebfc-45b6-858e-05be77c8e501")
    protected HwBatteryLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("3964e044-c4dc-46d0-aec3-ef55277cb3b1")
    public static final class MdaTypes {
        @objid ("0a3cb44e-4728-423e-9650-3eddc53abdbe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eb247bfd-eae8-4d26-af83-6b4f2bfbfbb5")
        public static TagType HWBATTERY_LIFELINE_CAPACITY_TAGTYPE_ELT;

        @objid ("d3ca681e-52ec-447b-a066-8af09b2a4aeb")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e68158a-d6f8-4cae-8e15-43f53c7d6928")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c911773-d7d2-4b8d-9875-0f9e355e8453")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf20-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_LIFELINE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563d3176-c7b2-11df-ad39-001302895b2b");
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
