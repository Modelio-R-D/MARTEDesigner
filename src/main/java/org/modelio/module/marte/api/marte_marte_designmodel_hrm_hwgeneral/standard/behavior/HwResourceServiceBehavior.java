/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwResourceServiceBehavior extends GrServiceBehavior {
    public static final String STEREOTYPE_NAME = "HwResourceService_Behavior";

    public static final String HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE = "HwResourceService_Behavior_consumption";

    public static final String HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE = "HwResourceService_Behavior_dissipation";

    /**
     * Tells whether a {@link HwResourceServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << HwResourceService_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << HwResourceService_Behavior >> then instantiate a {@link HwResourceServiceBehavior} proxy.
     * 
     * @return a {@link HwResourceServiceBehavior} proxy on the created {@link Behavior}.
     */
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
    public static HwResourceServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (HwResourceServiceBehavior.canInstantiate(obj))
        	return new HwResourceServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("HwResourceServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwResourceServiceBehavior other = (HwResourceServiceBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for string property 'HwResourceService_Behavior_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_Behavior_consumption() {
        return this.elt.getTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResourceService_Behavior_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResourceService_Behavior_dissipation() {
        return this.elt.getTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResourceService_Behavior_consumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_Behavior_consumption(final String value) {
        this.elt.putTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwResourceService_Behavior_dissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResourceService_Behavior_dissipation(final String value) {
        this.elt.putTagValue(HwResourceServiceBehavior.MdaTypes.HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT, value);
    }

    protected HwResourceServiceBehavior(final Behavior elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRESOURCESERVICE_BEHAVIOR_CONSUMPTION_TAGTYPE_ELT;

        public static TagType HWRESOURCESERVICE_BEHAVIOR_DISSIPATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
