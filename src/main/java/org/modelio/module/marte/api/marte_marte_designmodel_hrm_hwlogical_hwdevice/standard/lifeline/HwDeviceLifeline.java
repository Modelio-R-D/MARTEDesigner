/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwDevice_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("04730c34-7eb9-4654-afb3-4417e3fde759")
public class HwDeviceLifeline extends HwResourceLifeline {
    @objid ("02f9c4ef-b373-495f-ba44-3bee0cc8d787")
    public static final String STEREOTYPE_NAME = "HwDevice_Lifeline";

    @objid ("20fc1e9e-889a-407a-902b-8f2df2a9317d")
    public static final String HWDEVICE_LIFELINE_MAINSCHEDULER_TAGTYPE = "HwDevice_Lifeline_mainScheduler";

    @objid ("0b79ebc7-71b0-4e87-ba81-224e0fe1fbfe")
    public static final String HWDEVICE_LIFELINE_SPEEDFACTOR_TAGTYPE = "HwDevice_Lifeline_speedFactor";

    /**
     * Tells whether a {@link HwDeviceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwDevice_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3075275e-0e56-48d2-994f-af803c2ea515")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwDevice_Lifeline >> then instantiate a {@link HwDeviceLifeline} proxy.
     * 
     * @return a {@link HwDeviceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("5b28be5d-4a10-4345-8f30-f45c570dbb05")
    public static HwDeviceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceLifeline.STEREOTYPE_NAME);
        return HwDeviceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceLifeline} proxy from a {@link Lifeline} stereotyped << HwDevice_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwDeviceLifeline} proxy or <i>null</i>.
     */
    @objid ("fbb6a952-9d5f-4e97-8949-3e86bdcda135")
    public static HwDeviceLifeline instantiate(final Lifeline obj) {
        return HwDeviceLifeline.canInstantiate(obj) ? new HwDeviceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceLifeline} proxy from a {@link Lifeline} stereotyped << HwDevice_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwDeviceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f70e95d4-db48-46fe-9905-ee147d33e78c")
    public static HwDeviceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwDeviceLifeline.canInstantiate(obj))
        	return new HwDeviceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwDeviceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("421c2fee-3a6b-4430-af17-9a92d9ad5df6")
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
        HwDeviceLifeline other = (HwDeviceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("83a48aa4-f50e-44bc-9be6-1d61bf30547c")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eeadb37c-7009-4867-aa23-03ae04971419")
    public String getHwDevice_Lifeline_mainScheduler() {
        return this.elt.getTagValue(HwDeviceLifeline.MdaTypes.HWDEVICE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2486f7bf-33ae-4787-9add-c24a0b6e8490")
    public String getHwDevice_Lifeline_speedFactor() {
        return this.elt.getTagValue(HwDeviceLifeline.MdaTypes.HWDEVICE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("dcd61b0e-3be0-47fc-9495-8b1993a5fabe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09ec52f2-09d4-483b-842d-eec2a88089e8")
    public void setHwDevice_Lifeline_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceLifeline.MdaTypes.HWDEVICE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65331171-6e88-4fd8-9b12-415b69c2e160")
    public void setHwDevice_Lifeline_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceLifeline.MdaTypes.HWDEVICE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("5c5877c3-fb0c-46c0-a274-eb0f203e8b0a")
    protected HwDeviceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("6975b15c-d6c9-4629-b1f4-680fe3bd55e1")
    public static final class MdaTypes {
        @objid ("20585b29-14e1-461e-944e-3b1854838675")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a95c06f3-2de2-451c-b958-a533d4a62877")
        public static TagType HWDEVICE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("9f94e8d9-1f11-4bdb-bc10-ab47c3f2eb4b")
        public static TagType HWDEVICE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("18ebcf2b-57bc-46ca-9932-05843a482beb")
        private static Stereotype MDAASSOCDEP;

        @objid ("4d233869-23a6-4c6c-96b8-b1b4659df694")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2ff5be31-dba1-475c-9007-b25d897f5ad4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cd609dba-10b0-11df-81d9-0014222a9f79");
            HWDEVICE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "538b693a-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "538b693b-92ab-11e0-a69d-0027103f347c");
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
