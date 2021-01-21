/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
 * Proxy class to handle a {@link Association} with << HwActuator_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d9cb187b-02ef-4493-873c-6b18af262671")
public class HwActuatorAssociation extends HwIOAssociation {
    @objid ("49d97c81-1cfc-43d0-9db0-d18d1f6be760")
    public static final String STEREOTYPE_NAME = "HwActuator_Association";

    /**
     * Tells whether a {@link HwActuatorAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwActuator_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("afef16de-eefd-4615-aba8-4b53eedc516f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwActuator_Association >> then instantiate a {@link HwActuatorAssociation} proxy.
     * 
     * @return a {@link HwActuatorAssociation} proxy on the created {@link Association}.
     */
    @objid ("a303ee0f-c80a-4af7-9b0f-4cf237a68f60")
    public static HwActuatorAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAssociation.STEREOTYPE_NAME);
        return HwActuatorAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorAssociation} proxy from a {@link Association} stereotyped << HwActuator_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwActuatorAssociation} proxy or <i>null</i>.
     */
    @objid ("1b950d89-3df2-4170-8aba-2af34b819ea5")
    public static HwActuatorAssociation instantiate(final Association obj) {
        return HwActuatorAssociation.canInstantiate(obj) ? new HwActuatorAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorAssociation} proxy from a {@link Association} stereotyped << HwActuator_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwActuatorAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3f34bb11-2b5a-4443-a1cf-81a9cd7934cb")
    public static HwActuatorAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwActuatorAssociation.canInstantiate(obj))
        	return new HwActuatorAssociation(obj);
        else
        	throw new IllegalArgumentException("HwActuatorAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67ef15d6-dfac-4edf-9bcb-e08db8f7fd39")
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
        HwActuatorAssociation other = (HwActuatorAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("f1efe0f2-e506-440a-8bf4-4add9e6a0d77")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("beb32d53-e6e2-4697-ab7d-6d2c3fc3cde5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c66d899f-89c3-40fd-9cc3-5824c15e4457")
    protected HwActuatorAssociation(final Association elt) {
        super(elt);
    }

    @objid ("7312147f-0d51-4a19-af7a-2e96679badad")
    public static final class MdaTypes {
        @objid ("0e243676-1bb4-452e-a27b-eb2add37f6ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a0165c8d-0715-4935-892a-a7ed1ce60ba3")
        private static Stereotype MDAASSOCDEP;

        @objid ("935e025b-a334-43a0-bb82-c17ce9ef8c40")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("98d1a551-ae78-4fef-a15d-2a3e9086b433")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a3740f-c7ac-11df-ad39-001302895b2b");
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
