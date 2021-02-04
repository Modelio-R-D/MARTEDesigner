/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("050984f6-2ded-410e-80b6-0d5162fc9aaf")
    public static final String STEREOTYPE_NAME = "HwResourceService_Behavior";

    @objid ("a0dadef8-9a25-47c2-b11f-105f09d13501")
    public static final String HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE = "HwResourceService_Behavior_consumption";

    @objid ("b971e6e8-c8d0-4cc4-bb9a-ca56c3ebfb74")
    public static final String HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE = "HwResourceService_Behavior_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << HwResourceService_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("270ce93b-066d-43fb-9d29-601e4f264d1d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << HwResourceService_Behavior >> then instantiate a {@link HwResourceServiceBehavior} proxy.
     * 
     * @return a {@link HwResourceServiceBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("9f28370e-06c5-4735-b577-79aa554a5035")
    public static HwResourceServiceBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceBehavior.STEREOTYPE_NAME);
        return HwResourceServiceBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceServiceBehavior} proxy from a {@link Behavior} stereotyped << HwResourceService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link HwResourceServiceBehavior} proxy or <i>null</i>.
     */
    @objid ("988a3342-428f-4a6b-b8b8-2f7f76cd6fdc")
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
    @objid ("86317312-73cd-4568-8fa4-cfd59b831768")
    public static HwResourceServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (HwResourceServiceBehavior.canInstantiate(obj))
        	return new HwResourceServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8a554bc2-99de-4e54-8909-f00a7e0c6d1c")
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
    @objid ("7500527e-f848-4e03-a332-fc9b4a4d548d")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Behavior_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e82c919-8d88-477c-bd81-e8a9682b2e0c")
    public String getHwResourceService_Behavior_consumption() {
        return this.elt.getTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Behavior_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c33e1a4-5ae1-43a0-af51-9173e6df2c1a")
    public String getHwResourceService_Behavior_dissipation() {
        return this.elt.getTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT);
    }

    @objid ("98e6c87d-42b6-4465-9014-0afe2c52ef4f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Behavior_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d22be01-b35b-41bb-a7cb-e349863a7738")
    public void setHwResourceService_Behavior_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Behavior_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4dcba38b-ab3f-474f-8a0c-72ee9363f2a6")
    public void setHwResourceService_Behavior_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT, value);
    }

    @objid ("ed2d83e7-40eb-4105-b5f1-c5c8c2bdf0f9")
    protected HwResourceServiceBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("fc44f321-53d6-4be2-9e1a-43c4de627c84")
    public static final class MdaTypes {
        @objid ("29a7ace1-8533-433c-abec-250ee43b3cae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8094dfc6-2ee8-4e8e-95f0-05e7b8f36823")
        public static TagType HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT;

        @objid ("592ff836-ada0-48b6-9bfb-79111ef4ba5d")
        public static TagType HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT;

        @objid ("bb1cc588-e30f-4979-83af-8c3554c61fcb")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d3a2fc1-93cf-48bd-9f57-d3f0b299ab4e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9a13c8a-7d27-491e-824d-9d62ee354ae9")
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
