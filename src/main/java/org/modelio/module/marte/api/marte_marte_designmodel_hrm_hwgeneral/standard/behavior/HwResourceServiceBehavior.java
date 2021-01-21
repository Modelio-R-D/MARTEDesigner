/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.GrServiceBehavior;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Behavior} with << HwResourceService_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("725e8c6b-8cc9-419e-974f-955027d97b3d")
public class HwResourceServiceBehavior extends GrServiceBehavior {
    @objid ("de3a487b-8528-4406-8161-6a11722633d6")
    public static final String STEREOTYPE_NAME = "HwResourceService_Behavior";

    @objid ("59b643d6-0ac6-4148-8646-5643a46d1db0")
    public static final String HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE = "HwResourceService_Behavior_consumption";

    @objid ("454d9837-3fc1-4181-ba39-89771e6f06d2")
    public static final String HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE = "HwResourceService_Behavior_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << HwResourceService_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d0565e3d-45a3-4a05-ba61-db794a2537ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << HwResourceService_Behavior >> then instantiate a {@link HwResourceServiceBehavior} proxy.
     * 
     * @return a {@link HwResourceServiceBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("282346d5-5aef-4de4-9cd3-b0e32fa0e1e4")
    public static HwResourceServiceBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceBehavior.STEREOTYPE_NAME);
        return HwResourceServiceBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceBehavior} proxy from a {@link Behavior} stereotyped << HwResourceService_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link HwResourceServiceBehavior} proxy or <i>null</i>.
     */
    @objid ("df13629c-3ac4-4e16-b176-4085247d690b")
    public static HwResourceServiceBehavior instantiate(final Behavior obj) {
        return HwResourceServiceBehavior.canInstantiate(obj) ? new HwResourceServiceBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceBehavior} proxy from a {@link Behavior} stereotyped << HwResourceService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link HwResourceServiceBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7a0be3eb-9881-4c25-9e08-70063bc59006")
    public static HwResourceServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (HwResourceServiceBehavior.canInstantiate(obj))
        	return new HwResourceServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb1548af-d4e7-4a57-b656-d593264e65bb")
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
        HwResourceServiceBehavior other = (HwResourceServiceBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("4de2d196-61e0-4389-b7ed-5f870190588c")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Behavior_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8b4fb3e-4c61-4264-8a70-b46479f7a6fb")
    public String getHwResourceService_Behavior_consumption() {
        return this.elt.getTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Behavior_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae1f8a23-ab6a-43fd-85fa-61eb8a6fc846")
    public String getHwResourceService_Behavior_dissipation() {
        return this.elt.getTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT);
    }

    @objid ("f6820b00-7e97-468b-ae9a-cfed27b0ef6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Behavior_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c810f8cc-deaa-478d-a501-d8005157b222")
    public void setHwResourceService_Behavior_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Behavior_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81570dbf-c9f8-48ab-8800-fc7496634a36")
    public void setHwResourceService_Behavior_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT, value);
    }

    @objid ("9821b40e-5164-404a-b089-3b7e313b4166")
    protected HwResourceServiceBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("fc44f321-53d6-4be2-9e1a-43c4de627c84")
    public static final class MdaTypes {
        @objid ("e855d96b-3266-4a9b-a51e-6feb039f737d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c47473b-fd51-41f1-aa2c-fc1026bf715b")
        public static TagType HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT;

        @objid ("c440728f-8bb6-4b0b-9448-d07d224f1180")
        public static TagType HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT;

        @objid ("609573c4-dd61-4f27-9159-abec919ec0cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("8eef53ed-a968-45d8-9828-e5cb87f30a54")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("058573d2-df38-405e-94b2-3527a1b9973f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "019e61b8-0ccf-11df-8525-001302895b2b");
            HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "15fe8416-1241-11df-8f55-0014222a9f79");
            HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b5bdc16-1241-11df-8f55-0014222a9f79");
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
